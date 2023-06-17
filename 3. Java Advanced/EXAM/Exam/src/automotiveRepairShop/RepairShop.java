package automotiveRepairShop;

import java.util.ArrayList;
import java.util.List;

public class RepairShop {

    private List<Vehicle> vehicles;

    private int capacity;

    // Constructors

    public RepairShop(int capacity) {
        this.capacity = capacity;
        vehicles = new ArrayList<>();
    }

    // Methods

    public void addVehicle (Vehicle vehicle) {
        if (vehicles.size() < capacity) {
            vehicles.add(vehicle);
        }
    }

    public boolean removeVehicle (String VIN) {
        for (int i = 0; i < vehicles.size(); i++) {
            if (vehicles.get(i).getVIN().equals(VIN)) {
                vehicles.remove(i);
                return true;
            }
        }
        return false;
    }

    public int getCount () {
        return vehicles.size();
    }

    public Vehicle getLowestMileage () {
        int lowestVehicleIndex = -1;
        int lowestValue = Integer.MAX_VALUE;

        for (int i = 0; i < vehicles.size(); i++) {
            if (vehicles.get(i).getMileage() < lowestValue) {
                lowestValue = vehicles.get(i).getMileage();
                lowestVehicleIndex = i;
            }
        }

        return vehicles.get(lowestVehicleIndex);
    }

    public String report() {

        String output = "Vehicles in the preparatory:" + "\n";

        for (Vehicle vehicle : vehicles) {
            output += vehicle.toString() + "\n";
        }

        return output;
    }
}
