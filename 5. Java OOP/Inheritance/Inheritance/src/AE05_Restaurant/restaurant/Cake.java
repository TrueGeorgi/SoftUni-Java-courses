package AE05_Restaurant.restaurant;

import java.math.BigDecimal;

public class Cake extends Dessert {

    double CAKE_GRAMS = 250;
    double CAKE_CALORIES = 1000;
    BigDecimal CAKE_PRICE = BigDecimal.valueOf(5);

    public Cake () {
        super();
        this.name = "Cake";
        this.grams = CAKE_GRAMS;
        this.calories = CAKE_CALORIES;
        this.price = CAKE_PRICE;
    }

    @Override
    public String toString() {
        return "Cake{" +
                "CAKE_GRAMS=" + CAKE_GRAMS +
                ", CAKE_CALORIES=" + CAKE_CALORIES +
                ", CAKE_PRICE=" + CAKE_PRICE +
                ", calories=" + calories +
                ", grams=" + grams +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
