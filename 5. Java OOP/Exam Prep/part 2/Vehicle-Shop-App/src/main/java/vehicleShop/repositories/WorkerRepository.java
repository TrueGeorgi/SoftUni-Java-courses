package vehicleShop.repositories;

import vehicleShop.models.worker.BaseWorker;
import vehicleShop.models.worker.Worker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class WorkerRepository implements Repository<Worker> {

    // variables
    private final Collection<Worker> workers;
    // constructor

    public WorkerRepository() {
        this.workers = new ArrayList<>();
    }

    // getters and setters

    @Override
    public Collection<Worker> getWorkers() {
        return Collections.unmodifiableCollection(workers);
    }

    @Override
    public void add(Worker model) {
        workers.add(model);
    }

    // methods

    @Override
    public boolean remove(Worker model) {
        if (workers.contains(model)) {
            workers.remove(model);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Worker findByName(String name) {
        for (Worker worker : workers) {
            if (worker.getName().equals(name)) {
                return worker;
            }
        }
        return null;
    }
}
