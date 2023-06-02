package AE.FifthTask;

public class Car {

    String model;

    Engine engine;

    String weight;

    String color;

    // constructors


    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
        this.weight = "n/a";
        this.color = "n/a";
    }

    public Car(String model, Engine engine, int weight) {
        this.model = model;
        this.engine = engine;
        this.weight = String.valueOf(weight);
        this.color = "n/a";
    }

    public Car(String model, Engine engine, String color) {
        this.model = model;
        this.engine = engine;
        this.weight = "n/a";
        this.color = color;
    }

    public Car(String model, Engine engine, int weight, String color) {
        this.model = model;
        this.engine = engine;
        this.weight = String.valueOf(weight);
        this.color = color;
    }

    // methods

    public void printStats() {
        //       "{CarModel}:
        // {EngineModel}:
        // Power: {EnginePower}
        // Displacement: {EngineDisplacement}
        // Efficiency: {EngineEfficiency}
        //        Weight: {CarWeight}
        //        Color: {CarColor}"
    }

    @Override
    public String toString() {
        return String.format("%s:%n" +
                "%s%n" +
                "Weight: %s%n" +
                "Color: %s", model, engine.toString(), weight, color);
    }
}
