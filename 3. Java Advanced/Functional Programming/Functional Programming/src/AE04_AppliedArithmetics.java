import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AE04_AppliedArithmetics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arrInt = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        Function<Integer, Integer> add = a -> a + 1;
        Function<Integer, Integer> multiply = m -> m * 2;
        Function<Integer, Integer> subtract = s -> s - 1;
        Consumer<int[]> print = arr -> {
            String result = Arrays.stream(arr)
                    .mapToObj(String::valueOf)
                    .collect(Collectors.joining(" "));
            System.out.println(result);
        };

        String action = scanner.nextLine();

        while (!action.equals("end")) {

            switch (action) {
                case "add":
                   arrInt = Arrays.stream(arrInt).map(add::apply).toArray();
                    break;
                case "multiply":
                    arrInt = Arrays.stream(arrInt).map(multiply::apply).toArray();
                    break;
                case "subtract":
                    arrInt = Arrays.stream(arrInt).map(subtract::apply).toArray();
                    break;
                case "print":
                    print.accept(arrInt);
                    break;
            }

            action = scanner.nextLine();
        }
    }
}
