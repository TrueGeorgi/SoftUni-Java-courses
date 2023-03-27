import java.util.Scanner;

public class A02_Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int dev = 0;

        if (number % 10 == 0) {
            dev = 10;
        } else if (number % 7 == 0) {
            dev = 7;
        } else if (number % 6 == 0) {
            dev = 6;
        } else if (number % 3 == 0) {
            dev = 3;
        } else if (number % 2 == 0) {
            dev = 2;
        }
        if (dev != 0) {
            System.out.printf("The number is divisible by %d", dev);
        } else {
            System.out.println("Not divisible");
        }
    }
}
