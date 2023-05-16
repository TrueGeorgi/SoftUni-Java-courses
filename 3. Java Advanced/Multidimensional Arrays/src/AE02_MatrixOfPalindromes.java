import java.util.Arrays;
import java.util.Scanner;

public class AE02_MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] size = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows = size[0];
        int columns = size[1];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                char letter1 = (char) (97 + i);
                char letter2 = (char) (97 + j + i);
                String currentString = letter1 + String.valueOf(letter2) + letter1;
                System.out.print(currentString + " ");
            }
            System.out.println();
        }
    }
}
