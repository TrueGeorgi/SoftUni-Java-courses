import java.util.ArrayDeque;
import java.util.Scanner;

public class A01_BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        ArrayDeque<String> url = new ArrayDeque<>();
        String lastURL = null;

        while (!input.equals("Home")) {
            if (input.equals("back")) {
              if (url.isEmpty()) {
                  System.out.println("no previous URLs");
              } else {
                  String newUrl = url.pop();
                  lastURL = newUrl;
                  System.out.println(newUrl);
              }
            } else {
                if (lastURL != null) {
                    url.push(lastURL);
                }
                lastURL = input;
                System.out.println(input);
            }
            input = scanner.nextLine();
        }
    }
}
