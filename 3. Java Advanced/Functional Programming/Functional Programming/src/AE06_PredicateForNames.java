import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

public class AE06_PredicateForNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());

        List<String> names = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        BiPredicate<Integer, Integer> isMatch = (a,b) -> a - b >= 0;

        names.forEach(name -> {
            int nameLength = name.length();
            if (isMatch.test(length, nameLength)) {
                System.out.println(name);
            }
        });
    }
}
