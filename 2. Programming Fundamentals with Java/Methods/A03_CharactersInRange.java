import java.util.Scanner;

public class A03_CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char first = scanner.nextLine().charAt(0);
        char second = scanner.nextLine().charAt(0);

        if (first < second) {
            outputBetweenChars(first, second);
        } else {
            outputBetweenChars(second, first);
        }
    }
    public static void outputBetweenChars (char one, char two) {
        char currentChar = 1;
        for (int i = one + 1; i < two; i++) {
            currentChar = (char) i;
            System.out.print(currentChar + " ");
        }
    }
}
