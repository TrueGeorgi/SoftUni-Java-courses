import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class A01_03_Voina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] playerOneInput = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] playerTwoInput = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        Set<Integer> playerOne = fillIn(playerOneInput);
        Set<Integer> playerTwo = fillIn(playerTwoInput);

        int rounds = 1;

        while (rounds++ <= 50 && !playerOne.isEmpty() && !playerTwo.isEmpty()) {

            int cardPlayerOne = playerOne.iterator().next();
            playerOne.remove(cardPlayerOne);
            int cardPlayerTwo = playerTwo.iterator().next();
            playerTwo.remove(cardPlayerTwo);

            if (cardPlayerOne > cardPlayerTwo) {
                playerOne.add(cardPlayerOne);
                playerOne.add(cardPlayerTwo);
            } else if (cardPlayerTwo > cardPlayerOne) {
                playerTwo.add(cardPlayerOne);
                playerTwo.add(cardPlayerTwo);
            }
        }
        if (playerOne.size() > playerTwo.size()) {
            System.out.println("First player win!");
        } else if (playerTwo.size() > playerOne.size()) {
            System.out.println("Second player win!");
        } else {
            System.out.println("Draw!");
        }

    }
    public static Set<Integer> fillIn (int[] input) {
        Set<Integer> deck = new LinkedHashSet<>();

        for (int i = 0; i < input.length; i++) {
            deck.add(input[i]);
        }

        return deck;
    }
}
