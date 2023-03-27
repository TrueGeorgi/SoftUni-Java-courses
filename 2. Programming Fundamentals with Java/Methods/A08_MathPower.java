import java.text.DecimalFormat;
import java.util.Scanner;

public class A08_MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double inputNum = Double.parseDouble(scanner.nextLine());
        int inputPower = Integer.parseInt(scanner.nextLine());

        double result = raisedToGivenPower(inputNum, inputPower);

        System.out.println(new DecimalFormat("0.####").format(result));

    }
    public static double raisedToGivenPower (double number, int power) {
        double outputNum = 1;

        for (int i = 1; i <= power; i++) {
            outputNum *= number;
        }
        return outputNum;
    }
}
