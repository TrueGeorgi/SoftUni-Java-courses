import java.util.Scanner;

public class A06_MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        if (input.length() % 2 == 0) {
            even(input);
        } else {
            odd(input);
        }

    }
    public static void even (String word) {
        char one = word.charAt(word.length() / 2 - 1);
        char two = word.charAt(word.length() / 2);

        System.out.print(one);
        System.out.print(two);

    }
    public static void odd (String word) {
        char output = word.charAt(word.length() / 2);
        System.out.println(output);
    }
}
