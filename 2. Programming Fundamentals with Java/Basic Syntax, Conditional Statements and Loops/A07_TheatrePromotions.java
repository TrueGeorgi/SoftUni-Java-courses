import java.util.Scanner;

public class A07_TheatrePromotions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfDay = scanner.nextLine().toLowerCase();
        int age = Integer.parseInt(scanner.nextLine());
        double price = 0.0;

        if (age >= 0 && age <= 18) {
            switch (typeOfDay) {
                case "weekday":
                    price = 12;
                    break;
                case "weekend":
                    price = 15;
                    break;
                case "holiday":
                    price = 5;
                    break;
            }
        } else if (age > 18 && age <= 64) {
            switch (typeOfDay) {
                case "weekday":
                    price = 18;
                    break;
                case "weekend":
                    price = 20;
                    break;
                case "holiday":
                    price = 12;
                    break;
            }
        } else if (age > 64 && age <=122) {
            switch (typeOfDay) {
                case "weekday":
                    price = 12;
                    break;
                case "weekend":
                    price = 15;
                    break;
                case "holiday":
                    price = 10;
                    break;
            }
        } else {
            price = 123456;
        }
        if (price == 123456) {
            System.out.print("Error!");
        } else {
            System.out.printf("%.0f$", price);
        }
    }
}
