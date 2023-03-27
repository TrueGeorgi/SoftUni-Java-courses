import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class A02_AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, Integer> collection = new LinkedHashMap<>();

        while (!input.equals("stop")) {
            int quantity = Integer.parseInt(scanner.nextLine());
            String resource = input;

            if (!collection.containsKey(resource)) {
                collection.put(resource, quantity);
            } else {
                collection.put(resource, collection.get(resource) + quantity);
            }
            input = scanner.nextLine();
        }
        collection.entrySet().forEach(entry -> System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue()));
    }
}
