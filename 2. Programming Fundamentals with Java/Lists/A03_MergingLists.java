import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class A03_MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstLine = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> secondLine = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String finalResult = loopThroughLists(firstLine, secondLine);;




        System.out.println(finalResult);
    }
    public static String loopThroughLists (List<Integer> first, List<Integer> second) {
        List<Integer> output = new ArrayList<>();
        if (first.size() > second.size()) {
             for (int i = 0; i < second.size(); i++) {
                output.add(first.get(i));
                output.add(second.get(i));
                }
             for (int i = second.size(); i < first.size(); i++) {
                 output.add(first.get(i));
            }
        } else {
            for (int i = 0; i < first.size(); i++) {
                output.add(first.get(i));
                output.add(second.get(i));
            }
            for (int i = first.size(); i < second.size(); i++) {
                output.add(second.get(i));
            }
        }
      String outputString = listInAString(output, " ");
        return outputString;
    }
    public static String listInAString (List<Integer> numbers, String delimiter) {
        String output = "";
        for (int number : numbers) {
            output += number + delimiter;
        }
        return output;
    }
}
