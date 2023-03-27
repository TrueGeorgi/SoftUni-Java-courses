import java.util.Scanner;

public class CinemaTickets_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String movie = scanner.nextLine();
        int totalTickets = 0;
        int studentTickets = 0;
        int kidTickets = 0;
        int standardTickets = 0;
        while (!movie.equals("Finish")) {
            int seats = Integer.parseInt(scanner.nextLine());
            String ticket = scanner.nextLine();
            int ticketsSoldPerMovie = 0;
            while (!ticket.equals("End")) {
                totalTickets++;
                ticketsSoldPerMovie++;
                switch (ticket) {
                    case "student":
                        studentTickets++;
                        break;
                    case "standard":
                        standardTickets++;
                        break;
                    case "kid":
                        kidTickets++;
                        break;
                }
                if (seats == ticketsSoldPerMovie) {
                    break;
                }
                ticket = scanner.nextLine();
            }
            double percentFull = ticketsSoldPerMovie * 1.0 * 100 / seats;
            System.out.printf("%s - %.2f%% full.%n", movie, percentFull);
            movie = scanner.nextLine();
        }
        System.out.println("Total tickets: " + totalTickets);
        double averageStudents = studentTickets * 1.0 * 100 / totalTickets;
        System.out.printf("%.2f%% student tickets.%n", averageStudents);
        double averageStandard = standardTickets * 1.0 * 100 / totalTickets;
        System.out.printf("%.2f%% standard tickets.%n", averageStandard);
        double averageKid = kidTickets * 1.0 * 100 / totalTickets;
        System.out.printf("%.2f%% kids tickets.%n", averageKid);
    }
}
