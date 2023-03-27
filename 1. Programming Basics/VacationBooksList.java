package FirstStepsExcercises;

import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bookPages = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int duration = bookPages / pagesPerHour;
        int hoursPerDay = duration / days;

        System.out.println(hoursPerDay);

    }
}
