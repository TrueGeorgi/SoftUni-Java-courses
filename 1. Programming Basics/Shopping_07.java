package ConditionalStatementsExercise02;

import java.util.Scanner;

public class Shopping_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int videoCardBought = Integer.parseInt(scanner.nextLine());
        int cpuBought = Integer.parseInt(scanner.nextLine());
        int ramBought = Integer.parseInt(scanner.nextLine());

        int videoCardPrice = 250;
        double videoCardCost = videoCardPrice * videoCardBought;
        double cpuPrice = videoCardCost * 0.35;
        double cpuCost = cpuPrice * cpuBought;
        double ramPrice = videoCardCost * 0.1;
        double ramCost = ramPrice * ramBought;

        double totalCost = ramCost + cpuCost + videoCardCost;

        if (videoCardBought > cpuBought) {
            totalCost *= 0.85;
        }
        if (budget >= totalCost) {
            double moneyLeft = budget - totalCost;
            System.out.printf("You have %.2f leva left!", moneyLeft);
        } else {
            double moneyNeeded = totalCost - budget;
            System.out.printf("Not enough money! You need %.2f leva more!", moneyNeeded);
        }
    }
}
