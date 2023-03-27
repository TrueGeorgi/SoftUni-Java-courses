import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class A09_PokemonDontGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> distances = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int sum = 0;

        while (distances.size() > 0) {
            int index = Integer.parseInt(scanner.nextLine());

            if (index < 0) {
                int element = distances.get(0);
                sum += element;

                distances.set(0, distances.get(distances.size() - 1));

                for (int i = 0; i < distances.size(); i++) {
                    if (distances.get(i) <= element) {
                        int newValue = element + distances.get(i);
                        distances.set(i, newValue);
                    } else {
                        int newValue = distances.get(i) - element;
                        distances.set(i, newValue);
                    }
                }
            }else if (index >= distances.size()) {
                int element = distances.get(distances.size() - 1);
                sum += element;
                distances.set(distances.size() - 1, distances.get(0));

                for (int i = 0; i < distances.size(); i++) {
                    if (distances.get(i) <= element) {
                        int newValue = element + distances.get(i);
                        distances.set(i, newValue);
                    } else {
                        int newValue = distances.get(i) - element;
                        distances.set(i, newValue);
                    }
                }
            } else {
                int element = distances.get(index);
                sum += element;
                distances.remove(index);

                for (int i = 0; i < distances.size(); i++) {
                    if (distances.get(i) <= element) {
                        int newValue = element + distances.get(i);
                        distances.set(i, newValue);
                    } else {
                        int newValue = distances.get(i) - element;
                        distances.set(i, newValue);
                    }
                }
            }
        }
        System.out.println(sum);
    }
}
