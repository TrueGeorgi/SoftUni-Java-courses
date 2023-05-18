import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class AE01_UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int spins = Integer.parseInt(scanner.nextLine());

        Set<String> usernames = new LinkedHashSet<>();

        for (int i = 0; i < spins; i++) {
            String input = scanner.nextLine();
            usernames.add(input);
        }

        for (String username : usernames) {
            System.out.println(username);
        }
    }
}
