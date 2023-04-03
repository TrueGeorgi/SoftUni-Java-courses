import java.util.*;
import java.util.stream.Collectors;

public class A03_Voina_NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashSet<Integer> playerOne = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));
        LinkedHashSet<Integer> playerTwo = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));

        int rounds = 50;

        while (rounds-- > 0 && playerOne.size() > 0 && playerTwo.size() > 0) {

            int cardOne = playerOne.iterator().next();
            playerOne.remove(cardOne);
            int cardTwo = playerTwo.iterator().next();
            playerTwo.remove(cardTwo);

            if (cardOne > cardTwo) {
                playerOne.add(cardOne);
                playerOne.add(cardTwo);
            } else if (cardTwo > cardOne) {
                playerTwo.add(cardOne);
                playerTwo.add(cardTwo);
            }
        }
        if (playerOne.size() > playerTwo.size()) {
            System.out.println("First player win!");
        } else  if (playerTwo.size() > playerOne.size()) {
           System.out.println("Second player win!");
        } else {
            System.out.println("Draw!");
        }
    }
}
