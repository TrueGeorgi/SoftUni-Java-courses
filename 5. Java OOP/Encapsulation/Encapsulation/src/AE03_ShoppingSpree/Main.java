package AE03_ShoppingSpree;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] peopleArray = scanner.nextLine().split(";");
        String[] productsArray = scanner.nextLine().split(";");

        Map<String, Person> people = new LinkedHashMap<>();
            Map<String, Product> products = new LinkedHashMap<>();

        for (String person : peopleArray) {
            String name = person.split("=")[0];
            double money = Double.parseDouble(person.split("=")[1]);

            people.put(name, new Person(name, money));
        }

        for (String product : productsArray) {
            String name = product.split("=")[0];
            double cost = Double.parseDouble(product.split("=")[1]);

            products.put(name, new Product(name, cost));
        }

        String command = scanner.nextLine();

        while (!command.equals("END")) {

            String nameCommand = command.split(" ")[0];
            String product = command.split(" ")[1];

            people.get(nameCommand).buyProduct(products.get(product));

            command = scanner.nextLine();
        }

        for (Map.Entry<String, Person> entry : people.entrySet()) {
            System.out.println(entry.getValue().toString());
        }
    }
}
