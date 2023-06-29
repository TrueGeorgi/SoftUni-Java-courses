package AE02_VehiclesExtension.Vehicles;

import AE02_VehiclesExtension.Vehicle;

public class Bus extends Vehicle {

    protected final static double EXTRA_SUMMER_FUEL_CONSUMPTION_PER_KM = 1.4;

    public Bus(double fuelQuantity, double fuelConsumptionPerKm, double tankCapacity) {
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
        super.refuel(refuelLiters);
    }

    public void driveEmpty (double distance) {
        double fuelNeeded = distance *  (fuelConsumptionPerKm - EXTRA_SUMMER_FUEL_CONSUMPTION_PER_KM);
        if (fuelQuantity >= fuelNeeded) {
            System.out.println(canDrive(this.getClass().getSimpleName(), distance));
            this.fuelQuantity -= fuelNeeded;
        } else {
            System.out.println(cannotDrive(this.getClass().getSimpleName()));
        }
    }
}
