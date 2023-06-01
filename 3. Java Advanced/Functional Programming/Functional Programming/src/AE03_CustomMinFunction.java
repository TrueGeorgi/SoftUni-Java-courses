import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class AE03_CustomMinFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Integer[] input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .toArray(Integer[]::new);

        Function<Integer[], Integer> smallestNum = arr -> Arrays.stream(arr)
                .mapToInt(e -> e)
                .min()
                .getAsInt();

        int minInt = smallestNum.apply(input);
        System.out.println(minInt);
    }
}
