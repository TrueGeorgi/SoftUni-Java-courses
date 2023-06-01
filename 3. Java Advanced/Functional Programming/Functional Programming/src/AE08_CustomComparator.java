import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class AE08_CustomComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .toArray(Integer[]::new);

        Comparator<Integer> sortEvenAndOdd = (first, second) -> {
            if (first % 2 == 0 && second % 2 != 0) {
                return -1;
            }
            if (first % 2 != 0 && second % 2 == 0) {
                return 1;
            }

           return first.compareTo(second);
        };

        Arrays.sort(numbers, sortEvenAndOdd);
        Arrays.stream(numbers).forEach(num -> System.out.print(num + " "));
    }
}
