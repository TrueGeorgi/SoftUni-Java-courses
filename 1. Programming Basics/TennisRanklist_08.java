import java.util.Scanner;

public class TennisRanklist_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tournaments = Integer.parseInt(scanner.nextLine());
        int beginingPoints = Integer.parseInt(scanner.nextLine());
        int winsCounter = 0;
        int pointsCounter = 0;
        for (int i = 1; i <= tournaments; i++) {
            String outcome = scanner.nextLine();
            switch (outcome) {
                case "W":
                    pointsCounter += 2000;
                    winsCounter++;
                    break;
                case "F":
                    pointsCounter += 1200;
                    break;
                case "SF":
                    pointsCounter += 720;
                    break;
            }
        }
        int totalPoints = beginingPoints + pointsCounter;
        double averagePoints = pointsCounter * 1.0 / tournaments;
        double winsPercentage = winsCounter * 1.0 / tournaments * 100;

        System.out.printf("Final points: %d%n", totalPoints);
        System.out.printf("Average points: %.0f%n", Math.floor(averagePoints));
        System.out.printf("%.2f%%", winsPercentage);
    }
}
