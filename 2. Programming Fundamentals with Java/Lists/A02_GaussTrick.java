import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class A02_GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersInput = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> numbersOutput = new ArrayList<>();

        for (int i = 0; i < numbersInput.size() / 2; i++) {
            int number1 = numbersInput.get(i);
            int number2 = numbersInput.get(numbersInput.size() - 1 - i);
            numbersOutput.add((number1 + number2));
        }
        String output = resultOutput(numbersOutput, " ");
        if (numbersInput.size() % 2 != 0) {
            int getFromList = numbersInput.size() / 2;
            int extraNum = numbersInput.get(getFromList);
            output += extraNum;
        }
        System.out.println(output);

    }
    public static String resultOutput (List<Integer> numbers, String delimiter) {
        String output = "";
        for (int number : numbers) {
            output += number + delimiter;
        }
        return  output;
    }
}
