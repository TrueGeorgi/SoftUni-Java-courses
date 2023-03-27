import java.util.Scanner;

public class LeftAndRightSum_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputNumbers = Integer.parseInt(scanner.nextLine());
        int sum1 = 0;
        int sum2 = 0;

      for (int i = 1; i <= inputNumbers; i++) {
          int number = Integer.parseInt(scanner.nextLine());
          sum1 += number;
      }
        for (int i = 1; i <= inputNumbers; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            sum2 += number;
        }
        if (sum1 == sum2) {
            System.out.printf("Yes, sum = %d", sum2);
        } else {
            int diff = sum1 - sum2;
            System.out.printf("No, diff = %d", Math.abs(diff));
        }
    }
}
