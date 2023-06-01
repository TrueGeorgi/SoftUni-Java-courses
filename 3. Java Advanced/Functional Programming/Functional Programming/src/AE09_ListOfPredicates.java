import java.util.Arrays;
import java.util.Scanner;
import java.util.function.BiPredicate;

public class AE09_ListOfPredicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int topLimit = Integer.parseInt(scanner.nextLine());

        int[] divisionNumbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int bottomLimit = Arrays.stream(divisionNumbers).max().getAsInt();

        BiPredicate<Integer, Integer> isDivisible = (a,b) -> a % b == 0;

        for (int i = bottomLimit; i <= topLimit; i++) {
            boolean isToPrint = true;

            for (int num : divisionNumbers) {
                if (!isDivisible.test(i, num)) {
                    isToPrint = false;
                    break;
                }
            }
            if (isToPrint) {
                System.out.print(i + " ");
            }
        }
    }
}
