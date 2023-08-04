package vehicleShop.models.vehicle;

import vehicleShop.common.ExceptionMessages;

public class VehicleImpl implements Vehicle {

    // variables
    private String name;
    private int strengthRequired;

    private final static int DECREASE_WHILE_MAKING = 5;

    // constructor

    public VehicleImpl(String name, int strengthRequired) {
        setName(name);
        setStrengthRequired(strengthRequired);
    }

    // getters and setters
    @Override
    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException(ExceptionMessages.VEHICLE_NAME_NULL_OR_EMPTY);
        }
        this.name = name;
    }

    @Override
    public int getStrengthRequired() {
        return this.strengthRequired;
    }

    private void setStrengthRequired(int strengthRequired) {
        if (strengthRequired < 0) {
            throw new IllegalArgumentException(ExceptionMessages.VEHICLE_STRENGTH_LESS_THAN_ZERO);
        }
        this.strengthRequired = strengthRequired;
    }

    // methods

    @Override
    public boolean reached() {
        if (strengthRequired == 0) {
            return true;
        }
        return false;
    }

    @Override
    public void making() {
        this.strengthRequired -= DECREASE_WHILE_MAKING;
        if (getStrengthRequired() < 0) {
            setStrengthRequired(0);
        }
    }
}
