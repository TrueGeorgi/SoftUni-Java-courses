package vehicleShop.repositories;

import vehicleShop.models.vehicle.Vehicle;
import vehicleShop.models.worker.Worker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class VehicleRepository implements Repository<Vehicle> {

    // variables
    private final Collection<Vehicle> vehicles;
    // constructor

    public VehicleRepository() {
        this.vehicles = new ArrayList<>();
    }

    // getters and setters
    // methods

    @Override
    public Collection<Vehicle> getWorkers() {
        return Collections.unmodifiableCollection(vehicles);
    }

    @Override
    public void add(Vehicle model) {
        vehicles.add(model);
    }

    @Override
    public boolean remove(Vehicle model) {
        if (vehicles.contains(model)) {
            vehicles.remove(model);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Vehicle findByName(String name) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getName().equals(name)) {
                return vehicle;
            }
        }
        return null;
    }
}
