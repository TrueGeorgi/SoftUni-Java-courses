import java.util.Scanner;

public class Cinema_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String show = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());
        int seats = rows * columns;
        double showPrice = 0.0;

        if (show.equals("Premiere")) {
            showPrice = seats * 12.00;
        } else if (show.equals("Normal")) {
            showPrice = seats * 7.5;
        }else if (show.equals("Discount")) {
            showPrice = seats * 5;
        }
        System.out.printf("%.2f leva", showPrice);
    }
}
