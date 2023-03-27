import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class A04_ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String commands = scanner.nextLine();

        while (!commands.equals("end")) {
            List<String> commandList = Arrays
                    .stream(commands.split(" "))
                    .collect(Collectors.toList());
            switch (commandList.get(0)) {
                case "Add":
                    int numberAdd = Integer.parseInt(commandList.get(1));
                    numbers.add(numberAdd);
                    break;
                case "RemoveAt":
                    int index = Integer.parseInt(commandList.get(1));
                    numbers.remove(index);
                    break;
                case "Remove":
                    int numberRemove = Integer.parseInt(commandList.get(1));
                    numbers.remove(Integer.valueOf(numberRemove));
                    break;
                case "Insert":
                    int numberInsert = Integer.parseInt(commandList.get(1));
                    int indexInsert = Integer.parseInt(commandList.get(2));
                    numbers.add(indexInsert, numberInsert);
                    break;
            }
            commands = scanner.nextLine();
        }
        String output = "";

        for (int number : numbers) {
            output += number + " ";
        }

        System.out.println(output);
    }
}
