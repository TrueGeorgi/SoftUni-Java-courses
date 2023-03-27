import java.util.Scanner;

public class A01_SignOfIntegerNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = Integer.parseInt(scanner.nextLine());
        positiveOrNegative(inputNumber);
    }
    public static void positiveOrNegative (int number) {
        if (number > 0) {
            System.out.printf("The number %d is positive.", number);
        } else if (number < 0) {
            System.out.printf("The number %d is negative.", number);
        } else {
            System.out.print("The number 0 is zero.");
        }
    }
}
