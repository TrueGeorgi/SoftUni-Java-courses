import java.util.*;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class AE05_ReverseAndExclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int comparator = Integer.parseInt(scanner.nextLine());

        Collections.reverse(numbers);

        BiPredicate<Integer, Integer> isDivisible = (a,c) -> a % c == 0;

        for (int i = 0; i < numbers.size(); i++) {
            if (isDivisible.test(numbers.get(i), comparator)) {
                numbers.remove(i);
                i--;
            } else {
                System.out.print(numbers.get(i) + " ");
            }
        }
    }
}
