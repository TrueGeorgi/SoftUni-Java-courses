import java.util.Scanner;

public class ChristmasGift_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int adults = 0;
        int kids = 0;
        while (!input.equals("Christmas")) {
            int age = Integer.parseInt(input);
            if (age <= 16) {
                kids++;
            } else {
                adults++;
            }
            input = scanner.nextLine();
        }
        int moneyToys = kids * 5;
        int moneySweaters = adults * 15;
        System.out.println("Number of adults: " + adults);
        System.out.println("Number of kids: " + kids);
        System.out.printf("Money for toys: %d%n", moneyToys);
        System.out.printf("Money for sweaters: %d", moneySweaters);
    }
}
