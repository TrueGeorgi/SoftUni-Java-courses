import java.util.Scanner;

public class A02_PoundsToDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double dollar = 1.36;
        double pound = Double.parseDouble(scanner.nextLine());
        double finalSum = pound * dollar;

        System.out.printf("%.3f", finalSum);
    }
}
