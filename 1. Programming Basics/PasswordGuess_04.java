package ConditionalStatementsLab02;

import java.util.Scanner;

public class PasswordGuess_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String password = "s3cr3t!P@ssw0rd";

        if (input.equals(password)) {
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong password!");
        }
    }
}
