package ConditionalStatementsExercise02;

import java.util.Scanner;

public class BonusScore_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double bonusPoints = 0;

        if (n <= 100) {
            bonusPoints += 5;
        } else if (n <= 1000) {
            bonusPoints += n * 0.2;
        } else {
            bonusPoints += n * 0.1;
        }
        if (n % 2 == 0) {
            bonusPoints += 1;
        }
        if (n % 10 == 5) {
            bonusPoints += 2;
        }
        double total = n + bonusPoints;
        System.out.println(bonusPoints);
        System.out.println(total);
    }
}
