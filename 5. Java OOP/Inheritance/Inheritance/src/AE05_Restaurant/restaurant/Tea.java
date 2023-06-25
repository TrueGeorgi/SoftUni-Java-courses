package AE05_Restaurant.restaurant;

import java.math.BigDecimal;

public class Tea extends HotBeverage{

    public Tea (String name, BigDecimal price, double milliliters) {
        super(name, price, milliliters);
    }

    @Override
    public String toString() {
        return "Tea{" +
                "milliliters=" + milliliters +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
