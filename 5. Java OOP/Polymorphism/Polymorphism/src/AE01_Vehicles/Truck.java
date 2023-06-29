package AE01_Vehicles;

import java.text.DecimalFormat;

public class Truck extends Vehicle implements Drivable {

    protected final static double EXTRA_SUMMER_FUEL_CONSUMPTION_PER_KM = 1.6;

    public Truck(double fuelQuantity, double fuelConsumptionPerKm) {
        super(fuelQuantity, (fuelConsumptionPerKm + EXTRA_SUMMER_FUEL_CONSUMPTION_PER_KM));
    }

    @Override
    public void refuel(double refuelLiters) {
        this.fuelQuantity += (refuelLiters * 0.95);
    }
}
