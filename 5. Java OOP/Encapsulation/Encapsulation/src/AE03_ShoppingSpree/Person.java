package AE03_ShoppingSpree;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Person {
    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money) {
        setName(name);
        setMoney(money);
        products = new ArrayList<>();
    }

    private void setName(String name) {
        if (!new Utils().isEmptyName(name)) {
            this.name = name;
        }
    }

    private void setMoney(double money) {
        if (!new Utils().isNegativeNumber(money)) {
            this.money = money;
        }
    }

    public void buyProduct (Product product) {

        if (product.getCost() <= money){
            products.add(product);
            money -= product.getCost();
            System.out.println(this.name + " bought " + product);
        } else  {
            System.out.println(this.name + " can't afford " + product.getName());
        }

    }

    @Override
    public String toString() {
        String productsCombined = products.stream().map(Product::toString).collect(Collectors.joining(", "));
        return this.name + " - " + productsCombined;
    }
}
