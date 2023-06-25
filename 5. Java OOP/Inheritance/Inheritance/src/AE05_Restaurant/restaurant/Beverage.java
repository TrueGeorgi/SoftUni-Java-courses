package AE05_Restaurant.restaurant;

import java.math.BigDecimal;

public class Beverage extends Product{

    double milliliters;

    public Beverage (String name, BigDecimal price, double milliliters) {

        super(name, price);

        this.milliliters = milliliters;
    }

    protected Beverage() {
        super();
    }

    public double getMilliliters() {
        return milliliters;
    }

    @Override
    public String toString() {
        return "Beverage{" +
                "milliliters=" + milliliters +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
