package vehicleShop;

import vehicleShop.core.Engine;
import vehicleShop.core.EngineImpl;
import vehicleShop.models.shop.Shop;
import vehicleShop.models.shop.ShopImpl;
import vehicleShop.models.vehicle.VehicleImpl;
import vehicleShop.models.worker.FirstShift;
import vehicleShop.models.worker.Worker;

public class Main {
    public static void main(String[] args) {
        Engine engine = new EngineImpl();
        engine.run();

    }
}
