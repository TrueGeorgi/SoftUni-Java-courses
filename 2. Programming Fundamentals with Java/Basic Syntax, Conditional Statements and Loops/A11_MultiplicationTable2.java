import java.util.Scanner;

public class A11_MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int multiplier = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        if (multiplier > 10) {
            sum = number * multiplier;
            System.out.printf("%d X %d = %d", number, multiplier, sum);
        } else {
            for (int i = multiplier; i <= 10 ; i++) {
                sum = number * i;
                System.out.printf("%d X %d = %d%n", number, i, sum);
            }
        }
    }
}
