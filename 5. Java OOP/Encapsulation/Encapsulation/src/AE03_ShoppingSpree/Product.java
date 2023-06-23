package AE03_ShoppingSpree;

public class Product {
    private String name;
    private double cost;

    public Product(String name, double cost) {
        setName(name);
        setCost(cost);
    }

    public void setName(String name) {
        if (!new Utils().isEmptyName(name)) {
            this.name = name;
        }
    }

    public void setCost(double cost) {
        if (!new Utils().isNegativeNumber(cost)) {
            this.cost = cost;
        }
    }

    public String getName () {
        return this.name;
    }

    public double getCost () {
        return this.cost;
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
