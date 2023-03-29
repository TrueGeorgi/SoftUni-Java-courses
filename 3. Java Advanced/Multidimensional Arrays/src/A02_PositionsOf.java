import java.util.Arrays;
import java.util.Scanner;

public class A02_PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] rowsAndColumns = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int rows = rowsAndColumns[0];
        int columns = rowsAndColumns[1];

        int[][] numbers = new int[rows][columns];

        for (int r = 0; r < rows; r++) {
            int[] input = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            numbers[r] = input;
        }

        int checker = Integer.parseInt(scanner.nextLine());

        boolean notFound = true;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++) {
                int currentInt = numbers[r][c];
                if (currentInt == checker) {
                    System.out.println(r + " " + c);
                    notFound = false;
                }

            }
        }
        if (notFound) {
            System.out.println("not found");
        }
    }
}
