import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class A06_FindEvensorOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int lower = Integer.parseInt(input.split(" ")[0]);
        int higher = Integer.parseInt(input.split(" ")[1]);
        String action = scanner.nextLine();

        int[] number = IntStream.rangeClosed(lower, higher)
                .toArray();

        Predicate<Integer> isOdd = x -> x % 2 != 0;
        Predicate<Integer> isEven = x -> x % 2 == 0;

        switch (action) {
            case "odd":
                Arrays.stream(number).
                        filter(isOdd::test)
                        .forEach(w -> System.out.print(w + " "));
                break;
            case "even":
                Arrays.stream(number).
                        filter(isEven::test)
                        .forEach(w -> System.out.print(w + " "));
                break;
        }
    }
}
