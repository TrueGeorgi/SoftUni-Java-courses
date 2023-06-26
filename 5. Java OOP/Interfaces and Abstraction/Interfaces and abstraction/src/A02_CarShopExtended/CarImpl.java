package A02_CarShopExtended;

public abstract class CarImpl implements Car{

     String model;
     String color;
     Integer horsePower;
     String country;

    public CarImpl(String model, String color, Integer horsePower, String countryProduced) {
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
        this.country = countryProduced;
    }

    @Override
    public String toString() {
        return String.format("This is " + getModel() + " produced in " + countryProduced() + " and have " + TIRES + " tires");
    }
}
