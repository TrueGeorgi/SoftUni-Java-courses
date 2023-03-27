import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class AE02_FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int linesInput = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= linesInput; i++) {
            long num1 = Long.parseLong(scanner.next());
            long num2 = Long.parseLong(scanner.next());
            long biggest = Math.abs(Math.max(num1, num2));
            int sum = 0;
            while (biggest > 0) {
                sum += (biggest % 10);
                biggest /= 10;
            }
            System.out.println(sum);
        }
    }
}
