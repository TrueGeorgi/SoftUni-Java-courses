import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A01_ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] usernames = scanner.nextLine().split(", ");
        List<String> validUsernames = new ArrayList<>();
        for (String currentUsername : usernames) {
            boolean isValid = false;
            boolean containsAll = true;
            boolean lengthMatch = currentUsername.length() >= 3 && currentUsername.length() <= 16;

            for (char symbol : currentUsername.toCharArray()) {
                if (!Character.isLetterOrDigit(symbol) && symbol != '-' && symbol != '_') {
                    containsAll = false;
                    break;
                }

            }
            if (containsAll && lengthMatch) {
                isValid = true;
            }
            if (isValid) {
                validUsernames.add(currentUsername);
            }
        }
        for (String username : validUsernames) {
            System.out.println(username);
        }
    }
}
