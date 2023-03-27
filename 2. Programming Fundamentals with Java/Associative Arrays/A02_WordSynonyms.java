import java.util.*;
import java.util.stream.Collectors;

public class A02_WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, ArrayList<String>> wordsMap = new LinkedHashMap<>();

        for (int i = 1; i <= n; i++) {
            String key = scanner.nextLine();
            String value = scanner.nextLine();

            wordsMap.putIfAbsent(key, new ArrayList<>());
            wordsMap.get(key).add(value);
        }
        for (Map.Entry<String, ArrayList<String>> entry : wordsMap.entrySet()) {
            String synonyms = String.join(", ", entry.getValue());
            System.out.printf("%s - %s%n", entry.getKey(), synonyms);
        }
    }
}
