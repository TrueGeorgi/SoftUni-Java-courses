import java.util.Scanner;

public class FruitShop_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String weekday = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double sum = 0;
        switch (fruit) {
            case "banana":
                switch (weekday) {
                    case "Monday":
                    case "Tuesday":
                    case "Wednesday":
                    case "Thursday":
                    case "Friday":
                        sum = quantity * 2.5;
                        System.out.printf("%.2f", sum);
                        break;
                    case "Saturday":
                    case "Sunday":
                        sum = quantity * 2.7;
                        System.out.printf("%.2f", sum);
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
                break;
            case "apple":
                switch (weekday) {
                    case "Monday":
                    case "Tuesday":
                    case "Wednesday":
                    case "Thursday":
                    case "Friday":
                        sum = quantity * 1.2;
                        System.out.printf("%.2f", sum);
                        break;
                    case "Saturday":
                    case "Sunday":
                        sum = quantity * 1.25;
                        System.out.printf("%.2f", sum);
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
                break;
            case "orange":
                switch (weekday) {
                    case "Monday":
                    case "Tuesday":
                    case "Wednesday":
                    case "Thursday":
                    case "Friday":
                        sum = quantity * 0.85;
                        System.out.printf("%.2f", sum);
                        break;
                    case "Saturday":
                    case "Sunday":
                        sum = quantity * 0.9;
                        System.out.printf("%.2f", sum);
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
                break;
            case "grapefruit":
                switch (weekday) {
                    case "Monday":
                    case "Tuesday":
                    case "Wednesday":
                    case "Thursday":
                    case "Friday":
                        sum = quantity * 1.45;
                        System.out.printf("%.2f", sum);
                        break;
                    case "Saturday":
                    case "Sunday":
                        sum = quantity * 1.6;
                        System.out.printf("%.2f", sum);
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
                break;
            case "kiwi":
                switch (weekday) {
                    case "Monday":
                    case "Tuesday":
                    case "Wednesday":
                    case "Thursday":
                    case "Friday":
                        sum = quantity * 2.7;
                        System.out.printf("%.2f", sum);
                        break;
                    case "Saturday":
                    case "Sunday":
                        sum = quantity * 3;
                        System.out.printf("%.2f", sum);
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
                break;
            case "pineapple":
                switch (weekday) {
                    case "Monday":
                    case "Tuesday":
                    case "Wednesday":
                    case "Thursday":
                    case "Friday":
                        sum = quantity * 5.5;
                        System.out.printf("%.2f", sum);
                        break;
                    case "Saturday":
                    case "Sunday":
                        sum = quantity * 5.6;
                        System.out.printf("%.2f", sum);
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
                break;
            case "grapes":
                switch (weekday) {
                    case "Monday":
                    case "Tuesday":
                    case "Wednesday":
                    case "Thursday":
                    case "Friday":
                        sum = quantity * 3.85;
                        System.out.printf("%.2f", sum);
                        break;
                    case "Saturday":
                    case "Sunday":
                        sum = quantity * 4.2;
                        System.out.printf("%.2f", sum);
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
                break;
            default:
                System.out.println("error");
                break;
        }
    }
}
