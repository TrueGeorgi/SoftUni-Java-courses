import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class A08_AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> input = new ArrayList<>(Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .toList());

        String command = scanner.nextLine();
        while (!command.equals("3:1")) {
            String action = command.split("\\s+")[0];
            switch (action) {
                case "merge":
                    int startIndex = Integer.parseInt(command.split("\\s+")[1]);
                    int endIndex = Integer.parseInt(command.split("\\s+")[2]);
                    if (startIndex < 0 || startIndex > input.size() - 1) {
                        startIndex = 0;
                    }
                    if (endIndex > input.size() - 1 || endIndex < 0) {
                        endIndex = input.size() - 1;
                    }
                    String newString = "";
                    List<Integer> toBeRemoved = new ArrayList<>();
                    for (int i = startIndex; i <= endIndex; i++) {
                        newString += input.get(i);
                        toBeRemoved.add(i);
                    }
                    for (int i = 0; i < toBeRemoved.size(); i++) {
                        input.remove(startIndex);
                    }
                    input.add(startIndex, newString);
                    break;
                case "divide":
                    int index = Integer.parseInt(command.split("\\s+")[1]);
                    int partitions = Integer.parseInt(command.split("\\s+")[2]);
                    String[] partitionsArr = new String[partitions];
                    String toBeDivided = input.get(index);
                    input.remove(index);
                    int partsLength = toBeDivided.length() / partitions;
                    int counter = 0;
                    for (int i = 0; i < partitions; i++) {
                        StringBuilder part = new StringBuilder();
                        for (int j = 0; j < partsLength; j++) {
                            char currentChar = toBeDivided.charAt(counter);
                            part.append(currentChar);
                            counter++;
                        }
                        partitionsArr[i] = String.valueOf(part);
                    }
                    StringBuilder restChar = new StringBuilder();
                    for (int i = toBeDivided.length() - 1; i >= partsLength * partitions ; i--) {
                        char lastChars = toBeDivided.charAt(i);
                        restChar.append(lastChars);
                    }
                    restChar.reverse();
                    partitionsArr[partitionsArr.length - 1] += String.valueOf(restChar);
                    for (int i = 0; i < partitionsArr.length; i++) {
                        input.add(index + i, partitionsArr[i]);
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        for (int i = 0; i < input.size(); i++) {
            System.out.print(input.get(i) + " ");
        }
    }
}
