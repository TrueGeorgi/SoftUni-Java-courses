import java.util.Scanner;

public class A04_Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String calculation = scanner.nextLine();
        int input1 = Integer.parseInt(scanner.nextLine());
        int input2 = Integer.parseInt(scanner.nextLine());

        switch (calculation) {
            case "add":
                add(input1, input2);
                break;
            case "multiply":
                multiply(input1, input2);
                break;
            case "subtract":
                subtract(input1, input2);
                break;
            case "divide":
                divide(input1, input2);
        }

    }
    public static void add (int number1, int number2) {
        System.out.println(number1 + number2);
    }
    public static void multiply (int number1, int number2) {
        System.out.println(number1 * number2);
    }
    public static void subtract (int number1, int number2) {
        System.out.println(number1 - number2);
    }
    public static void divide (int number1, int number2) {
        System.out.println(number1 / number2);
    }
}
