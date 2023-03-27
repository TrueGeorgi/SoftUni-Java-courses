import java.util.Scanner;

public class TouristShop_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        double spend = 0;
        int productCount = 0;
            String product = scanner.nextLine();
            while (!product.equals("Stop") && budget >= 0) {
                productCount++;
                double productPrice = Double.parseDouble(scanner.nextLine());
                if (productCount % 3 == 0) {
                    productPrice /= 2;
                }
                spend += productPrice;
                budget -= productPrice;
                if (budget >= 0) {
                    product = scanner.nextLine();
                }
        }
        if (budget < 0) {
            System.out.printf("You don't have enough money!%n");
            System.out.printf("You need %.2f leva!", Math.abs(budget));
        } else {
            System.out.printf("You bought %d products for %.2f leva.", productCount, spend);
        }
    }
}
