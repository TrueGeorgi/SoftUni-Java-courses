import java.util.Scanner;

public class AE05_DecryptingMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder output = new StringBuilder();

        int key = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();
            char symbol = input.charAt(0);
            char decrypted = (char) ((int)symbol + key);
            output.append(decrypted);
        }
        System.out.println(output);
    }
}
