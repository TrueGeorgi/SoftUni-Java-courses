import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class A01_02_SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

        Function<String, Integer> parsingInput = Integer::parseInt;

       List<Integer> numbers = new ArrayList<>();

        for (String num : input) {
            numbers.add(parsingInput.apply(num));
        }

        Function<List<Integer>, Integer> sumTheList = list -> {
            int sum = 0;

            for (int number : numbers) {
                sum += number;
            }
            return sum;
        };

        System.out.println("Count = " + numbers.size());
        System.out.println("Sum = " + sumTheList.apply(numbers));
    }
}
