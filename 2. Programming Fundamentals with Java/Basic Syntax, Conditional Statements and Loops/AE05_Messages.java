import java.util.Scanner;

public class AE05_Messages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int typings = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= typings ; i++) {
            int input = Integer.parseInt(scanner.nextLine());
            if (input != 0) {
                int numberOfDigits = 0;
                int inputCopy = input;
                while (inputCopy != 0) {
                    numberOfDigits++;
                    inputCopy /= 10;
                }
                int mainDigit = input % 10;
                int offset = 0;
                if (mainDigit != 0) {
                    offset = (mainDigit - 2) * 3;
                }
                if (mainDigit == 8 || mainDigit == 9) {
                    offset += 1;
                }
                int letterIndex = offset + numberOfDigits - 1;
                char a = (char) ('a' + letterIndex);
                System.out.print(a);
            } else {
                System.out.print(" ");
            }
        }
    }
}
