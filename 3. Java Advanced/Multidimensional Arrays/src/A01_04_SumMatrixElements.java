import java.util.Arrays;
import java.util.Scanner;

public class A01_04_SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] matrixSize = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows = matrixSize[0];
        int columns = matrixSize[1];
        int sum = 0;

        System.out.println(rows);
        System.out.println(columns);

        int[][] numbers = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            numbers[i] = Arrays.stream(scanner.nextLine().split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        for (int r = 0; r < numbers.length; r++) {
            for (int c = 0; c < numbers[r].length; c++) {
                sum += numbers[r][c];
            }
        }

        System.out.println(sum);
    }
}
