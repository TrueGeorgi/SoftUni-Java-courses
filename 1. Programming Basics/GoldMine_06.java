import java.util.Scanner;

public class GoldMine_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int locations = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= locations ; i++) {
            double expectedAverageAmount = Double.parseDouble(scanner.nextLine());
            int daysAtLocation = Integer.parseInt(scanner.nextLine());
            double locationGold = 0;
            for (int j = 1; j <= daysAtLocation ; j++) {
                double goldPerDay = Double.parseDouble(scanner.nextLine());
                locationGold += goldPerDay;
            }
            double averageIncome = locationGold / daysAtLocation;
            if (averageIncome >= expectedAverageAmount) {
                System.out.printf("Good job! Average gold per day: %.2f.%n", averageIncome);
            } else {
                double needed = expectedAverageAmount - averageIncome;
                System.out.printf("You need %.2f gold.%n", needed);
            }
        }
    }
}
