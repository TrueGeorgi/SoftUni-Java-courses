import java.util.ArrayDeque;
import java.util.Scanner;

public class A02_SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        ArrayDeque<Integer> num = new ArrayDeque<>();
        num.offer(Integer.parseInt(input[0]));
        for (int i = 1; i < input.length; i += 2) {
            String calculation = input[i];
            int firstNum = num.poll();
            int number = Integer.parseInt(input[i+1]);
            int sum = 0;
            if (calculation.equals("+")) {
                sum = firstNum + number;
            } else {
                sum = firstNum - number;
            }
            num.offer(sum);
        }
        System.out.println(num.poll());
    }
}
