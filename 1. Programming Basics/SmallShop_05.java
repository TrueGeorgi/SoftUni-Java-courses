import java.util.Scanner;

public class SmallShop_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double sum = 0;

        switch (product) {
            case "coffee":
                switch (city) {
                    case "Sofia":
                        sum = quantity * 0.5;
                        break;
                    case "Plovdiv":
                        sum = quantity * 0.4;
                        break;
                    case "Varna":
                        sum = quantity * 0.45;
                        break;
                }
                break;
            case "water":
                switch (city) {
                    case "Sofia":
                        sum = quantity * 0.8;
                        break;
                    case "Plovdiv":
                        sum = quantity * 0.7;
                        break;
                    case "Varna":
                        sum = quantity * 0.7;
                        break;
                }
                break;
            case "beer":
                switch (city) {
                    case "Sofia":
                        sum = quantity * 1.2;
                        break;
                    case "Plovdiv":
                        sum = quantity * 1.15;
                        break;
                    case "Varna":
                        sum = quantity * 1.1;
                        break;
                }
                break;
            case "sweets":
                switch (city) {
                    case "Sofia":
                        sum = quantity * 1.45;
                        break;
                    case "Plovdiv":
                        sum = quantity * 1.3;
                        break;
                    case "Varna":
                        sum = quantity * 1.35;
                        break;
                }
                break;
            case "peanuts":
                switch (city) {
                    case "Sofia":
                        sum = quantity * 1.6;
                        break;
                    case "Plovdiv":
                        sum = quantity * 1.5;
                        break;
                    case "Varna":
                        sum = quantity * 1.55;
                        break;
                }
                break;

        }
        System.out.println(sum);    }
}
