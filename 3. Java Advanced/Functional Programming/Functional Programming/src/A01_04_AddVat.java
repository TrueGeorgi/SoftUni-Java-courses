import java.util.Arrays;
import java.util.Scanner;
import java.util.function.UnaryOperator;

public class A01_04_AddVat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numbers = Arrays.stream(scanner.nextLine().split(", "))
                .mapToDouble(Double::parseDouble)
                .toArray();

        UnaryOperator<Double> vatCalculator = n -> n * 1.2;

        System.out.println("Prices with VAT:");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = vatCalculator.apply(numbers[i]);
            System.out.printf("%.2f%n", numbers[i]);
        }
    }
}
