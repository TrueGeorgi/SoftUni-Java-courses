import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class AE03_PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int spins = Integer.parseInt(scanner.nextLine());

        Set<String> chemicals = new TreeSet<>();

        for (int i = 0; i < spins; i++) {
            String[] input = scanner.nextLine().split(" ");
            chemicals.addAll(Arrays.asList(input));
        }
        System.out.println(String.join(" ", chemicals));
    }
}
