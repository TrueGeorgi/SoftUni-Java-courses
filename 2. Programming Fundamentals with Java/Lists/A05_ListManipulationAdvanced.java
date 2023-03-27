import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class A05_ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String condition = command.split(" ")[0];
            switch (condition) {
                case "Contains":
                    int numberContains = Integer.parseInt(command.split(" ")[1]);
                    if (numbers.contains(numberContains)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    if (command.split(" ")[1].equals("even")) {
                        for (int i = 0; i < numbers.size(); i++) {
                            if (numbers.get(i) % 2 == 0) {
                                System.out.print(numbers.get(i) + " ");
                            }
                        }
                    } else {
                        for (int i = 0; i < numbers.size(); i++) {
                            if (numbers.get(i) % 2 != 0) {
                                System.out.print(numbers.get(i) + " ");
                            }
                        }
                    }
                    System.out.println();
                    break;
                case "Get":
                    int sum = 0;
                    for (int i = 0; i < numbers.size(); i++) {
                        sum += numbers.get(i);
                    }
                    System.out.println(sum);
                    break;
                case "Filter":
                    filter(command, numbers);
                    break;
            }
            command = scanner.nextLine();
        }
    }
    public static void filter (String input, List<Integer> numbers) {
        String condition = input.split(" ")[1];
        int number = Integer.parseInt(input.split(" ")[2]);
        switch (condition) {
            case "<":
                for (int i = 0; i < numbers.size(); i++) {
                    if (numbers.get(i) < number) {
                        System.out.print(numbers.get(i) + " ");
                    }
                }
                break;
            case ">":
                for (int i = 0; i < numbers.size(); i++) {
                    if (numbers.get(i) > number) {
                        System.out.print(numbers.get(i) + " ");
                    }
                }
                break;
            case ">=":
                for (int i = 0; i < numbers.size(); i++) {
                    if (numbers.get(i) >= number) {
                        System.out.print(numbers.get(i) + " ");
                    }
                }
                break;
            case "<=":
                for (int i = 0; i < numbers.size(); i++) {
                    if (numbers.get(i) <= number) {
                        System.out.print(numbers.get(i) + " ");
                    }
                }
                break;
        }
        System.out.println();
    }
}
