import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class A06_HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int passes = Integer.parseInt(scanner.nextLine());
        ArrayDeque<String> players = new ArrayDeque<>();
        for (int i = 0; i < input.length; i++) {
            players.offer(input[i]);
        }

        while (players.size() > 1) {

            for (int i = 2; i <=passes; i++) {
                String playerToMove = players.poll();
                players.offer(playerToMove);
            }
            String playerOut = players.poll();
            System.out.println("Removed " + playerOut);
        }
        System.out.println("Last is " + players.poll());
    }
}
