import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class A2_SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        ArrayDeque<String> digitsAndSigns = new ArrayDeque<>(Arrays.asList(input));

        int sum = 0;
        String symbol = "+";

        while (!digitsAndSigns.isEmpty()) {
            String currentSymbol = digitsAndSigns.pop();

            if (currentSymbol.equals("+") || currentSymbol.equals("-")) {
                symbol = currentSymbol;
            } else {
                switch (symbol) {
                    case "+":
                        sum += Integer.parseInt(currentSymbol);
                        break;
                    case "-":
                        sum -= Integer.parseInt(currentSymbol);
                        break;
                }
            }
        }
        System.out.println(sum);
    }
}
