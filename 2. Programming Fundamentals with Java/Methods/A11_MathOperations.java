import java.text.DecimalFormat;
import java.util.Scanner;

public class A11_MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double number1 = Double.parseDouble(scanner.nextLine());
        String operator = scanner.nextLine();
        Double number2 = Double.parseDouble(scanner.nextLine());

        System.out.println(new DecimalFormat("0.##").format(sum(number1, operator, number2)));
    }
    public static Double sum (Double num1, String operator, Double num2) {
        double result = 0;
        switch (operator) {
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "+":
                result = num1 + num2;
                break;
        }
        return result;
    }
}
