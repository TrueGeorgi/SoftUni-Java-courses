import java.util.Scanner;

public class A05_Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int amount = Integer.parseInt(scanner.nextLine());

        endPrice(product, amount);
    }
    public static void endPrice (String product, int amount) {
        double coffeePrice = 1.5;
        double waterPrice = 1;
        double cokePrice = 1.4;
        double snacksPrice = 2;
        double finalPrice = 0;

        switch (product) {
            case "coffee":
                finalPrice = amount * coffeePrice;
                break;
            case "water":
                finalPrice = amount * waterPrice;
                break;
            case "coke":
                finalPrice = amount * cokePrice;
                break;
            case "snacks":
                finalPrice = amount * snacksPrice;
                break;
        }

        System.out.printf("%.2f", finalPrice);
    }
}
