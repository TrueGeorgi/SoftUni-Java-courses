import java.util.Scanner;

public class A03_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groupSize = Integer.parseInt(scanner.nextLine());
        String groupType = scanner.nextLine();
        String weekDay = scanner.nextLine();

        double totalPrice = 0;
        double businessPrice = 0;

        if (groupType.equals("Students")) {
            switch (weekDay) {
                case "Friday":
                    totalPrice = groupSize * 8.45;
                    break;
                case "Saturday":
                    totalPrice = groupSize * 9.8;
                    break;
                case "Sunday":
                    totalPrice = groupSize * 10.46;
                    break;
            }
            if (groupSize >= 30) {
                totalPrice *= 0.85;
            }
        } else if (groupType.equals("Business")) {
            switch (weekDay) {
                case "Friday":
                    totalPrice = groupSize * 10.9;
                    businessPrice = 10.9;
                    break;
                case "Saturday":
                    totalPrice = groupSize * 15.60;
                    businessPrice = 15.6;
                    break;
                case "Sunday":
                    totalPrice = groupSize * 16;
                    businessPrice = 16;
                    break;
            }
            if (groupSize >= 100) {
                totalPrice -= businessPrice * 10;
            }
        } else if (groupType.equals("Regular")) {
            switch (weekDay) {
                case "Friday":
                    totalPrice = groupSize * 15;
                    break;
                case "Saturday":
                    totalPrice = groupSize * 20;
                    break;
                case "Sunday":
                    totalPrice = groupSize * 22.50;
                    break;
            }
            if (groupSize >= 10 && groupSize <= 20) {
                totalPrice *= 0.95;
            }
        }
        System.out.printf("Total price: %.2f", totalPrice);
    }
}
