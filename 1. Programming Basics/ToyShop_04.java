package ConditionalStatementsExercise02;

import java.util.Scanner;

public class ToyShop_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double puzzelPrice = 2.60;
        double dollPrice = 3;
        double teddyBearPrice = 4.1;
        double minionPrice = 8.2;
        double truckPrice = 2;

        double vacation = Double.parseDouble(scanner.nextLine());
        int puzzelsOrdered = Integer.parseInt(scanner.nextLine());
        int dollsOrdered = Integer.parseInt(scanner.nextLine());
        int teddyBearsOrdered = Integer.parseInt(scanner.nextLine());
        int minionsOrdered = Integer.parseInt(scanner.nextLine());
        int trucksOrdered = Integer.parseInt(scanner.nextLine());

        double puzzelsCost = puzzelsOrdered * puzzelPrice;
        double dollsCost = dollsOrdered * dollPrice;
        double teddyBearsCost = teddyBearsOrdered * teddyBearPrice;
        double minionsCost = minionsOrdered * minionPrice;
        double trucksCost = trucksOrdered * truckPrice;

        int totalOrder = puzzelsOrdered + dollsOrdered + teddyBearsOrdered + minionsOrdered + trucksOrdered;
        double totalCost = puzzelsCost + dollsCost + teddyBearsCost + minionsCost + trucksCost;

        if (totalOrder >= 50) {
            totalCost -= totalCost * 0.25;
        }
        double rent = totalCost * 0.1;
        totalCost -= rent;

        if (totalCost >= vacation) {
            double moneyLeft = totalCost - vacation;
            System.out.printf("Yes! %.2f lv left.", moneyLeft);
        } else {
            double neededMoney = vacation - totalCost;
            System.out.printf("Not enough money! %.2f lv needed.", neededMoney);
        }
    }
}
