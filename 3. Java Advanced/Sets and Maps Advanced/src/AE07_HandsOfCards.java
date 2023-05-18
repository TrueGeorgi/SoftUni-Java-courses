import java.util.*;

public class AE07_HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Set<String>> playersHands = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("JOKER")) {

            String name = input.split(":")[0];
            String[] cards = input.split(": ")[1].split(", ");
            if (!playersHands.containsKey(name)) {
                playersHands.put(name, new HashSet<>());
            }

            playersHands.get(name).addAll(List.of(cards));

            input = scanner.nextLine();
        }
        for (Map.Entry<String, Set<String>> entry : playersHands.entrySet()) {
            int sum = 0;
            for (String card : entry.getValue()) {
                char cardColor = card.charAt(card.length() - 1);

                switch (cardColor) {
                    case 'S':
                        sum = sumAdd(4, card, sum);
                        break;
                    case 'H':
                        sum = sumAdd(3, card, sum);
                        break;
                    case 'D':
                        sum = sumAdd(2, card, sum);
                        break;
                    case 'C':
                        sum = sumAdd(1, card, sum);
                        break;
                }
            }
            System.out.printf("%s: %d%n", entry.getKey(), sum);
        }
    }
    public static int sumAdd (int colorBonus, String card, int sum) {
        if (card.length() == 3) {
            sum += 10 * colorBonus;
        } else {
            char cardNum = card.charAt(0);
            switch (cardNum) {
                case 'J':
                    sum += 11 * colorBonus;
                    break;
                case 'Q':
                    sum += 12 * colorBonus;
                    break;
                case 'K':
                    sum += 13 * colorBonus;
                    break;
                case 'A':
                    sum += 14 * colorBonus;
                    break;
                default:
                    sum += Integer.parseInt(String.valueOf(cardNum)) * colorBonus;
            }
        }
        return sum;
    }
}
