import java.util.Scanner;

public class FamilyTrip_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        double pricePerNight = Double.parseDouble(scanner.nextLine());
        int percentExtraCosts = Integer.parseInt(scanner.nextLine());

        if (nights > 7) {
            pricePerNight *= 0.95;
        }
        budget -= budget * (percentExtraCosts * 1.0 / 100);
        double totalPriceNights = nights * pricePerNight;
        double finalBudget = budget - totalPriceNights;

        if (finalBudget >= 0) {
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", Math.abs(finalBudget));
        } else {
            System.out.printf("%.2f leva needed.", Math.abs(finalBudget));
        }

    }
}
