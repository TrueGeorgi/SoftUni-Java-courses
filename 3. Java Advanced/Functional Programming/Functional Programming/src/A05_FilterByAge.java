import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class A05_FilterByAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Integer> people = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String newName = input.split(", ")[0];
            int newAge = Integer.parseInt(input.split(", ")[1]);

            people.put(newName, newAge);
        }

        String condition = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String format = scanner.nextLine();


    }
}
