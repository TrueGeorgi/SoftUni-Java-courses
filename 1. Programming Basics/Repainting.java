package FirstStepsExcercises;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //•	Предпазен найлон - 1.50 лв. за кв. метър
        //•	Боя - 14.50 лв. за литър
        //•	Разредител за боя - 5.00 лв. за литър
        // + 10% paint & + 2 Nylon
        // + 0.4 lv for bags
        // workers 1h = 30% from total prices for all
        int nylonAmount = Integer.parseInt(scanner.nextLine());
        double paintAmount = Integer.parseInt(scanner.nextLine());
        int thinnerAmount = Integer.parseInt(scanner.nextLine());
        int workingTIme = Integer.parseInt(scanner.nextLine());

        paintAmount = paintAmount + (paintAmount * 0.1);
        nylonAmount += 2;

        double nylonPrice = nylonAmount * 1.5;
        double paintPrice = paintAmount * 14.5;
        double thinnerPrice = thinnerAmount * 5.00;
        double sumItems = nylonPrice + paintPrice + thinnerPrice + 0.4;

        double workersPerH = sumItems * 0.3;
        double workersPrice = workingTIme * workersPerH;

        double totalSum = sumItems + workersPrice;

        System.out.println(totalSum);
    }
}
