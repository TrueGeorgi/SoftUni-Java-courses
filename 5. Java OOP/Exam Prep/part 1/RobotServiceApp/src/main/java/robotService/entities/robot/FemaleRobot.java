package robotService.entities.robot;

public class FemaleRobot extends BaseRobot {

    // TODO can only live in secondary service

    private static final int INITIAL_KILOGRAMS = 7;
    private static final int INITIAL_KILOGRAMS_INCREASE = 1;

    public FemaleRobot(String name, String kind, double price) {
        super(name, kind, INITIAL_KILOGRAMS, price);
    }

    @Override
    public void eating() {

       int kg = super.getKilograms() + INITIAL_KILOGRAMS_INCREASE;
       super.setKilograms(kg);
    }



}
