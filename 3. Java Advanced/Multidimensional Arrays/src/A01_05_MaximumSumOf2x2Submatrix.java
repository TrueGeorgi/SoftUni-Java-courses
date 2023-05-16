import java.util.Arrays;
import java.util.Scanner;

public class A01_05_MaximumSumOf2x2Submatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] matrixSize = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows = matrixSize[0];
        int columns = matrixSize[1];

        int[][] numbers = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            numbers[i] = Arrays.stream(scanner.nextLine().split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        int[][] bestSubMatrix = new int[2][2];
        int sumBest = Integer.MIN_VALUE;
        int midSum = 0;

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers[i].length - 1; j++) {
                midSum = numbers[i][j] + numbers[i][j+1] + numbers[i+1][j] + numbers[i+1][j+1];
                if (midSum > sumBest) {
                    sumBest = midSum;
                    bestSubMatrix[0][0] = numbers[i][j];
                    bestSubMatrix[0][1] = numbers[i][j+1];
                    bestSubMatrix[1][0] = numbers[i+1][j];
                    bestSubMatrix[1][1] = numbers[i+1][j+1];
                }
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(bestSubMatrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(sumBest);
    }
}
