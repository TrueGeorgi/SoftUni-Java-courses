import java.util.Arrays;
import java.util.Scanner;

public class A01_07_FindTheRealQueen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[][] board = new char[8][8];

        for (int i = 0; i < 8; i++) {
            String line = scanner.nextLine().replace(" ", "");
            for (int j = 0; j < line.length(); j++) {
                board[i][j] = line.charAt(j);
            }
        }

        boolean queenFound = false;

        while (!queenFound) {
            for (int r = 0; r < 8; r++) {
                for (int c = 0; c < 8; c++) {
                    char currentChar = board[r][c];
                    if (currentChar == 'q') {
                        if (validQueen(board, r, c)) {
                            queenFound = true;
                            System.out.println(r + " " + c);
                            break;
                        }
                    }
                }
            }
        }
    }
    public static boolean validQueen(char[][] board, int row, int column) {
        // horizontal
        for (int i = 0; i < 8; i++) {
            if (i == column) {
                continue;
            }

            if (board[row][i] == 'q') {
                return false;
            }
        }
        // vertical

        for (int i = 0; i < 8; i++) {
            if (i == row) {
                continue;
            }

            if (board[i][column] == 'q') {
                return false;
            }
        }
        // diagonal 1

        int diagonalRow = row - 1;
        int diagonalColumn = column - 1;
       while (diagonalRow >= 0 && diagonalColumn >= 0) {
           if (board[diagonalRow][diagonalColumn] == 'q') {
               return false;
           }
           diagonalColumn--;
           diagonalRow--;
       }
        // diagonal 2
         diagonalRow = row + 1;
         diagonalColumn = column + 1;
        while (diagonalRow < 8 && diagonalColumn < 8) {
            if (board[diagonalRow][diagonalColumn] == 'q') {
                return false;
            }
            diagonalColumn++;
            diagonalRow++;
        }
        // diagonal 3
        diagonalRow = row + 1;
        diagonalColumn = column - 1;
        while (diagonalRow < 8 && diagonalColumn >= 0) {
            if (board[diagonalRow][diagonalColumn] == 'q') {
                return false;
            }
            diagonalColumn--;
            diagonalRow++;
        }
        // diagonal 4
        diagonalRow = row - 1;
        diagonalColumn = column + 1;
        while (diagonalRow >= 0 && diagonalColumn < 8) {
            if (board[diagonalRow][diagonalColumn] == 'q') {
                return false;
            }
            diagonalColumn++;
            diagonalRow--;
        }
        return true;
    }
}
