import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AE06_FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> contactList = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("stop")) {

            String email = scanner.nextLine();
            String ending = email.substring(email.length() - 3);
            if (!ending.equals(".us") && !ending.equals(".uk") && !ending.equals("com")) {
                System.out.printf("%s -> %s%n", input, email);
            }

            input = scanner.nextLine();
        }
    }
}
