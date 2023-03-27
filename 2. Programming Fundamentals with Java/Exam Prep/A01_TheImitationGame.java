import java.util.Scanner;

public class A01_TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String message = scanner.nextLine();
        StringBuilder messageSB = new StringBuilder(message);
        String input = scanner.nextLine();

        while (!input.equals("Decode")) {
            String[] decryptedCode = input.split("\\|+");
            String action = decryptedCode[0];
            switch (action) {
                case "Move":
                    int numberOfLetters = Integer.parseInt(decryptedCode[1]);
                    String firstLetters = messageSB.substring(0, numberOfLetters);
                    messageSB.replace(0, numberOfLetters, "");
                    messageSB.append(firstLetters);
                    break;
                case "Insert":
                    int index = Integer.parseInt(decryptedCode[1]);
                    String value = decryptedCode[2];
                    messageSB.insert(index, value);
                    break;
                case "ChangeAll":
                    String substring = decryptedCode[1];
                    String newValue = decryptedCode[2];
                    String currentString = messageSB.toString();
                    currentString = currentString.replace(substring,newValue);
                    messageSB = new StringBuilder(currentString);
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.println("The decrypted message is: " + messageSB);
    }
}
