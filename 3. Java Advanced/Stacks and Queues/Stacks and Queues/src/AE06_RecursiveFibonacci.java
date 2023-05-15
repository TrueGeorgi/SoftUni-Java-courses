import java.util.ArrayDeque;
import java.util.Scanner;

public class AE06_RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long length = Long.parseLong(scanner.nextLine()) + 1;

        if (length <= 2) {
            System.out.println(1);
        } else {
            length -= 2;
            ArrayDeque<Long> numbers = new ArrayDeque<>();
            numbers.push(1L);
            numbers.push(1L);

            while (length > 0) {
                long num1 = numbers.pop();
                long num2 = numbers.pop();
                long num3 = num1 + num2;

                numbers.push(num2);
                numbers.push(num1);
                numbers.push(num3);

                length--;
            }
            System.out.println(numbers.pop());
        }
    }
}
