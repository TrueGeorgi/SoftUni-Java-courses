import java.util.ArrayDeque;
import java.util.Scanner;

public class A4_MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ArrayDeque<Integer> indexBrackets = new ArrayDeque<>();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar == '(') {
                indexBrackets.push(i);
            } else if (currentChar == ')'){
                int startingIndex = indexBrackets.pop();
                String output = input.substring(startingIndex, i + 1);
                System.out.println(output);
            }
        }
    }
}
