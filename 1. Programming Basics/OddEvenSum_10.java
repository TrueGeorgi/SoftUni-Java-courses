import java.util.Scanner;

public class OddEvenSum_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        int odd = 0;
        int even = 0;
        int counter = 1;

        for (int i = 1; i <= input; i++) {

            int number = Integer.parseInt(scanner.nextLine());
            if (counter % 2 == 0) {
                even += number;
            } else {
                odd += number;
            }
            counter++;
        }
        if (even == odd) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", even);
        } else {
            int diff = odd - even;
            System.out.println("No");
            System.out.printf("Diff = %d", Math.abs(diff));
        }
    }
}
