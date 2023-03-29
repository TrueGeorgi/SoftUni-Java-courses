import java.util.Arrays;
import java.util.Scanner;

public class A03_IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        String[][] firstInput = new String[rows][columns];
        String[][] secondInput = new String[rows][columns];

        for (int i = 0; i < rows; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            for (int j = 0; j < input.length; j++) {
                firstInput[i][j] = input[j];
            }
        }

        for (int i = 0; i < rows; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            for (int j = 0; j < input.length; j++) {
                secondInput[i][j] = input[j];
            }
        }

        for (int r = 0; r < firstInput.length; r++) {
            for (int c = 0; c < firstInput[r].length; c++) {
                String first = firstInput[r][c];
                String second = secondInput[r][c];
                if (first.equals(second)) {
                    System.out.print(first + " ");
                } else {
                    System.out.print("*" + " ");
                }
            }
            System.out.println();
        }
    }
}
