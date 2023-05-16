import java.util.Arrays;
import java.util.Scanner;

public class AE03_DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        int diagonal1 = 0;
        int diagonal2 = 0;

        for (int i = 0; i < size; i++) {
            diagonal1 += matrix[i][i];
        }

        int column = 0;
        for (int r = size - 1; r >= 0; r--) {
            diagonal2 += matrix[r][column++];
        }

        int difference = Math.abs(diagonal1 - diagonal2);
        System.out.println(difference);
    }
}
