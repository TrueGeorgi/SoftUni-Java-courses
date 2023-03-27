import java.util.ArrayDeque;
import java.util.Scanner;

public class A04_MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        ArrayDeque<Integer> positionBrackets = new ArrayDeque<>();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar == '(') {
                positionBrackets.push(i);
            } else if (currentChar == ')' && !positionBrackets.isEmpty()) {
                String output = input.substring(positionBrackets.pop(), i+1);
                System.out.println(output);
            }
        }
    }
}
