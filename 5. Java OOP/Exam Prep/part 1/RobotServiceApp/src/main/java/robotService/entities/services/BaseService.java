package robotService.entities.services;

import robotService.common.ExceptionMessages;
import robotService.entities.robot.Robot;
import robotService.entities.supplements.Supplement;
import robotService.utils.StringUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

public abstract class BaseService implements Service {
    private String name;
    private int capacity;
    private final Collection<Supplement> supplements;
    private final Collection<Robot> robots;

    // TODO constructor - I have all the setters


    protected BaseService(String name, int capacity) {
        setName(name);
        setCapacity(capacity);
        this.supplements = new ArrayList<>();
        this.robots = new ArrayList<>();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new NullPointerException(ExceptionMessages.SERVICE_NAME_CANNOT_BE_NULL_OR_EMPTY);
        }
        this.name = name;
    }

    public int getCapacity() {
        return this.capacity;
    }

    private void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public Collection<Robot> getRobots() {
        return Collections.unmodifiableCollection(this.robots);
    }

    @Override
    public Collection<Supplement> getSupplements() {
        return Collections.unmodifiableCollection(this.supplements);
    }

    @Override
    public void addRobot(Robot robot) {
        if (getCapacity() > this.getRobots().size()) {
            this.robots.add(robot);
        } else {
            throw new IllegalStateException(ExceptionMessages.NOT_ENOUGH_CAPACITY_ROBOT);
        }
    }
    // TODO maybe the try/catch
    @Override
    public void removeRobot(Robot robot) {
            this.robots.remove(robot);
    }
    // TODO seems Ok but maybe some check for the input?
    @Override
    public void addSupplement(Supplement supplement) {
        this.supplements.add(supplement);
    }

    @Override
    public void feeding() {
        this.robots.forEach(Robot::eating);
    }

    @Override
    public int sumHardness() {
        return this.getSupplements().stream().mapToInt(Supplement::getHardness).sum();
    }

    @Override
    public String getStatistics() {
        String introOutput = getName() + " " + getClass().getSimpleName() + ":\n";
        String robotsOutput = "Robots: " + (!this.getRobots().isEmpty() ? this.getRobots().stream().map(Robot::getName).collect(Collectors.joining(" ")) : "none") + "\n";
        String supplementsOutput = "Supplements: " + this.getSupplements().size() + " Hardness: " + this.sumHardness();
        return introOutput + robotsOutput + supplementsOutput;

//        String template = "%s %s:" + System.lineSeparator()
//                + "Robots: %s" + System.lineSeparator()
//                + "Supplements: %d Hardness: %d";
//
//        return String.format(template,
//                this.getName(),
//                this.getClass().getSimpleName(),
//                this.getRobots().isEmpty() ?
//                        "none" :
//                        this.getRobots().stream().map(Robot::getName)
//                                .collect(Collectors.joining(" ")),
//                this.getSupplements().size(),
//                this.sumHardness());
                }
}
