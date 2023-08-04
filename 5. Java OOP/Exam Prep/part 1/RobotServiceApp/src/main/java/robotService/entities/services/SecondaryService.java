package robotService.entities.services;

import robotService.entities.robot.Robot;

public class SecondaryService extends BaseService {

    private static final int INITIAL_CAPACITY = 15;

    public SecondaryService(String name) {
        super(name, INITIAL_CAPACITY);
    }

    @Override
    public void addRobot(Robot robot) {
        String robotType = robot.getClass().getSimpleName();
        if (robotType.equals("FemaleRobot")) {
            super.addRobot(robot);
        }
    }
}
