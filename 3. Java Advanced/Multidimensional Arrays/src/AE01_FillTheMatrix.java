import java.util.Arrays;
import java.util.Scanner;

public class AE01_FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

        int size = Integer.parseInt(input[0]);
        String method = input[1];

        int[][] output = new int[size][size];

        if (method.equals("A")) {
            output = A(size);
        } else {
            output = B(size);
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++){
                System.out.print(output[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] A (int size) {
        int num = 1;
        int[][] matrix = new int[size][size];

        for (int c = 0; c < size; c++) {
            for (int r = 0; r < size; r++) {
                matrix[r][c] = num++;
            }
        }
        return matrix;
    }
    public static int[][] B (int size) {
        int num = 1;
        int turn = 1;
        int column = 0;
        int[][] matrix = new int[size][size];

        while (column < size) {
            if (turn % 2 == 0) {
                for (int i = size - 1; i >= 0; i--) {
                    matrix[i][column] = num++;
                }
                turn++;
            } else {
                for (int i = 0; i < size; i++) {
                    matrix[i][column] = num++;
                }
                turn++;
            }
            column++;
        }
        return matrix;
    }
}
