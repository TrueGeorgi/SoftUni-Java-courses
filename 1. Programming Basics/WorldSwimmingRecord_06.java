package ConditionalStatementsExercise02;

import java.util.Scanner;

public class WorldSwimmingRecord_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double currentRecord = Double.parseDouble(scanner.nextLine());
        double distanceMeters = Double.parseDouble(scanner.nextLine());
        double secondsFor1Meter = Double.parseDouble(scanner.nextLine());

        double slowedDowntimes = distanceMeters / 15;
        double slowedDownSecs = Math.floor(slowedDowntimes) * 12.5;
        double rughTime = distanceMeters * secondsFor1Meter;
        double finalTime = rughTime + slowedDownSecs;

        if (finalTime < currentRecord) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", finalTime);
        } else {
            double needed = finalTime - currentRecord;
            System.out.printf("No, he failed! He was %.2f seconds slower.", needed);
        }
    }
}
