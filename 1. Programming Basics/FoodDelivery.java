package FirstStepsExcercises;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //•	Пилешко меню –  10.35 лв.
        //•	Меню с риба – 12.40 лв.
        //•	Вегетарианско меню  – 8.15 лв.
        //Групата ще си поръча и десерт, чиято цена е равна на 20% от общата сметка (без доставката).
        //Цената на доставка е 2.50 лв и се начислява най-накрая.
        int chickenMenus = Integer.parseInt(scanner.nextLine());
        int fishMenus = Integer.parseInt(scanner.nextLine());
        int vegieMenus = Integer.parseInt(scanner.nextLine());

        double priceChickenMenus = chickenMenus * 10.35;
        double priceFishMenus = fishMenus * 12.4;
        double priceVegieMenus = vegieMenus * 8.15;
        double totalPriceMenus = priceChickenMenus + priceVegieMenus + priceFishMenus;
        double desertPrice = totalPriceMenus * 0.2;
        double totalPriceFood = totalPriceMenus + desertPrice;
        double finalPrice = totalPriceFood + 2.5;

        System.out.println(finalPrice);
    }
}
