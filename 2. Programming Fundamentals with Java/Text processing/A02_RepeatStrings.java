import java.util.Scanner;

public class A02_RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        String[] words = scanner.nextLine().split(" ");

        for (String word : words) {
            sb.append(word.repeat(word.length()));
        }
        System.out.println(sb);
    }
}
