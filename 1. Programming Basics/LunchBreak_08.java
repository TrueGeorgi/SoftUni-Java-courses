package ConditionalStatementsExercise02;

import java.util.Scanner;

public class LunchBreak_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tvShow = scanner.nextLine();
        int showDuration = Integer.parseInt(scanner.nextLine());
        int breakDuration = Integer.parseInt(scanner.nextLine());
        double lunchTime = breakDuration * 1.0 / 8;
        double relaxTime = breakDuration * 1.0 / 4;
        double breakLeft = breakDuration - lunchTime - relaxTime ;
        if (breakLeft >= showDuration) {
            double timeLeft = breakLeft - showDuration;
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", tvShow,Math.ceil(timeLeft));
        } else {
            double timeNeeded = showDuration - breakLeft;
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", tvShow, Math.ceil(timeNeeded));
        }
    }
}
