import java.util.Arrays;
import java.util.Scanner;

public class A04_SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] rowsAndColumns = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows = rowsAndColumns[0];
        int columns = rowsAndColumns[1];

        int[][] numbers = new int[rows][columns];
        int sum = 0;

        for (int i = 0; i < rows; i++) {
            numbers[i] = Arrays.stream(scanner.nextLine().split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            for (int j = 0; j < numbers[i].length; j++) {
                sum += numbers[i][j];
            }
        }
        System.out.println(rows);
        System.out.println(columns);
        System.out.println(sum);
    }
}
