import java.util.Scanner;

public class FishingBoat_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishermen = Integer.parseInt(scanner.nextLine());
        double boatPrice = 0;
        switch (season) {
            case "Spring":
                boatPrice = 3000;
                break;
            case "Summer":
            case "Autumn":
                boatPrice = 4200;
                break;
            case "Winter":
                boatPrice = 2600;
                break;
        }
        if (fishermen <= 6) {
            boatPrice *= 0.9;
        } else if (fishermen <= 11) {
            boatPrice *= 0.85;
        } else if (fishermen > 11) {
            boatPrice *= 0.75;
        }
        if (fishermen % 2 == 0 && !season.equals("Autumn")) {
            boatPrice *= 0.95;
        }
        if (budget >= boatPrice) {
            double moneyLeft =  budget - boatPrice;
            System.out.printf("Yes! You have %.2f leva left.", moneyLeft);
        } else {
            double moneyNeeded = boatPrice - budget;
            System.out.printf("Not enough money! You need %.2f leva.", moneyNeeded);
        }
    }
}
