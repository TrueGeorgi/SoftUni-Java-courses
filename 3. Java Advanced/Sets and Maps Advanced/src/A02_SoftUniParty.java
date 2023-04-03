import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class A02_SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Set<String> vip = new TreeSet<>();
        Set<String> regular = new TreeSet<>();

        while (!input.equals("PARTY")) {

            boolean isDigit = Character.isDigit(input.charAt(0));
            boolean action = isDigit ? vip.add(input) : regular.add(input);

            input = scanner.nextLine();
        }
        input = scanner.nextLine();

        while (!input.equals("END")) {
            vip.remove(input);
            regular.remove(input);
            input = scanner.nextLine();
        }
        System.out.println(vip.size() + regular.size());
        vip.forEach(System.out::println);
        regular.forEach(System.out::println);
    }
}
