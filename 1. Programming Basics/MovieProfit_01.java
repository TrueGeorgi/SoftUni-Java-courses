import java.util.Scanner;

public class MovieProfit_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String movie = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        int tickets = Integer.parseInt(scanner.nextLine());
        double ticketPrice = Double.parseDouble(scanner.nextLine());
        double percentForTheCinema = Double.parseDouble(scanner.nextLine());
        int totalTicketsSold = days * tickets;
        double totalPrice = totalTicketsSold * ticketPrice;
        double profit = totalPrice - (totalPrice * (percentForTheCinema / 100));
        System.out.printf("The profit from the movie %s is %.2f lv.", movie, profit);

    }
}
