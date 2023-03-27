import java.util.Scanner;

public class A05_Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = "";
        char letter;
        int count = 0;

        for (int i = 0; i < username.length() ; i++) {
            letter = username.charAt(i);
            password = letter + password;
        }
        String passwordInput = scanner.nextLine();
        boolean match = false;
        while (!match) {
            if (passwordInput.equals(password)) {
                System.out.printf("User %s logged in.", username);
                match = true;
            } else {
                count++;
                if (count == 4) {
                    System.out.printf("User %s blocked!", username);
                    break;
                } else {
                    System.out.println("Incorrect password. Try again.");
                    passwordInput = scanner.nextLine();
                }
            }
        }
    }
}
