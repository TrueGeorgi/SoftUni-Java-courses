import java.util.Arrays;
import java.util.Scanner;

public class A01_02_PositionOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] matrixSize = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows = matrixSize[0];
        int columns = matrixSize[1];

        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        int number = Integer.parseInt(scanner.nextLine());

        boolean found = false;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (number == matrix[i][j]) {
                    System.out.println(i + " " + j);
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("not found");
        }
    }
}
