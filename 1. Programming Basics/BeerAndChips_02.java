import java.util.Scanner;

public class BeerAndChips_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        double budget = Double.parseDouble(scanner.nextLine());
        int beers = Integer.parseInt(scanner.nextLine());
        int packsChips = Integer.parseInt(scanner.nextLine());

        double costBeers = beers * 1.2;
        double costChips = Math.ceil(packsChips * (costBeers * 0.45));
        double totalSpend = costBeers + costChips;
        double levaDifference = budget - totalSpend;

        if (budget >= totalSpend) {
            System.out.printf("%s bought a snack and has %.2f leva left.", name, levaDifference);
        } else {
            System.out.printf("%s needs %.2f more leva!", name, Math.abs(levaDifference));
        }
    }
}
