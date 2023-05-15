import java.util.ArrayDeque;
import java.util.Scanner;

public class AE03_MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int commandsCount = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> numbers = new ArrayDeque<>();

        for (int i = 0; i < commandsCount; i++) {
            String command = scanner.nextLine();
            String action = command.split("\\s+")[0];

            switch (action) {
                case "1":
                    int numberToPush = Integer.parseInt(command.split("\\s+")[1]);
                    numbers.push(numberToPush);
                    break;
                case "2":
                    numbers.pop();
                    break;
                case "3":
                    int maxNum = Integer.MIN_VALUE;
                    for (int num : numbers) {
                        if (num > maxNum) {
                            maxNum = num;
                        }
                    }
                    System.out.println(maxNum);
                    break;
            }
        }
    }
}
