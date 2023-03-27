import java.util.Scanner;

public class A02_SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        while (number > 0) {
            int singleDigit = number % 10;
            sum += singleDigit;
            number /= 10;
        }

        System.out.println(sum);
    }
}
