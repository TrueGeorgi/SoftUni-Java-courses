import java.util.Scanner;

public class A05_DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder sbDigits = new StringBuilder();
        StringBuilder sbLetters = new StringBuilder();
        StringBuilder sbSymbols = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (Character.isDigit(currentChar)) {
                sbDigits.append(currentChar);
            } else if (Character.isLetter(currentChar)) {
                sbLetters.append(currentChar);
            } else {
                sbSymbols.append(currentChar);
            }
        }
        System.out.println(sbDigits);
        System.out.println(sbLetters);
        System.out.println(sbSymbols);
    }
}
