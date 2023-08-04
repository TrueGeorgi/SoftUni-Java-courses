package vehicleShop.models.worker;

public class SecondShift extends BaseWorker {

    private final static int DEFAULT_STRENGTH = 70;
    private final static int EXTRA_DECREASE_AFTER_WORKING = 5;
    // TODO maybe constructor - protected?
    public SecondShift(String name) {
        super(name, DEFAULT_STRENGTH);
    }

    @Override
    public void working() {
        super.decreaseStrengthWorking += EXTRA_DECREASE_AFTER_WORKING;
        super.working();
    }
}
