import java.util.Arrays;
import java.util.Scanner;

public class A08_WrongMeasurements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int[][] numbers = new int[rows][];

        for (int i = 0; i < rows; i++) {
            numbers[i] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        String input = scanner.nextLine();
        int wrongRow = Integer.parseInt(input.split("\\s+")[0]);
        int wrongColumn = Integer.parseInt(input.split("\\s+")[1]);
        int wrongValue = numbers[wrongRow][wrongColumn];
        int[][] output = new int[rows][];
        for (int r = 0; r < numbers.length; r++) {
            output[r] = new int[numbers[r].length];
            for (int c = 0; c < numbers[r].length; c++) {
                int currentNum = numbers[r][c];
                if (currentNum == wrongValue) {
                    int sum = sum(r,c,numbers, wrongValue);
                     output[r][c] = sum;
                } else {
                    output[r][c] = numbers[r][c];
                }
            }
        }
        for (int r = 0; r < output.length; r++) {
            for (int c = 0; c < output[r].length; c++) {
                System.out.print(output[r][c] + " ");
            }
            System.out.println();
        }
    }
    public static int sum (int wrongRow, int wrongColumn, int[][] numbers, int wrongValue) {
        int sum = 0;
        if (wrongRow > 0) {
            if (numbers[wrongRow - 1][wrongColumn] != wrongValue) {
                sum += numbers[wrongRow - 1][wrongColumn];
            }
        }
        if (wrongRow < numbers.length -1) {
            if (numbers[wrongRow + 1][wrongColumn] != wrongValue) {
                sum += numbers[wrongRow + 1][wrongColumn];
            }
        }
        if (wrongColumn > 0) {
            if (numbers[wrongRow][wrongColumn - 1] != wrongValue) {
                sum += numbers[wrongRow][wrongColumn - 1];
            }
        }
        if (wrongColumn < numbers[wrongRow].length - 1) {
            if (numbers[wrongRow][wrongColumn + 1] != wrongValue) {
                sum += numbers[wrongRow][wrongColumn + 1];
            }
        }
        return sum;
    }
}
