import java.util.Scanner;

public class A09_Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalPrice = 0;

        int ordersCount = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= ordersCount ; i++) {
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsulsCount = Integer.parseInt(scanner.nextLine());
            double coffeePrice = ((days * capsulsCount) * pricePerCapsule);
            totalPrice += coffeePrice;
            System.out.printf("The price for the coffee is: $%.2f%n", coffeePrice);
        }
        System.out.printf("Total: $%.2f", totalPrice);
    }
}
