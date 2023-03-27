import java.util.Scanner;

public class CleverLily_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ageLily = Integer.parseInt(scanner.nextLine());
        double priceWashingmaschine = Double.parseDouble(scanner.nextLine());
        int priceToy = Integer.parseInt(scanner.nextLine());
        int toysNumber = 0;
        double moneyInTheBank = 0;
        double giftMoney = 0;
        for (int i = 1; i <= ageLily; i++) {
            if (i % 2 == 0) {
                giftMoney += 10.00;
                moneyInTheBank += giftMoney - 1.00;
            } else {
                toysNumber++;
            }
        }
        int toysValue = toysNumber * priceToy;
        double totalCash = toysValue + moneyInTheBank;
        if (totalCash >= priceWashingmaschine) {
            double leftCash = totalCash - priceWashingmaschine;
            System.out.printf("Yes! %.2f", leftCash);
        } else {
            double neededCash = priceWashingmaschine - totalCash;
            System.out.printf("No! %.2f", neededCash);
        }
    }
}
