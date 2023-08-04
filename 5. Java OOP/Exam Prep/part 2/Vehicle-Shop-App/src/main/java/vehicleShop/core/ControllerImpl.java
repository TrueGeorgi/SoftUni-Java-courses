package vehicleShop.core;

import vehicleShop.common.ConstantMessages;
import vehicleShop.common.ExceptionMessages;
import vehicleShop.models.shop.ShopImpl;
import vehicleShop.models.tool.Tool;
import vehicleShop.models.tool.ToolImpl;
import vehicleShop.models.vehicle.Vehicle;
import vehicleShop.models.vehicle.VehicleImpl;
import vehicleShop.models.worker.FirstShift;
import vehicleShop.models.worker.SecondShift;
import vehicleShop.models.worker.Worker;
import vehicleShop.repositories.VehicleRepository;
import vehicleShop.repositories.WorkerRepository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ControllerImpl implements Controller {

    // Parameters
    // TODO check if the repos needs to be here. If they dont. check the addWorker and addVehicle.
    private int readyVehicles = 0;
    private WorkerRepository workerRepository;
    private VehicleRepository vehicleRepository;
    // constructor

    public ControllerImpl() {
        workerRepository = new WorkerRepository();
        vehicleRepository = new VehicleRepository();
    }

    // getters and setters
    // methods

    @Override
    public String addWorker(String type, String workerName) {
        String firstShift = "FirstShift";
        String secondShift = "SecondShift";
        if (type.equals(firstShift) || type.equals(secondShift)) {
            Worker worker;
            if (type.equals(firstShift)) {
                worker = new FirstShift(workerName);
            } else {
                worker = new SecondShift(workerName);
            }
            this.workerRepository.add(worker);
           return String.format(ConstantMessages.ADDED_WORKER, type, workerName);
        } else {
            throw new IllegalArgumentException(ExceptionMessages.WORKER_TYPE_DOESNT_EXIST);
        }
    }

    @Override
    public String addVehicle(String vehicleName, int strengthRequired) {
        Vehicle vehicle = new VehicleImpl(vehicleName, strengthRequired);
        this.vehicleRepository.add(vehicle);
        return String.format(ConstantMessages.SUCCESSFULLY_ADDED_VEHICLE, vehicleName);
    }

    // TODO if problem - check just in case
    @Override
    public String addToolToWorker(String workerName, int power) {
        Worker currentWorker = findWorkerName(workerName);
        if (currentWorker == null) {
            throw new IllegalArgumentException(ExceptionMessages.HELPER_DOESNT_EXIST);
        }
        Tool tool = new ToolImpl(power);
        currentWorker.addTool(tool);

        return String.format(ConstantMessages.SUCCESSFULLY_ADDED_TOOL_TO_WORKER, power, workerName);
    }
    // TODO - it is long. So if problem maybe here.
    @Override
    public String makingVehicle(String vehicleName) {
        ShopImpl shop = new ShopImpl();
        Vehicle vehicleToBeDone = vehicleRepository.findByName(vehicleName);
        List<Worker> suitableWorkers = findSuitableWorkers();
       if (suitableWorkers.size() == 0) {
           throw new IllegalArgumentException(ExceptionMessages.NO_WORKER_READY);
       }

        for (Worker worker : suitableWorkers) {
            shop.make(vehicleToBeDone, worker);
        }

        boolean vehicleIsDone = vehicleToBeDone.reached();

        if (vehicleIsDone) {
            readyVehicles++;
        }

        int brokenTools = brokenTools(suitableWorkers);

        StringBuilder output = new StringBuilder();
        output.append(String.format(ConstantMessages.VEHICLE_DONE, vehicleName, isDoneNotDone(vehicleIsDone)));
        output.append(" "); // TODO maybe the space here is kind of ...meh
        output.append(String.format(ConstantMessages.COUNT_BROKEN_INSTRUMENTS, brokenTools));

        return String.valueOf(output);
    }
    // TODO i think it should work. Check it at the end.
    @Override
    public String statistics() {
        List<String> output = new ArrayList<>();
        output.add(String.format("%d vehicles are ready!", this.readyVehicles));
        output.add("Info for workers:");
        for (Worker worker : workerRepository.getWorkers()) {
            output.add(String.format("Name: %s, Strength: %s", worker.getName(), worker.getStrength()));
            int fitTools = 0;
            for (Tool tool : worker.getTools()) {
                if (!tool.isUnfit()) {
                    fitTools++;
                }
            }
            output.add(String.format("Tools: %d fit left", fitTools));
        }

       return String.join("\n", output);
    }

    private Worker findWorkerName (String workerName) {
        for (Worker worker : workerRepository.getWorkers()) {
            if (worker.getName().equals(workerName)) {
                return worker;
            }
        }
        return null;
    }

    private List<Worker> findSuitableWorkers () {
        List<Worker> suitableWorkers = new ArrayList<>();
        for (Worker worker : this.workerRepository.getWorkers()) {
            //TODO if some problems, maybe try to put = after the >.
            if (worker.getStrength() > 70) {
                suitableWorkers.add(worker);
            }
        }
        return suitableWorkers;
    }

    private int brokenTools (List<Worker> workers) {
        int brokenTools = 0;

        for (Worker worker : workers) {
            for (Tool tool : worker.getTools()) {
                if (tool.isUnfit()) {
                    brokenTools++;
                }
            }
        }

        return brokenTools;
    }

    private String isDoneNotDone (Boolean isDone) {
        if (isDone) {
            return "done";
        } else {
            return "not done";
        }
    }

    // TODO it was written something about an Exit command....
}
