import java.util.Arrays;
import java.util.Scanner;

public class A09_PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")) {
            if (palindrome(input)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
            input = scanner.nextLine();
        }
    }
    public static boolean palindrome (String number) {
        boolean palindrome = true;

        int numberInt = Integer.parseInt(number);

        int[] num = new int[number.length()];

        for (int i = number.length() - 1; i >= 0; i--) {
            int newNum = numberInt % 10;
            num[i] = newNum;
            numberInt /= 10;
        }

        for (int i = 0; i < num.length / 2; i++) {
            if (num[i] != num[num.length - 1 - i]) {
                palindrome = false;
                break;
            }
        }
        return palindrome;
    }
}
