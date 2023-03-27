import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class A02_ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            List<String> actionList = Arrays
                    .stream(input.split(" "))
                    .collect(Collectors.toList());

            if (actionList.get(0).equals("Delete")) {
                int toBeRemoved = Integer.parseInt(actionList.get(1));
                numbers.removeAll(List.of(toBeRemoved));
            } else {
                int position = Integer.parseInt(actionList.get(2));
                int number = Integer.parseInt(actionList.get(1));
                numbers.add(position, number);
            }
            input = scanner.nextLine();
        }
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
