import java.util.Scanner;

public class SkiTrip_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        String room = scanner.nextLine();
        String raiting = scanner.nextLine();
        int nights = days - 1;
        double totalPrice = 0;

        switch (room) {
            case "room for one person":
                totalPrice = nights * 18;
                break;
            case "apartment":
                totalPrice = nights * 25;
                if (nights < 10) {
                    totalPrice *= 0.7;
                } else if (nights <= 15) {
                    totalPrice *= 0.65;
                } else {
                    totalPrice *= 0.5;
                }
                break;
            case "president apartment":
                totalPrice = nights * 35;
                if (nights < 10) {
                    totalPrice *= 0.9;
                } else if (nights <= 15) {
                    totalPrice *= 0.85;
                } else {
                    totalPrice *= 0.80;
                }
                break;
        }
        if (raiting.equals("positive")) {
            totalPrice *= 1.25;
        } else {
            totalPrice *= 0.9;
        }
        System.out.printf("%.2f",totalPrice);
    }
}
