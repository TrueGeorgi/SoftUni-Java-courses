package robotService.entities.robot;

public class MaleRobot extends BaseRobot {
    // TODO can only live in Main service

    private static final int INITIAL_KILOGRAMS = 9;
    private static final int INITIAL_KILOGRAMS_INCREASE = 3;

    public MaleRobot(String name, String kind, double price) {
        super(name, kind, INITIAL_KILOGRAMS, price);
    }

    @Override
    public void eating() {
        int kg = super.getKilograms() + INITIAL_KILOGRAMS_INCREASE;
        super.setKilograms(kg);
    }
}
