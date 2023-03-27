import java.util.ArrayDeque;
import java.util.Scanner;

public class A05_PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        ArrayDeque<String> docs = new ArrayDeque<>();
        while (!input.equals("print")) {
            if (input.equals("cancel")) {
                if (docs.isEmpty()) {
                    System.out.println("Printer is on standby");
                } else {
                    String canceled = docs.poll();
                    System.out.printf("Canceled %s%n", canceled);
                }
            } else {
                docs.offer(input);
            }
            input = scanner.nextLine();
        }
        while (!docs.isEmpty()) {
            System.out.println(docs.poll());
        }
    }
}
