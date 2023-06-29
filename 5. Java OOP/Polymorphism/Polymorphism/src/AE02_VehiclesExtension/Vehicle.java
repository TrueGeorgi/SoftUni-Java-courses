package AE02_VehiclesExtension;

public abstract class Vehicle implements Drivable {

    protected double fuelQuantity;
    protected double fuelConsumptionPerKm;

    protected double tankCapacity;

    public Vehicle(double fuelQuantity, double fuelConsumptionPerKm, double tankCapacity) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumptionPerKm = fuelConsumptionPerKm;
        this.tankCapacity = tankCapacity;
    }

    public void drive(double distance) {
        double fuelNeeded = distance * fuelConsumptionPerKm;
        if (fuelQuantity >= fuelNeeded) {
            System.out.println(canDrive(this.getClass().getSimpleName(), distance));
            this.fuelQuantity -= fuelNeeded;
        } else {
            System.out.println(cannotDrive(this.getClass().getSimpleName()));
        }
    };
    public  void refuel (double refuelLiters, double damage) {

        double toBeRefueled = refuelLiters * damage;

        if (toBeRefueled <= 0) {
            System.out.println("Fuel must be a positive number");
        } else if (toBeRefueled + this.fuelQuantity > this.tankCapacity) {
            System.out.println("Cannot fit fuel in tank");
        } else {
            this.fuelQuantity += toBeRefueled;
        }
    }

    public  void refuel (double refuelLiters) {

        if (refuelLiters <= 0) {
            System.out.println("Fuel must be a positive number");
        } else if (refuelLiters + this.fuelQuantity > this.tankCapacity) {
            System.out.println("Cannot fit fuel in tank");
        } else {
            this.fuelQuantity += refuelLiters;
        }
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f", this.getClass().getSimpleName(), this.fuelQuantity);
    }
}
