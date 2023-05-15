import java.util.ArrayDeque;
import java.util.Scanner;

public class AE02_BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputScales = scanner.nextLine();

        int toPush = Integer.parseInt(inputScales.split("\\s+")[0]);
        int toPop = Integer.parseInt(inputScales.split("\\s+")[1]);
        int toPeek = Integer.parseInt(inputScales.split("\\s+")[2]);

        String[] numbersArr = scanner.nextLine().split("\\s+");

        ArrayDeque<Integer> numbers = new ArrayDeque<>();

        for (int i = 0; i < toPush; i++) {
            numbers.push(Integer.parseInt(numbersArr[i]));
        }

        for (int i = 0; i < toPop; i++) {
            numbers.pop();
        }

        if (numbers.isEmpty()) {
            System.out.println(0);
        } else if (numbers.contains(toPeek)) {
            System.out.println("true");
        } else {
            int smallest = Integer.MAX_VALUE;
            for (int num : numbers) {
                if (num < smallest) {
                    smallest = num;
                }
            }
            System.out.println(smallest);
        }
    }
}
