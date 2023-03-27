package ConditionalStatementsExercise02;

import java.util.Scanner;

public class TimePlus15_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = Integer.parseInt(scanner.nextLine());
        int min = Integer.parseInt(scanner.nextLine());
        int totalMin = h * 60 + min + 15;
        int newH = totalMin / 60;
        int newMin = totalMin - (newH * 60);
        if (newH > 23) {
            newH = 0;
        }
        System.out.printf("%d:%02d", newH, newMin);
    }
}
