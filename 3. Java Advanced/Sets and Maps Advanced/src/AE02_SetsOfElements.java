import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class AE02_SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        Set<Integer> setOne = new LinkedHashSet<>();

        for (int i = 0; i < n; i++) {
            setOne.add(Integer.parseInt(scanner.nextLine()));
        }
        Set<Integer> setTwo = new LinkedHashSet<>();

        for (int i = 0; i < m; i++) {
            setTwo.add(Integer.parseInt(scanner.nextLine()));
        }

        setOne.retainAll(setTwo);

        for (int num : setOne) {
            System.out.print(num + " ");
        }

    }
}
