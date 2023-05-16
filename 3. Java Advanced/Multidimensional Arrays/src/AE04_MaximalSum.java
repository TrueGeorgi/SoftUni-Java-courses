import java.util.Arrays;
import java.util.Scanner;

public class AE04_MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] size = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows = size[0];
        int columns = size[1];
        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        int[][] bestMatrix = new int[3][3];
        int bestSum = Integer.MIN_VALUE;

        for (int r = 0; r < rows - 2; r++) {
            for (int c = 0; c < columns - 2; c++) {
                int sum = matrix[r][c] + matrix[r][c+1] + matrix[r][c+2]
                        + matrix[r+1][c] + matrix[r+1][c+1] + matrix[r+1][c+2]
                        + matrix[r+2][c] + matrix[r+2][c+1] + matrix[r+2][c+2];
                if (sum > bestSum) {
                    bestSum = sum;
                    bestMatrix[0][0] = matrix[r][c];
                    bestMatrix[0][1] = matrix[r][c+1];
                    bestMatrix[0][2] = matrix[r][c+2];
                    bestMatrix[1][0] = matrix[r+1][c];
                    bestMatrix[1][1] = matrix[r+1][c+1];
                    bestMatrix[1][2] = matrix[r+1][c+2];
                    bestMatrix[2][0] = matrix[r+2][c];
                    bestMatrix[2][1] = matrix[r+2][c+1];
                    bestMatrix[2][2] = matrix[r+2][c+2];
                }
            }
        }

        System.out.println("Sum = " + bestSum);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(bestMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
