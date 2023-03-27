import java.util.Scanner;

public class A11_RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lostGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int brokenHeadSets = lostGames / 2;
        int brokenMice = lostGames / 3;
        int brokenKeyboards = lostGames / 6;
        int brokenDisplays = lostGames / 12;

        double expenses = (brokenHeadSets * headsetPrice) +
                (brokenMice * mousePrice) +
                (brokenKeyboards * keyboardPrice) +
                (brokenDisplays * displayPrice);
        System.out.printf("Rage expenses: %.2f lv.", expenses);
    }
}
