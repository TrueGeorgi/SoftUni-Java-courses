import java.util.Scanner;

public class A04_SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int linesThatFollow = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 0; i < linesThatFollow ; i++) {
            char symbol = scanner.nextLine().charAt(0);
            sum += (int) symbol;
        }
        System.out.printf("The sum equals: %d", sum);
    }
}
