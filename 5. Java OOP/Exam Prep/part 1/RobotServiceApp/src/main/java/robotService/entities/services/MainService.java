package robotService.entities.services;

import robotService.entities.robot.Robot;

public class MainService extends BaseService {
    private static final int INITIAL_CAPACITY = 30;

    public MainService(String name) {
        super(name, INITIAL_CAPACITY);
    }

    @Override
    public void addRobot(Robot robot) {
        String robotType = robot.getClass().getSimpleName();
        if (robotType.equals("MaleRobot")) {
            super.addRobot(robot);
        }
    }
}
