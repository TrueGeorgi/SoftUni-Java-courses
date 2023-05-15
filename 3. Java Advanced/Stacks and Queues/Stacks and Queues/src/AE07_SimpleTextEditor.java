import java.util.ArrayDeque;
import java.util.Scanner;

public class AE07_SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder text = new StringBuilder();
        int numberOfOperations = Integer.parseInt(scanner.nextLine());

        ArrayDeque<String> lastCommands = new ArrayDeque<>();

        for (int i = 0; i < numberOfOperations; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String action = input[0];

            switch (action) {
                case "1":
                    String newAppend = input[1];
                    lastCommands.push(text.toString());
                    text.append(newAppend);
                    break;
                case "2":
                    int eraseCount = Integer.parseInt(input[1]);
                    lastCommands.push(text.toString());
                    text.delete(text.length() - eraseCount, text.length());
                    break;
                case "3":
                    int index = Integer.parseInt(input[1]);
                    System.out.println(text.charAt(index - 1));
                    break;
                case "4":
                    text = new StringBuilder(lastCommands.pop());
                    break;
            }
        }
    }
}
