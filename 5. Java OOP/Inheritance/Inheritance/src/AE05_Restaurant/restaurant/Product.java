package AE05_Restaurant.restaurant;

import java.math.BigDecimal;

public class Product {

    String name;
    BigDecimal price;

    public Product (String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    protected Product() {
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
