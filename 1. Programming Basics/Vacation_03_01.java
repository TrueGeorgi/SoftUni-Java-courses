import java.util.Scanner;

public class Vacation_03_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double excursionCost = Double.parseDouble(scanner.nextLine());
        double cash = Double.parseDouble(scanner.nextLine());
        int daysCounter = 0;
        int spendCounter = 0;
        while (cash < excursionCost) {
            String action = scanner.nextLine();
            daysCounter++;
            double money = Double.parseDouble(scanner.nextLine());
            if (action.equals("spend")) {
                cash -= money;
                if (cash < 0) {
                    cash = 0;
                }
                spendCounter++;
            } else {
                cash += money;
                spendCounter = 0;
            }
            if (spendCounter == 5) {
                System.out.printf("You can't save the money.%n");
                System.out.printf("%d", daysCounter);
                break;
            }
            if (cash >= excursionCost) {
                System.out.printf("You saved the money for %d days.", daysCounter);
            }
        }
    }
}
