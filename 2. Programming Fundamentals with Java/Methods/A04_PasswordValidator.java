import java.util.Scanner;

public class A04_PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine().toLowerCase();

        passwordLegit(password);
    }
    public static void passwordLegit (String input) {
        boolean passwordValid = true;
        if (input.length() < 6 || input.length() > 10) {
            System.out.println("Password must be between 6 and 10 characters");
            passwordValid = false;
        }
        boolean lettersAndDigits = true;
        int digitsNum = 0;
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if ((currentChar >= 97 && currentChar <= 122) || (currentChar >= 48 && currentChar <= 57)) {

            } else {
                lettersAndDigits = false;
            }
            if (currentChar >= 48 && currentChar <= 57) {
                digitsNum++;
            }
        }
        if (!lettersAndDigits) {
            System.out.println("Password must consist only of letters and digits");
            passwordValid = false;
        }
        if (digitsNum < 2) {
            System.out.println("Password must have at least 2 digits");
            passwordValid = false;
        }
        if (passwordValid) {
            System.out.println("Password is valid");
        }
    }
}
