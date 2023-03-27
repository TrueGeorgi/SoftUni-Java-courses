import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A03_House_Party {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int commandsNumber = Integer.parseInt(scanner.nextLine());

        List<String> names = new ArrayList<>();

        for (int i = 1; i <= commandsNumber; i++) {
            String command = scanner.nextLine();
            String person = command.split("\\s+")[0];
            if (command.contains("is not going")) {
                if (names.contains(person)) {
                    names.remove(person);
                } else {
                    System.out.printf("%s is not in the list!%n", person);
                }
            } else if (command.contains("is going")) {
                if (!names.contains(person)) {
                    names.add(person);
                } else {
                    System.out.printf("%s is already in the list!%n", person);
                }
            }
        }
        for (String person : names) {
            System.out.println(person);
        }
    }
}
