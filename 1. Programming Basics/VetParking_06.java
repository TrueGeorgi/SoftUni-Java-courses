import java.util.Scanner;

public class VetParking_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int hoursPerDay = Integer.parseInt(scanner.nextLine());
        double tax = 0;
        for (int i = 1; i <= days; i++) {
            double dailyTax = 0;
            for (int j = 1; j <= hoursPerDay; j++) {
                if (i % 2 == 0 && j % 2 != 0) {
                    tax += 2.5;
                    dailyTax += 2.5;
                } else if (i % 2 != 0 && j % 2 == 0) {
                    tax += 1.25;
                    dailyTax += 1.25;
                } else {
                    tax += 1;
                    dailyTax += 1;
                }
            }
            System.out.printf("Day: %d - %.2f leva%n", i, dailyTax);
        }
        System.out.printf("Total: %.2f leva", tax);
    }
}
