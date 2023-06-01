import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AE07_FindTheSmallestElement_Solution2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Function<List<Integer>, Integer> smallestNumIndex = list -> Collections.min(numbers);

        int smallest = smallestNumIndex.apply(numbers);

        System.out.println(numbers.lastIndexOf(smallest));
    }
}
