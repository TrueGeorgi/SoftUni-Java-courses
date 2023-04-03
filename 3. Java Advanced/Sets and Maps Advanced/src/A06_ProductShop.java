import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class A06_ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Map<String, Double>> shopsAndProducts = new TreeMap<>();

        while (!input.equals("Revision")) {
            String shop = input.split(",\\s+")[0];
            String product = input.split(",\\s+")[1];
            double price = Double.parseDouble(input.split(",\\s+")[2]);

            if (!shopsAndProducts.containsKey(shop)) {
                shopsAndProducts.put(shop, new LinkedHashMap<>());
            }

            Map<String, Double> productsAndPrice = shopsAndProducts.get(shop);

            productsAndPrice.put(product, price);

            input = scanner.nextLine();
        }
        for (var entry : shopsAndProducts.entrySet()) {
            System.out.printf("%s->%n", entry.getKey());
            for (var entry2 : entry.getValue().entrySet()) {
                System.out.printf("Product: %s, Price: %.1f%n", entry2.getKey(), entry2.getValue());
            }
        }
    }
}
