import java.util.Arrays;
import java.util.Scanner;

public class A01_03_IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        char[][] matrixOne = new char[rows][columns];

        String[] stringBeforeChar;

        for (int i = 0; i < rows; i++) {
            stringBeforeChar = scanner.nextLine().split("\\s+");
            for (int j = 0; j < stringBeforeChar.length; j++) {
                matrixOne[i][j] = stringBeforeChar[j].charAt(0);
            }
        }

        char[][] matrixTwo = new char[rows][columns];

        for (int i = 0; i < rows; i++) {
            stringBeforeChar = scanner.nextLine().split("\\s+");
            for (int j = 0; j < stringBeforeChar.length; j++) {
                matrixTwo[i][j] = stringBeforeChar[j].charAt(0);
            }
        }

        for (int r = 0; r < matrixOne.length; r++) {
            for (int c = 0; c < matrixOne[r].length; c++) {
                if (matrixOne[r][c] == matrixTwo[r][c]) {
                    System.out.print(matrixOne[r][c] + " ");
                } else {
                    System.out.print("*" + " ");
                }
            }
            System.out.println();
        }
    }


}
