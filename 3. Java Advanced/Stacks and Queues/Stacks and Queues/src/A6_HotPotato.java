import java.util.ArrayDeque;
import java.util.Scanner;

public class A6_HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = scanner.nextLine().split("\\s+");

        ArrayDeque<String> players = new ArrayDeque<>();

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
            System.out.println("Removed " + players.poll());
        }
        System.out.println("Last is " + players.poll());
    }
}
