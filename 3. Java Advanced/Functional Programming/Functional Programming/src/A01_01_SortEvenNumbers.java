import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class A01_01_SortEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        numbers.removeIf(n -> n % 2 != 0);

        printNumbers(numbers);

        numbers.sort(Integer::compareTo);

        printNumbers(numbers);
    }

    private static void printNumbers(List<Integer> numbers) {

        List<String> numbersAsString = new ArrayList<>();

        for (int num : numbers) {
            numbersAsString.add(String.valueOf(num));
        }

        System.out.println(String.join(", ", numbersAsString));
    }
}
