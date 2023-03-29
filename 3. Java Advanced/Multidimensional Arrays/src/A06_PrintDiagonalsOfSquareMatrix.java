import java.util.Arrays;
import java.util.Scanner;

public class A06_PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        int[][] numbers = new int[size][size];

        for (int r = 0; r < size; r++) {
            numbers[r] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
        int[][] output = new int[2][size];

        for (int r = 0; r < numbers.length; r++) {
            output[0][r] = numbers[r][r];
        }
        int counter = 0;
        for (int r = numbers.length - 1; r >= 0; r--) {
            output[1][counter] = numbers[r][counter];
            counter++;
        }

        for (int r = 0; r < output.length; r++) {
            for (int c = 0; c < output[r].length; c++) {
                System.out.print(output[r][c] + " ");
            }
            System.out.println();
        }
    }
}
