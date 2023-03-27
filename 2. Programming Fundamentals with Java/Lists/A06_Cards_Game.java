import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class A06_Cards_Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> player1 = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> player2 = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        while (player1.size() > 0 && player2.size() > 0) {
            int cardPlayer1 = player1.get(0);
            int cardPlayer2 = player2.get(0);
            player1.remove(0);
            player2.remove(0);
            if (cardPlayer1 > cardPlayer2) {
                player1.add(cardPlayer1);
                player1.add(cardPlayer2);
            } else if (cardPlayer1 < cardPlayer2) {
                player2.add(cardPlayer2);
                player2.add(cardPlayer1);
            }
        }
        if (player1.size() > player2.size()) {
            int sum = 0;
            for (int cards : player1) {
                sum += cards;
            }
            System.out.printf("First player wins! Sum: %d", sum);
        } else {
            int sum = 0;
            for (int cards : player2) {
                sum += cards;
            }
            System.out.printf("Second player wins! Sum: %d", sum);
        }
    }
}
