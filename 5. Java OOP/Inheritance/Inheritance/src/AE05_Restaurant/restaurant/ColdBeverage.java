package AE05_Restaurant.restaurant;

import java.math.BigDecimal;

public class ColdBeverage extends Beverage {

    public ColdBeverage (String name, BigDecimal price, double milliliters) {
        super(name, price, milliliters);
    }

    @Override
    public String toString() {
        return "ColdBeverage{" +
                "milliliters=" + milliliters +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
