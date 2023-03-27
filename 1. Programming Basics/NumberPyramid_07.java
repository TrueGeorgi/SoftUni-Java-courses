import java.util.Scanner;

public class NumberPyramid_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int row = 1;
        int numbersPerRow = 1;
        int counter = 0;
        for (int i = 1; i <= n ; i++) {
            System.out.print(i + " ");
            counter++;
            if (counter == numbersPerRow) {
                System.out.println("");
                counter = 0;
                row++;
                numbersPerRow++;
            }
        }
    }
}
