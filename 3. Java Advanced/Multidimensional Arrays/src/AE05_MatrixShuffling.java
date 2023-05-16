import java.util.Arrays;
import java.util.Scanner;

public class AE05_MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] size = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows = size[0];
        int columns = size[1];
        String[][] matrix = new String[rows][columns];

        for (int i = 0; i < rows; i++) {
            matrix[i] = scanner.nextLine().split("\\s+");
        }

        String[] command = scanner.nextLine().split("\\s+");

        while (!command[0].equals("END")) {
            String action = command[0];
            if (action.equals("swap") && command.length == 5) {
                int row1 = Integer.parseInt(command[1]);
                int col1 = Integer.parseInt(command[2]);
                int row2 = Integer.parseInt(command[3]);
                int col2 = Integer.parseInt(command[4]);

                if (row1 >= 0 && col1 >= 0 && row2 >= 0 && col2 >= 0
                        && row1 < rows && row2 < rows
                        && col1 < columns && col2 < columns) {
                    String num1 = matrix[row1][col1];
                    String num2 = matrix[row2][col2];

                    matrix[row1][col1] = num2;
                    matrix[row2][col2] = num1;

                    for (int r = 0; r < rows; r++) {
                        for (int c = 0; c < columns; c++) {
                            System.out.print(matrix[r][c] + " ");
                        }
                        System.out.println();
                    }

                } else {
                    System.out.println("Invalid input!");
                }
            } else {
                System.out.println("Invalid input!");
            }
            command = scanner.nextLine().split("\\s+");
        }

    }
}
