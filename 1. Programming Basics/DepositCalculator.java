package FirstStepsExcercises;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double depositedSum = Double.parseDouble(scanner.nextLine());
        int depositDuration = Integer.parseInt(scanner.nextLine());
        double interest = Double.parseDouble(scanner.nextLine());

        double interestForAnYear = depositedSum * interest / 100;
        double interesrPerMonth = interestForAnYear / 12;
        double sum = depositedSum + depositDuration * interesrPerMonth;
        System.out.println(sum);
    }
}
