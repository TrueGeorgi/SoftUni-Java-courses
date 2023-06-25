package AE05_Restaurant.restaurant;

import java.math.BigDecimal;

public class Coffee extends HotBeverage {

    double COFFEE_MILLILITERS = 50;
    BigDecimal COFFEE_PRICE = BigDecimal.valueOf(3.5);
    double caffeine;

    public Coffee (double caffeine) {
        super();
        this.caffeine = caffeine;
        this.name = "Coffee";
        this.price = COFFEE_PRICE;
        this.milliliters = COFFEE_MILLILITERS;
    }

    public double getCaffeine() {
        return caffeine;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "COFFEE_MILLILITERS=" + COFFEE_MILLILITERS +
                ", COFFEE_PRICE=" + COFFEE_PRICE +
                ", caffeine=" + caffeine +
                ", milliliters=" + milliliters +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
