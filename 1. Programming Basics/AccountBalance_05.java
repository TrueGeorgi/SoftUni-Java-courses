import java.util.Scanner;

public class AccountBalance_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double sum = 0;
        while (!input.equals("NoMoreMoney")) {
            double numInput = Double.parseDouble(input);
            if (numInput < 0) {
                System.out.println("Invalid operation!");
                break;
            }
            System.out.printf("Increase: %.2f%n", numInput);
            sum += numInput;
            input = scanner.nextLine();
        }
        System.out.printf("Total: %.2f%n", sum);
    }
}
