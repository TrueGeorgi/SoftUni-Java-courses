import java.util.Scanner;

public class A12_RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        boolean isSpecialNum = false;
        String trueOrFalse = "";
        for (int i = 1; i <= number; i++) {
            int sum = 0;
            int copyOfI = i;
            while (copyOfI > 0) {
                sum += copyOfI % 10;
                copyOfI = copyOfI / 10;
            }
            isSpecialNum = (sum == 5) || (sum == 7) || (sum == 11);
            if (isSpecialNum) {
                trueOrFalse = "True";
            } else {
                trueOrFalse = "False";
            }
            System.out.printf("%d -> %s%n", i, trueOrFalse);
        }
    }
}
