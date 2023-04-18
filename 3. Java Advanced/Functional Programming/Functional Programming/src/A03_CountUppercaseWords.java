import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class A03_CountUppercaseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        Predicate<String> startsWithUppercase = n -> Character.isUpperCase(n.charAt(0));

        ArrayDeque<String> output = new ArrayDeque<>();

        Arrays.stream(input)
                .filter(startsWithUppercase)
                .forEach(output::offer);

        System.out.println(output.size());

        while (!output.isEmpty()) {
            System.out.println(output.poll());
        }

    }
}
