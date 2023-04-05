import java.text.DecimalFormat;
import java.util.Scanner;

public class AE01_DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String action = scanner.nextLine();
        String input = scanner.nextLine();

        if (action.equals("int")) {
            int inputInt = Integer.parseInt(input);
            System.out.println(input(inputInt));
        } else if (action.equals("real")) {
            double inputDouble = Double.parseDouble(input);
            double output = input(inputDouble);
            System.out.printf("%.2f", output);
        } else if (action.equals("string")) {
            System.out.println(input(input));
        }
    }

    public static int input(int input) {
        input *= 2;
        return input;
    }

    public static double input(double input) {
        input *= 1.5;
        return input;
    }

    public static String input(String input) {
        input = "$" + input + "$";
        return input;
    }
}
