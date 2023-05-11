import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Scanner;

public class A7_MathPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = scanner.nextLine().split("\\s+");

        PriorityQueue<String> players = new PriorityQueue<>();

        int count = 1;

        for (int i = 0; i < names.length; i++) {
            players.offer(names[i]);
        }

        int hotPotato = Integer.parseInt(scanner.nextLine());

        while (players.size() > 1) {
            String playerWithPotato;
            for (int i = 1; i < hotPotato; i++) {
                playerWithPotato = players.poll();
                players.offer(playerWithPotato);
            }

            if (isPrime(count)) {
                System.out.println("Prime " + players.peek());
            } else {
                System.out.println("Removed " + players.poll());
            }
            count++;
        }
        System.out.println("Last is " + players.poll());
    }
    public static boolean isPrime (int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
