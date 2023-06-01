import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AE07_FindTheSmallestElement_Solution1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Function<List<Integer>, Integer> smallestNumIndex = list -> {
            int output = -1;
            int minNum = Integer.MAX_VALUE;

            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) <= minNum) {
                    output = i;
                    minNum = list.get(i);
                }
            }
            return output;
        };

        System.out.println(smallestNumIndex.apply(numbers));
    }
}
