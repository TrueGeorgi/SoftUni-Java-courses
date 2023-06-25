package AE05_Restaurant.restaurant;

import java.math.BigDecimal;

public class Dessert extends Food {

    double calories;

    public Dessert (String name, BigDecimal price, double grams, double calories) {

        super(name, price, grams);

        this.calories = calories;
    }

    protected Dessert() {
        super();
    }

    public double getCalories() {
        return calories;
    }

    @Override
    public String toString() {
        return "Dessert{" +
                "calories=" + calories +
                ", grams=" + grams +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
