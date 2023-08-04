package vehicleShop.models.shop;

import vehicleShop.models.tool.Tool;
import vehicleShop.models.tool.ToolImpl;
import vehicleShop.models.vehicle.Vehicle;
import vehicleShop.models.vehicle.VehicleImpl;
import vehicleShop.models.worker.BaseWorker;
import vehicleShop.models.worker.FirstShift;
import vehicleShop.models.worker.Worker;

import java.util.ArrayDeque;
import java.util.List;

public class ShopImpl implements Shop {

    // variables
    // constructor
    public ShopImpl() {
    }
    // setters and getters
    // methods




    @Override
    public void make(Vehicle vehicle, Worker worker) {
        boolean hasTools = true;
        ArrayDeque<Tool> tools = (ArrayDeque<Tool>) worker.getTools();
        Tool currentTool = tools.pop();
        while (!vehicle.reached() && worker.canWork() && hasTools) {
            vehicle.making();
            worker.working();
            if (currentTool.isUnfit()) {
                if (!tools.isEmpty()) {
                    currentTool = tools.pop();
                } else {
                    hasTools = false;
                }
            }
        }
    }
}
