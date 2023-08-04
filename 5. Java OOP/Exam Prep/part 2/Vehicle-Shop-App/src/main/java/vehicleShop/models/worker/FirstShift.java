package vehicleShop.models.worker;

public class FirstShift extends BaseWorker {

    private final static int DEFAULT_STRENGTH = 100;
// TODO maybe constructor - protected?
    public FirstShift(String name) {
        super(name, DEFAULT_STRENGTH);
    }

}
