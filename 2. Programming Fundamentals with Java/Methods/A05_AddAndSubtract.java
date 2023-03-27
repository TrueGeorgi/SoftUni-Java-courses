import java.util.Scanner;

public class A05_AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

        int sumFirstTwo = combinationFirstAndSecond(first, second);
        int result = finalResult(sumFirstTwo, third);
        System.out.println(result);

    }
    public static int combinationFirstAndSecond (int one, int two) {
        int sum = one + two;
        return sum;
    }
    public static int finalResult (int one, int two) {
        int result = one - two;
        return result;
    }
}
