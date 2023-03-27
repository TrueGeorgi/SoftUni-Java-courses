package FirstStepsExcercises;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //•	Баскетболни кецове – цената им е 40% по-малка от таксата за една година
        //•	Баскетболен екип – цената му е 20% по-евтина от тази на кецовете
        //•	Баскетболна топка – цената ѝ е 1 / 4 от цената на баскетболния екип
        //•	Баскетболни аксесоари – цената им е 1 / 5 от цената на баскетболната топка
        int yearlyPriceBasketball = Integer.parseInt(scanner.nextLine());
        double shoes = yearlyPriceBasketball * 0.6;
        double kit = shoes * 0.8;
        double ball = kit * 0.25;
        double accessories = ball * 0.2;

        double expenses = yearlyPriceBasketball + shoes + kit + ball + accessories;

        System.out.println(expenses);
    }
}
