import java.util.Arrays;
import java.util.Scanner;
import java.util.function.UnaryOperator;

public class A04_AddVAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

        UnaryOperator<Double> vatCalculation = n -> n * 1.2;

        double[] vatPrices = Arrays.stream(input)
                .mapToDouble(Double::parseDouble)
                .map(vatCalculation::apply)
                .toArray();

        System.out.println("Prices with VAT:");

        Arrays.stream(vatPrices).forEach(w -> System.out.printf("%.2f%n", w));
    }
}
