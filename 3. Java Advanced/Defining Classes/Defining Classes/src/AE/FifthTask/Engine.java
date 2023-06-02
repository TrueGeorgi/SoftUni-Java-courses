package AE.FifthTask;

public class Engine {

    String model;

    String power;

    String displacement;

    String efficiency;

    // constructors


    public Engine(String model, String power) {
        this.model = model;
        this.power = power;
        this.displacement = "n/a";
        this.efficiency = "n/a";
    }

    public Engine(String model, String power, int displacement) {
        this.model = model;
        this.power = power;
        this.displacement = String.valueOf(displacement);
        this.efficiency = "n/a";
    }

    public Engine(String model, String power, String efficiency) {
        this.model = model;
        this.power = power;
        this.displacement = "n/a";
        this.efficiency = efficiency;
    }

    public Engine(String model, String power, int displacement, String efficiency) {
        this.model = model;
        this.power = power;
        this.displacement = String.valueOf(displacement);
        this.efficiency = efficiency;
    }

    // {EngineModel}:
    // Power: {EnginePower}
    // Displacement: {EngineDisplacement}
    // Efficiency: {EngineEfficiency}

    @Override
    public String toString() {
        return String.format("%s:%n" +
                "Power: %s%n" +
                "Displacement: %s%n" +
                "Efficiency: %s", model, power, displacement, efficiency);
    }
}
