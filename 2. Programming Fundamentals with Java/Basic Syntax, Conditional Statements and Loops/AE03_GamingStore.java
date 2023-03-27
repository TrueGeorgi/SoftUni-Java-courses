import java.util.Scanner;

public class AE03_GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = Double.parseDouble(scanner.nextLine());
        double startingBalance = balance;
        String game = scanner.nextLine();
        while (!game.equals("Game Time")) {
            switch (game) {
                case "OutFall 4":
                    if (balance >= 39.99) {
                        balance -= 39.99;
                        System.out.printf("Bought %s%n", game);
                    } else {
                        System.out.println("Too Expensive");
                    }
                    game = scanner.nextLine();
                    break;
                case "CS: OG":
                    if (balance >= 15.99) {
                        balance -= 15.99;
                        System.out.printf("Bought %s%n", game);
                    } else {
                        System.out.println("Too Expensive");
                    }
                    game = scanner.nextLine();
                    break;
                case "Zplinter Zell":
                    if (balance >= 19.99) {
                        balance -= 19.99;
                        System.out.printf("Bought %s%n", game);
                    } else {
                        System.out.println("Too Expensive");
                    }
                    game = scanner.nextLine();
                    break;
                case "Honored 2":
                    if (balance >= 59.99) {
                        balance -= 59.99;
                        System.out.printf("Bought %s%n", game);
                    } else {
                        System.out.println("Too Expensive");
                    }
                    game = scanner.nextLine();
                    break;
                case "RoverWatch":
                    if (balance >= 29.99) {
                        balance -= 29.99;
                        System.out.printf("Bought %s%n", game);
                    } else {
                        System.out.println("Too Expensive");
                    }
                    game = scanner.nextLine();
                    break;
                case "RoverWatch Origins Edition":
                    if (balance >= 39.99) {
                        balance -= 39.99;
                        System.out.printf("Bought %s%n", game);
                    } else {
                        System.out.println("Too Expensive");
                    }
                    game = scanner.nextLine();
                    break;
                default:
                    System.out.println("Not Found");
                    game = scanner.nextLine();
            }
            if (balance == 0) {
                System.out.print("Out of money!");
                break;
            }
        }
        if (game.equals("Game Time") && balance != 0) {
            double spent = startingBalance - balance;
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", spent, balance);
        }
    }
}
