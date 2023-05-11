import java.util.ArrayDeque;
import java.util.Scanner;

public class A1_BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String currentUrl = "";

        ArrayDeque<String> pages = new ArrayDeque<>();

        while (!input.equals("Home")) {

            switch (input) {
                case "back":
                    if (pages.isEmpty()) {
                        System.out.println("no previous URLs");
                    } else {
                        currentUrl = pages.pop();
                        System.out.println(currentUrl);
                    }
                    break;
                default:
                    if (currentUrl.length() > 0) {
                        pages.push(currentUrl);
                    }
                    currentUrl = input;
                    System.out.println(currentUrl);
            }

            input = scanner.nextLine();
        }
    }
}
