package AE05_Restaurant.restaurant;

import java.math.BigDecimal;

public class MainDish extends Food {

    public MainDish (String name, BigDecimal price, double grams) {
        super(name, price, grams);
    }

    protected MainDish() {
    }

    @Override
    public String toString() {
        return "MainDish{" +
                "grams=" + grams +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
