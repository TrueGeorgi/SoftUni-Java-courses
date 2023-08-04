package vehicleShop.models.worker;

import vehicleShop.common.ExceptionMessages;
import vehicleShop.models.tool.Tool;

import java.util.*;

public abstract class BaseWorker implements Worker {

    // DATA

    private String name;
    private int strength;

    protected int decreaseStrengthWorking = 10;

    private Collection<Tool> tools;

    // Constructor

    protected BaseWorker(String name, int strength) {
        setName(name);
        setStrength(strength);
        this.tools = new ArrayDeque<>();
    }


    // Setters + getters

    @Override
    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        if (name == null || name.equals("")) {
            throw new IllegalArgumentException(ExceptionMessages.WORKER_NAME_NULL_OR_EMPTY);
        }
        this.name = name;
    }

    @Override
    public int getStrength() {
        return this.strength;
    }

    private void setStrength(int strength) {
        if (strength < 0) {
            throw new IllegalArgumentException(ExceptionMessages.WORKER_STRENGTH_LESS_THAN_ZERO);
        }
        this.strength = strength;
    }


    @Override
    public Collection<Tool> getTools() {
        return tools;
    }

    // Methods

    @Override
    public void working() {
        this.strength -= decreaseStrengthWorking;
        if (this.strength < 0) {
            setStrength(0);
        }
    }

    @Override
    public void addTool(Tool tool) {

        this.tools.add(tool);

    }

    @Override
    public boolean canWork() {
        if (this.strength > 0) {
            return true;
        } else {
            return false;
        }
    }




}
