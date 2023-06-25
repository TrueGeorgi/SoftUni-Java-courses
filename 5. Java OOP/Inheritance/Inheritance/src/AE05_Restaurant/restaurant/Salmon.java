package AE05_Restaurant.restaurant;

import java.math.BigDecimal;

public class Salmon extends MainDish {

    double SALMON_GRAMS = 22;

    public Salmon (BigDecimal price) {
        super();
        this.name = "Salmon";
        this.grams = SALMON_GRAMS;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Salmon{" +
                "SALMON_GRAMS=" + SALMON_GRAMS +
                ", grams=" + grams +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
