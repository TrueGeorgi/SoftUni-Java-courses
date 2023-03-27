import java.util.ArrayDeque;
import java.util.Scanner;

public class A08_BrowserHistoryUpgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        ArrayDeque<String> back = new ArrayDeque<>();
        ArrayDeque<String> forward = new ArrayDeque<>();
        String currentPage = null;
        while (!input.equals("Home")) {
            if (input.equals("back")) {
                if (back.isEmpty()) {
                    System.out.println("no previous URLs");
                } else {
                    String currentURL = back.pop();
                    forward.push(currentPage);
                    currentPage = currentURL;
                    System.out.println(currentURL);
                }
            } else if (input.equals("forward")) {
                if (forward.isEmpty()) {
                    System.out.println("no next URLs");
                } else {
                    String currentURL = forward.pop();
                    System.out.println(currentURL);
                    back.push(currentPage);
                    currentPage = currentURL;
                }
            } else {
                if (currentPage != null) {
                    back.push(currentPage);
                    forward.clear();
                }
                currentPage = input;
                System.out.println(input);
                forward.clear();
            }
            input = scanner.nextLine();
        }
    }
}
