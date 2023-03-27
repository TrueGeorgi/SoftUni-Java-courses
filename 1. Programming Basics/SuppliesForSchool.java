package FirstStepsExcercises;

import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //•	Пакет химикали - 5.80 лв.
        //•	Пакет маркери - 7.20 лв.
        //•	Препарат - 1.20 лв (за литър)

        int pens = Integer.parseInt(scanner.nextLine());
        int highligthers = Integer.parseInt(scanner.nextLine());
        int blackBoardCleanerLiters = Integer.parseInt(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());

        double pensPrice = pens * 5.8;
        double highLigtherPrice = highligthers * 7.2;
        double balckBoardCleanerPrice = blackBoardCleanerLiters * 1.2;
        double sumItems = pensPrice + highLigtherPrice + balckBoardCleanerPrice;
        double discount100 = discount * 1.0 / 100;
        double finalSum = sumItems - sumItems * discount100;

        System.out.println(finalSum);
    }
}
