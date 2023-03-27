import java.util.Scanner;

public class A08_FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int one = Integer.parseInt(scanner.nextLine());
        int two = Integer.parseInt(scanner.nextLine());

        double result = factorial(one) / factorial(two);
        System.out.printf("%.2f", result);;
    }
    public static Double factorial (int number) {
        double factorial = number;
        for (int i = number - 1; i >= 1; i--) {
            factorial *= i;
        }
        return factorial;
    }
}
