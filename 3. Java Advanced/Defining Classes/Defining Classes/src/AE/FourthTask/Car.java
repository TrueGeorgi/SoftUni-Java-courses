package AE.FourthTask;

public class Car {

    String model;

    Engine engine;

    Cargo cargo;

    Tire[] tires = new Tire[4];

    // constructor

    public Car (String model
            , int engineSpeed, int enginePower
            , int cargoWeight, String cargoType
            , double tireOnePressure, int tireOneAge
            , double tireTwoPressure, int tireTwoAge
            , double tireThreePressure, int tireThreeAge
            , double tireFourPressure, int tireFourAge) {
        this.model = model;
        this.engine = new Engine(engineSpeed, enginePower);
        this.cargo = new Cargo(cargoWeight, cargoType);
        this.tires[0] = new Tire(tireOnePressure, tireOneAge);
        this.tires[1] = new Tire(tireTwoPressure, tireTwoAge);
        this.tires[2] = new Tire(tireThreePressure, tireThreeAge);
        this.tires[3] = new Tire(tireFourPressure, tireFourAge);
    }

    // getters

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public Tire[] getTires() {
        return tires;
    }

    // Methods

    public boolean hasTireBelowOne () {
        for (Tire tire : tires) {
            if (tire.getPressure() < 1) {
                return true;
            }
        }
        return false;
    }
}
