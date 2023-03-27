import java.util.Scanner;

public class A09_SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int currentNum = 1;

        for (int i = 1; i <= n; i++) {
            sum += currentNum;
            System.out.println(currentNum);
            currentNum += 2;
        }
        System.out.printf("Sum: %d", sum);
    }
}
