import java.util.*;

public class A03_OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().toLowerCase();
        String[] languages = input.split("\\s+");
        Map<String, Integer> countMap = new LinkedHashMap<>();

        for (String word : languages) {
            countMap.putIfAbsent(word, 0);
            countMap.put(word, countMap.get(word) + 1);
        }
       List<String> output = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                output.add(entry.getKey());
            }
        }
        String finalOutput = String.join(", ", output);
        System.out.println(finalOutput);
    }
}
