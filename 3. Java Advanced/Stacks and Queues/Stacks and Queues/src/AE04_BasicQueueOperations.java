import java.util.ArrayDeque;
import java.util.Scanner;

public class AE04_BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String basicInput = scanner.nextLine();

        int toOffer = Integer.parseInt(basicInput.split("\\s+")[0]);
        int toPoll = Integer.parseInt(basicInput.split("\\s+")[1]);
        int toPeek = Integer.parseInt(basicInput.split("\\s+")[2]);

        String[] numbersArr = scanner.nextLine().split("\\s+");

        ArrayDeque<Integer> numbers = new ArrayDeque<>();

        for (int i = 0; i < toOffer; i++) {
            numbers.offer(Integer.parseInt(numbersArr[i]));
        }

        for (int i = 0; i < toPoll; i++) {
            numbers.poll();
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
