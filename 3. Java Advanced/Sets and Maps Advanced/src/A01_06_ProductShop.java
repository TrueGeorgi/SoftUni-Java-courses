import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class A01_06_ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Map<String, Double>> stores = new TreeMap<>();

        String input = scanner.nextLine();

        while (!input.equals("Revision")) {
            String store = input.split(", ")[0];
            String product = input.split(", ")[1];
            double price = Double.parseDouble(input.split(", ")[2]);

            if (!stores.containsKey(store)) {
                stores.put(store, new LinkedHashMap<>());
            }

            stores.get(store).put(product, price);
            input = scanner.nextLine();
        }

        for (Map.Entry<String, Map<String, Double>> entry : stores.entrySet()) {
            System.out.println(entry.getKey() + "->");
            for (Map.Entry<String, Double> entry1 : entry.getValue().entrySet()) {
                System.out.printf("Product: %s, Price: %.1f%n", entry1.getKey(), entry1.getValue());
            }
        }
    }
}
