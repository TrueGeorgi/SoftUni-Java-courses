package A_DefiningClasses;

public class Car {

    private String brand;

    private String model;

    private int hp;

                                     /// Constructor

    public Car (String brand, String model, int hp) {
        this.brand = brand;
        this.model = model;
        this.hp = hp;
    }
    public Car (String brand) {
        this.brand = brand;
        this.model = "unknown";
        this.hp = -1;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getHp() {
        return hp;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void carInfo() {
        System.out.printf("The car is: %s %s - %d HP.%n", this.brand, this.model, this.hp);
    }
}
