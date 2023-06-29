package AE01_Vehicles;

public class Car extends Vehicle implements Drivable {

    protected final static double EXTRA_SUMMER_FUEL_CONSUMPTION_PER_KM = 0.9;

    public Car(double fuelQuantity, double fuelConsumptionPerKm) {
        super(fuelQuantity, (fuelConsumptionPerKm + EXTRA_SUMMER_FUEL_CONSUMPTION_PER_KM));
    }

    @Override
    public void refuel(double refuelLiters) {
        this.fuelQuantity += refuelLiters;
    }
}
