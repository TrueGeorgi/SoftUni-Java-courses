package AE05_Restaurant.restaurant;

import java.math.BigDecimal;

public class HotBeverage extends Beverage {

    public HotBeverage (String name, BigDecimal price, double milliliters) {
        super(name, price, milliliters);
    }

    protected HotBeverage() {
        super();
    }

    @Override
    public String toString() {
        return "HotBeverage{" +
                "milliliters=" + milliliters +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
