import java.util.Scanner;

public class A06_ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder output = new StringBuilder();
        char saved = '\0';

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar != saved) {
                output.append(currentChar);
                saved = currentChar;
            }
        }
        System.out.println(output);
    }
}
