package AE02_VehiclesExtension.Vehicles;

import AE02_VehiclesExtension.Drivable;
import AE02_VehiclesExtension.Vehicle;

public class Truck extends Vehicle {

    protected final static double EXTRA_SUMMER_FUEL_CONSUMPTION_PER_KM = 1.6;

    public Truck(double fuelQuantity, double fuelConsumptionPerKm, double tankCapacity) {
        super(fuelQuantity, (fuelConsumptionPerKm + EXTRA_SUMMER_FUEL_CONSUMPTION_PER_KM), tankCapacity);
    }

    @Override
    public String canDrive(String vehicle, double km) {
        return super.canDrive(vehicle, km);
    }

    @Override
    public String cannotDrive(String vehicle) {
        return super.cannotDrive(vehicle);
    }

    @Override
    public void refuel(double refuelLiters) {
        super.refuel(refuelLiters, 0.95);
    }
}
