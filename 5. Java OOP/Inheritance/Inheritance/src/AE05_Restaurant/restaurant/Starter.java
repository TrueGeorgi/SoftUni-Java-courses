package AE05_Restaurant.restaurant;

import java.math.BigDecimal;

public class Starter extends Food {

    public Starter (String name, BigDecimal price, double grams) {

        super(name, price, grams);
    }

    @Override
    public String toString() {
        return "Starter{" +
                "grams=" + grams +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
