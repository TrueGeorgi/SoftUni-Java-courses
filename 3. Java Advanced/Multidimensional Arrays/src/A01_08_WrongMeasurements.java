import java.util.Arrays;
import java.util.Scanner;

public class A01_08_WrongMeasurements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[size][];

        for (int i = 0; i < size; i++) {
         matrix[i] = Arrays.stream(scanner.nextLine().split("\\s+"))
                 .mapToInt(Integer::parseInt)
                 .toArray();
        }

        int[] wrongValueDestination = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int wrongRow = wrongValueDestination[0];
        int wrongColumn = wrongValueDestination[1];

        int wrongValue = matrix[wrongRow][wrongColumn];

        int[][] output = new int[size][matrix[0].length];

        for (int r = 0; r < size; r++) {
            for (int c = 0; c < output[r].length; c++) {
                if (matrix[r][c] == wrongValue) {
                    int sum  = sum(matrix, wrongValue, r, c, size);
                    output[r][c] = sum;
                } else {
                    output[r][c] = matrix[r][c];
                }
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < output[0].length; j++) {
                System.out.print(output[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int sum (int[][] matrix, int wrongValue, int row, int column, int size) {
        int upNumber;
        int downNumber;
        int leftNumber;
        int rightNumber;

        // up

        if (row == 0 || matrix[row - 1][column] == wrongValue) {
            upNumber = 0;
        } else {
            upNumber = matrix[row - 1][column];
        }

        // down

        if (row == size - 1 || matrix[row + 1][column] == wrongValue) {
            downNumber = 0;
        } else {
            downNumber = matrix[row + 1][column];
        }

        // left

        if (column == 0 || matrix[row][column - 1] == wrongValue) {
            leftNumber = 0;
        } else {
            leftNumber = matrix[row][column - 1];
        }

        // right

        if (column == matrix[0].length - 1 || matrix[row][column + 1] == wrongValue) {
            rightNumber = 0;
        } else {
            rightNumber = matrix[row][column + 1];
        }

        return upNumber + leftNumber + rightNumber + downNumber;
    }
}
