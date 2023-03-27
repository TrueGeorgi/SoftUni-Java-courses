import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class A1_RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        List<String> words = Arrays
                .stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());

        int number = -1;

        while (words.size() > 0) {
            number = random.nextInt(words.size());
            System.out.println(words.get(number));
            words.remove(number);
        }
    }
}
