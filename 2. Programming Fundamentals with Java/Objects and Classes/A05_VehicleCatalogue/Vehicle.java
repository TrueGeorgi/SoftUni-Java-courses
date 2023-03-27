package A05_VehicleCatalogue;

public class Vehicle {
    String type;
    String model;
    String color;
    String horsePower;

    public Vehicle(String type, String model, String color, String horsePower) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
    }

    public String getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getHorsePower() {
        return horsePower;
    }

    @Override
    public String toString() {
        return "Type: " + this.type + "\n"
                + "Model: " + this.model + "\n"
                + "Color: " + this.color + "\n"
                + "Horsepower: " + this.horsePower;
    }
}
