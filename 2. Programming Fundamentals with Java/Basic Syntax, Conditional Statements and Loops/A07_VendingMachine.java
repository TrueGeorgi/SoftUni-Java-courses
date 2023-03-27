import java.util.Scanner;

public class A07_VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double moneyInMaschine = 0;
        while (!input.equals("Start")) {
            double coinInput = Double.parseDouble(input);
            if (coinInput == 0.1 || coinInput == 0.2 ||
            coinInput == 0.5 || coinInput == 1 || coinInput == 2) {
                moneyInMaschine += coinInput;
            } else {
                System.out.printf("Cannot accept %.2f%n", coinInput);
            }
            input = scanner.nextLine();
        }
        String product = scanner.nextLine();
        while (!product.equals("End")) {
            switch (product) {
                case "Nuts":
                    if (moneyInMaschine >= 2){
                        System.out.printf("Purchased %s%n", product);
                        moneyInMaschine -= 2;
                        product = scanner.nextLine();
                    } else {
                        System.out.println("Sorry, not enough money");
                        product = scanner.nextLine();
                    }
                    break;
                case "Water":
                    if (moneyInMaschine >= 0.7){
                        System.out.printf("Purchased %s%n", product);
                        moneyInMaschine -= 0.7;
                        product = scanner.nextLine();
                    } else {
                        System.out.println("Sorry, not enough money");
                        product = scanner.nextLine();
                    }
                    break;
                case "Crisps":
                    if (moneyInMaschine >= 1.5){
                        System.out.printf("Purchased %s%n", product);
                        moneyInMaschine -= 1.5;
                        product = scanner.nextLine();
                    } else {
                        System.out.println("Sorry, not enough money");
                        product = scanner.nextLine();
                    }
                    break;
                case "Soda":
                    if (moneyInMaschine >= 0.8){
                        System.out.printf("Purchased %s%n", product);
                        moneyInMaschine -= 0.8;
                        product = scanner.nextLine();
                    } else {
                        System.out.println("Sorry, not enough money");
                        product = scanner.nextLine();
                    }
                    break;
                case "Coke":
                    if (moneyInMaschine >= 1){
                        System.out.printf("Purchased %s%n", product);
                        moneyInMaschine -= 1;
                        product = scanner.nextLine();
                    } else {
                        System.out.println("Sorry, not enough money");
                        product = scanner.nextLine();
                    }
                    break;
                default:
                    System.out.println("Invalid product");
                    product = scanner.nextLine();
            }
        }
        System.out.printf("Change: %.2f", moneyInMaschine);
    }
}
