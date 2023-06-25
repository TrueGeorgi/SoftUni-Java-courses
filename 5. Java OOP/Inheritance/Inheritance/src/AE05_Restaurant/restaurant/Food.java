package AE05_Restaurant.restaurant;

import java.math.BigDecimal;

public class Food extends Product {

    double grams;

    public Food (String name, BigDecimal price, double grams) {

        super(name, price);

        this.grams = grams;
    }

    protected Food() {

    }

    public double getGrams() {
        return grams;
    }

    @Override
    public String toString() {
        return "Food{" +
                "grams=" + grams +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
