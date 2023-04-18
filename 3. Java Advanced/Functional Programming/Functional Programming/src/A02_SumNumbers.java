import java.util.Arrays;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Function;

public class A02_SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Function<String, Integer> parseToInt = Integer::parseInt;

        int[] numbers = Arrays.stream(input.split(", "))
                .mapToInt(parseToInt::apply)
                .toArray();

        int count = (int) Arrays.stream(numbers).count();
        int sum = Arrays.stream(numbers).sum();

        System.out.println("Count = " + count);
        System.out.println("Sum = " + sum);
    }
}
