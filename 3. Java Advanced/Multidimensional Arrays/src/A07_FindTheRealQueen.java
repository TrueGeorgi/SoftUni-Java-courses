import java.util.Arrays;
import java.util.Scanner;

public class A07_FindTheRealQueen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = 8;

        String[][] letters = new String[size][size];

        for (int i = 0; i < size; i++) {
            letters[i] = scanner.nextLine().split("\\s+");
        }

        boolean end = false;
        for (int r = 0; r < size; r++) {
            if (end) {
                break;
            }
            for (int c = 0; c < size; c++) {
                if (letters[r][c].equals("q")) {
                    boolean isSafeQueen = true;
                    for (int i = 0; i < size; i++) {
                        if (i == c) {
                            continue;
                        }
                        if (letters[r][i].equals("q")) {
                            isSafeQueen = false;
                            break;
                        }
                    }
                        for (int i = 0; i < size; i++) {
                            if (i == r) {
                                continue;
                            }
                            if (letters[i][c].equals("q")) {
                                isSafeQueen = false;
                                break;
                            }
                    }
                   int row = r;
                    int column = c;
                    while (row >= 0 && column >= 0) {
                        if (row == r || column == c) {
                            row--;
                            column--;
                            continue;
                        }
                        if (letters[row][column].equals("q")){
                         isSafeQueen = false;
                         break;
                        }
                        row--;
                        column--;
                    }
                    int row1 = r;
                    int column1 = c;
                    while (row1 < size && column1 < size) {
                        if (row1 == r || column1 == c) {
                            row1++;
                            column1++;
                            continue;
                        }
                        if (letters[row1][column1].equals("q")){
                            isSafeQueen = false;
                            break;
                        }
                        row1++;
                        column1++;
                    }
                   int row2 = r;
                    int column2 = c;
                    while (row2 >= 0 && column2 < size) {
                        if (row2 == r || column2 == c) {
                            column2++;
                            row2--;
                            continue;
                        }
                        if (letters[row2][column2].equals("q")) {
                            isSafeQueen = false;
                            break;
                        }
                        column2++;
                        row2--;
                    }
                    row2 = r;
                    column2 = c;
                    while (row2 < size && column2 >= 0) {
                        if (row2 == r || column2 == c) {
                            row2++;
                            column2--;
                            continue;
                        }
                        if (letters[row2][column2].equals("q")) {
                            isSafeQueen = false;
                            break;
                        }
                        column2--;
                        row2++;
                    }
                    if (isSafeQueen) {
                        System.out.println(r + " " + c);
                        end = true;
                        break;
                    }
                }
            }
        }
    }
}
