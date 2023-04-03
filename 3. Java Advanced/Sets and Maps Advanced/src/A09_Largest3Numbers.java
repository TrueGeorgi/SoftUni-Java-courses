import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class A09_Largest3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Collections.sort(numbers);

        int count = 3;

        for (int i = numbers.size() - 1; i >= 0; i--) {
            if (count == 0) {
                break;
            }

            System.out.print(numbers.get(i) + " ");

            count--;
        }
    }
}
