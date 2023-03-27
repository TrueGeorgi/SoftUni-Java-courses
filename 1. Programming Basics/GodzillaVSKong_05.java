package ConditionalStatementsExercise02;

import java.util.Scanner;

public class GodzillaVSKong_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double filmBudget = Double.parseDouble(scanner.nextLine());
        int fakeActors = Integer.parseInt(scanner.nextLine());
        double clothingPerActor = Double.parseDouble(scanner.nextLine());

        double clothingCost = fakeActors * clothingPerActor;
        double deko = filmBudget * 0.1;
        if (fakeActors > 150) {
            clothingCost *= 0.9;
        }
        double totalCost = deko + clothingCost;
        if (totalCost <= filmBudget) {
            double moneyLeft = filmBudget - totalCost;
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", moneyLeft);
        } else {
            double moneyNeeded = totalCost - filmBudget;
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", moneyNeeded);
        }
    }
}
