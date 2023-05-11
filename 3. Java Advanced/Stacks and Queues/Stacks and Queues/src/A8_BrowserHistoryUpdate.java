import java.util.ArrayDeque;
import java.util.Scanner;

public class A8_BrowserHistoryUpdate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String currentUrl = "";

        ArrayDeque<String> back = new ArrayDeque<>();
        ArrayDeque<String> forward = new ArrayDeque<>();

        while (!input.equals("Home")) {

            switch (input) {
                case "back":
                    if (back.isEmpty()) {
                        System.out.println("no previous URLs");
                    } else {
                        forward.push(currentUrl);
                        currentUrl = back.pop();
                        System.out.println(currentUrl);
                    }
                    break;
                case "forward":
                    if (!forward.isEmpty()) {
                        back.push(currentUrl);
                        currentUrl = forward.pop();
                        System.out.println(currentUrl);
                    } else {
                        System.out.println("no next URLs");
                    }
                    break;
                default:
                    if (currentUrl.length() > 0) {
                        back.push(currentUrl);
                        forward = new ArrayDeque<>();
                    }
                    currentUrl = input;
                    System.out.println(currentUrl);
            }

            input = scanner.nextLine();
        }
    }
}
