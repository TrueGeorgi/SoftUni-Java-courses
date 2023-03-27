import java.util.Scanner;

public class A04_CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder output = new StringBuilder();

        String input = scanner.nextLine();
        for (int i = 0; i < input.length(); i++) {
            int charInt = input.charAt(i) + 3;
            char newChar = (char) charInt;
            output.append(newChar);
        }

        System.out.println(output);
    }
}
