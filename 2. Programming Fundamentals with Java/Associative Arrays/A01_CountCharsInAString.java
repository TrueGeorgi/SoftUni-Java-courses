import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class A01_CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        input = input.replace(" ", "");
        Map<Character, Integer> symbols = new LinkedHashMap<>();

        for (int i = 0; i < input.length(); i++) {
            char currentSymbol = input.charAt(i);
            if (!symbols.containsKey(currentSymbol)) {
                symbols.put(currentSymbol, 0);
            }
            symbols.put(currentSymbol, symbols.get(currentSymbol) + 1);
        }
        symbols.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}
