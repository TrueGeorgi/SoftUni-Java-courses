import java.util.Scanner;

public class EqualSumsEvenOddPositions_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        for (int i = first; i <= second; i++) {
            String number = String.valueOf(i);
            int length = number.length();
            int value = i;
            int sumOdd = 0;
            int sumEven = 0;
            for (int j = 1; j <= length; j++) {
                int take = value % 10;
                if (j % 2 == 0) {
                    sumEven += take;
                } else {
                    sumOdd += take;
                }
                value /= 10;
            }
            if (sumEven == sumOdd) {
                System.out.print(i + " ");
            }
        }
    }
}
