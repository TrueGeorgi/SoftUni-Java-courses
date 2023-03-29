import java.util.Arrays;
import java.util.Scanner;

public class A05_MaximumSumOf2x2Submatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] rowsAndColumns = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows = rowsAndColumns[0];
        int columns = rowsAndColumns[1];

        int[][] numbers = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            numbers[i] = Arrays.stream(scanner.nextLine().split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        int[][] output = new int[2][2];
        int sum = 0;

        for (int r = 0; r < rows - 1; r++) {
            for (int c = 0; c < columns - 1; c++) {
                int number1 = numbers[r][c];
                int number2 = numbers[r][c+1];
                int number3 = numbers[r+1][c];
                int number4 = numbers [r+1][c+1];
                int currentSum = number1 + number2 + number3 + number4;
                if (currentSum > sum) {
                    sum = currentSum;
                    output[0][0] = number1;
                    output[0][1] = number2;
                    output[1][0] = number3;
                    output[1][1] = number4;
                }
            }
        }
        for (int r = 0; r < output.length; r++) {
            for (int c = 0; c < output[r].length; c++) {
                System.out.print(output[r][c] + " ");
            }
            System.out.println();
        }
        System.out.println(sum);
    }
}
