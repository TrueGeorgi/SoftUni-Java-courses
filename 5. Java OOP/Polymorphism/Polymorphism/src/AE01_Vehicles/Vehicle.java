package AE01_Vehicles;

public abstract class Vehicle implements Drivable{

    double fuelQuantity;
    double fuelConsumptionPerKm;

    public Vehicle(double fuelQuantity, double fuelConsumptionPerKm) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumptionPerKm = fuelConsumptionPerKm;
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
    public abstract void refuel (double refuelLiters);

    @Override
    public String toString() {
        return String.format("%s: %.2f", this.getClass().getSimpleName(), this.fuelQuantity);
    }
}
