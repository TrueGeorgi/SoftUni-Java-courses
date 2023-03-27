import java.util.Scanner;

public class OnTimeForTheExam_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hourExam = Integer.parseInt(scanner.nextLine());
        int minutesExam = Integer.parseInt(scanner.nextLine());
        int hourArrival = Integer.parseInt(scanner.nextLine());
        int minutesArrival = Integer.parseInt(scanner.nextLine());

        int totalMinutesExam = hourExam * 60 + minutesExam;
        int totalMinutesArrival = hourArrival * 60 + minutesArrival;
        int differenceMinutes = totalMinutesExam - totalMinutesArrival;

        if ( differenceMinutes < 0) {
            System.out.println("Late");
            int hoursLate = Math.abs(differenceMinutes) / 60;
            if (hoursLate > 0) {
                int minutesLate = Math.abs(differenceMinutes) % 60;
                System.out.printf("%d:%02d hours after the start", hoursLate, minutesLate);
            } else {
                System.out.printf("%d minutes after the start", Math.abs(differenceMinutes));
            }
        } else if (differenceMinutes <= 30) {
            System.out.println("On time");
            if (differenceMinutes != 0) {
                System.out.printf("%d minutes before the start", differenceMinutes);
            }
        } else {
            System.out.println("Early");
            int hoursEarly = differenceMinutes / 60;
            if (hoursEarly > 0) {
                int minutesEarly = differenceMinutes % 60;
                System.out.printf("%d:%02d hours before the start", hoursEarly, minutesEarly);
            } else {
                System.out.printf("%d minutes before the start", differenceMinutes);
            }
        }
    }
}
