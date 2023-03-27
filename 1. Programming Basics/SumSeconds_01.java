package ConditionalStatementsExercise02;

import java.util.Scanner;

public class SumSeconds_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstRunner = Integer.parseInt(scanner.nextLine());
        int secondRunner = Integer.parseInt(scanner.nextLine());
        int thirdRunner = Integer.parseInt(scanner.nextLine());

        int totaltime = firstRunner + secondRunner + thirdRunner;
        int minutes = totaltime / 60;
        int seconds = totaltime - (minutes * 60);
        if (seconds < 10) {
            System.out.printf("%d:0%d", minutes, seconds);
        } else {
            System.out.printf("%d:%d", minutes, seconds);
        }
    }
}
