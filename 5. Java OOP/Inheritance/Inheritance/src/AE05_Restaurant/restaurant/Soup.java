package AE05_Restaurant.restaurant;

import java.math.BigDecimal;

public class Soup extends Starter {

    public Soup (String name, BigDecimal price, double grams) {
        super(name, price, grams);
    }

    @Override
    public String toString() {
        return "Soup{" +
                "grams=" + grams +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
