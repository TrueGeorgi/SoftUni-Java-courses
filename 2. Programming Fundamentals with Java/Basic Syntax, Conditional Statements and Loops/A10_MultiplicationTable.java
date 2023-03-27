import java.util.Scanner;

public class A10_MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        int result = 0;

        for (int i = 1; i <= 10 ; i++) {
            result = input * i;
            System.out.printf("%d X %d = %d%n", input, i, result);
        }
    }
}
