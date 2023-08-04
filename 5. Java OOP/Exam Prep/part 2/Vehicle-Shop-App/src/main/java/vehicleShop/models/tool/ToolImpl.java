package vehicleShop.models.tool;

import vehicleShop.common.ExceptionMessages;

public class ToolImpl implements Tool {

    // variables
    private int power;

    private final static int DECREASE_POWER_WITH = 5;
    // constructor

    public ToolImpl(int power) {
        setPower(power);
    }

    // getters + setters
    @Override
    public int getPower() {
        return this.power;
    }

    private void setPower(int power) {
        if (power < 0 ) {
            throw new IllegalArgumentException(ExceptionMessages.TOOL_POWER_LESS_THAN_ZERO);
        }
        this.power = power;
    }

    // methods



    @Override
    public void decreasesPower() {
        this.power -= DECREASE_POWER_WITH;
        if (getPower() < 0) {
            setPower(0);
        }
    }

    @Override
    public boolean isUnfit() {
        if (getPower() == 0) {
            return true;
        }
        return false;
    }
}
