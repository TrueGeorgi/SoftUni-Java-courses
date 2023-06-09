import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AE04_CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<Character, Integer> symbols = new TreeMap<>();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (!symbols.containsKey(currentChar)) {
                symbols.put(currentChar, 1);
            } else {
                symbols.put(currentChar, symbols.get(currentChar) + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : symbols.entrySet()) {
            System.out.printf("%c: %d time/s%n", entry.getKey(), entry.getValue());
        }
    }
}
