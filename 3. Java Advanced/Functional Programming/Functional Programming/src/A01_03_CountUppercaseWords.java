import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class A01_03_CountUppercaseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        List<String> uppercaseWords = new ArrayList<>();


        Predicate<String> isUppercase = word -> Character.isUpperCase(word.charAt(0));

        for (String currentWord : input) {
            if (isUppercase.test(currentWord)) {
                uppercaseWords.add(currentWord);
            }
        }

        System.out.println(uppercaseWords.size());
        System.out.println(String.join("\n", uppercaseWords));
    }
}
