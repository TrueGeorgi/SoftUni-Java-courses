import java.util.Arrays;
import java.util.Scanner;

public class A09_ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        String[] command = scanner.nextLine().split("\\s+");

        while (!command[0].equals("end")) {
            switch (command[0]) {
                case "swap":
                    int numberSwap1 = Integer.parseInt(command[1]);
                    int numberSwap2 = Integer.parseInt(command[2]);
                    int savedNum = input[numberSwap1];
                    input[numberSwap1] = input[numberSwap2];
                    input[numberSwap2] = savedNum;
                    break;
                case "multiply":
                    int numberMultiply1 = Integer.parseInt(command[1]);
                    int numberMultiply2 = Integer.parseInt(command[2]);
                    input[numberMultiply1] *= input[numberMultiply2];
                    break;
                case "decrease":
                    for (int i = 0; i < input.length; i++) {
                        input[i] -= 1;
                    }
                    break;
            }
            command = scanner.nextLine().split("\\s+");
        }
        for (int i = 0; i < input.length; i++) {
            if (i == input.length - 1) {
                System.out.printf("%d", input[i]);
            } else {
                System.out.printf("%d, ", input[i]);
            }
        }
    }
}
