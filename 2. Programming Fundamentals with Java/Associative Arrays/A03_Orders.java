import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class A03_Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Double> price = new LinkedHashMap<>();
        Map<String, Integer> quantity = new LinkedHashMap<>();

        while (!input.equals("buy")) {
            String newProduct = input.split(" ")[0];
            Double newPrice = Double.parseDouble(input.split(" ")[1]);
            int newQuantity = Integer.parseInt(input.split(" ")[2]);

            if (!price.containsKey(newProduct)) {
                price.put(newProduct, newPrice);
                quantity.put(newProduct, newQuantity);
            } else {
                price.put(newProduct, newPrice);
                quantity.put(newProduct, quantity.get(newProduct) + newQuantity);
            }


            input = scanner.nextLine();
        }

        for (Map.Entry<String, Double> entry : price.entrySet()) {
            double finalPrice = entry.getValue() * quantity.get(entry.getKey());
            System.out.printf("%s -> %.2f%n", entry.getKey(), finalPrice);
        }
    }
}
