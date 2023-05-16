import java.util.Arrays;
import java.util.Scanner;

public class A01_01_CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input1 = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int input1Rows = input1[0];
        int input1Columns = input1[1];

        int[][] arrayOne = new int[input1Rows][input1Columns];

        for (int i = 0; i < input1Rows; i++) {
            arrayOne[i] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        int[] input2 = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int input2Rows = input2[0];
        int input2Columns = input2[1];

        int[][] arrayTwo = new int[input2Rows][input2Columns];

        for (int i = 0; i < input2Rows; i++) {
            arrayTwo[i] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        System.out.println(areEqual(arrayOne, arrayTwo) ? "equal" : "not equal");
    }

    public static boolean areEqual (int[][] firstArray, int[][] secondArray) {
        if (firstArray.length == secondArray.length) {
            for (int i = 0; i < firstArray.length; i++) {
                if (firstArray[i].length == secondArray[i].length) {
                    for (int j = 0; j < firstArray[i].length; j++) {
                        if (firstArray[i][j] != secondArray[i][j]) {
                            return false;
                        }
                    }
                } else {
                    return false;
                }
            }
        } else {
            return false;
        }
        return true;
    }
}
