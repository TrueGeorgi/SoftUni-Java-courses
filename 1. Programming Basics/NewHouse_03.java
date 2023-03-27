import java.util.Scanner;

public class NewHouse_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flowersType = scanner.nextLine();
        int flowersAmount = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double cost = 0;

        switch (flowersType) {
            case "Roses":
                cost = flowersAmount * 5;
                if (flowersAmount > 80) {
                    cost = cost * 0.9;
                }
                break;
            case "Dahlias":
                cost = flowersAmount * 3.8;
                if (flowersAmount > 90) {
                    cost = cost * 0.85;
                }
                break;
            case "Tulips":
                cost = flowersAmount * 2.8;
                if (flowersAmount > 80) {
                    cost = cost * 0.85;
                }
                break;
            case "Narcissus":
                cost = flowersAmount * 3;
                if (flowersAmount < 120) {
                    cost = cost + (cost * 0.15);
                }
                break;
            case "Gladiolus":
                cost = flowersAmount * 2.5;
                if (flowersAmount < 80) {
                    cost = cost + (cost * 0.2);
                }
                break;
        }
        if (budget >= cost) {
            double moneyLeft = budget - cost;
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",
                    flowersAmount,
                    flowersType,
                    moneyLeft);
        } else {
            double moneyNeeded = cost - budget;
            System.out.printf("Not enough money, you need %.2f leva more.", moneyNeeded);
        }
    }
}
