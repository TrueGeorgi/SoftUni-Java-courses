import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class A04_ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String command = input.split(" ")[0];
            switch (command) {
                case "Add":
                    int numberAdd = Integer.parseInt(input.split(" ")[1]);
                    numbers.add(numberAdd);
                    break;
                case "Insert":
                    int numberInsert = Integer.parseInt(input.split(" ")[1]);
                    int indexInsert = Integer.parseInt(input.split(" ")[2]);
                    if (indexInsert >= 0 && indexInsert < numbers.size()) {
                        numbers.add(indexInsert, numberInsert);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Remove":
                    int indexRemove = Integer.parseInt(input.split(" ")[1]);
                    if (indexRemove >= 0 && indexRemove < numbers.size()) {
                        numbers.remove(indexRemove);
                    }else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Shift":
                    String direction = input.split(" ")[1];
                    int count = Integer.parseInt(input.split(" ")[2]);
                    if (direction.equals("left")) {
                        for (int i = 1; i <= count ; i++) {
                            int firstDigit = numbers.get(0);
                            numbers.add(firstDigit);
                            numbers.remove(0);
                        }
                    } else {
                        for (int i = 1; i <= count ; i++) {
                            int lastDigit = numbers.get(numbers.size() - 1);
                            numbers.add(0, lastDigit);
                            numbers.remove(numbers.size() - 1);
                        }
                    }
                    break;
            }

            input = scanner.nextLine();
        }
        System.out.println(numbers.toString()
                .replace("[", "")
                .replace("]", "")
                .replace(",", ""));
    }
}
