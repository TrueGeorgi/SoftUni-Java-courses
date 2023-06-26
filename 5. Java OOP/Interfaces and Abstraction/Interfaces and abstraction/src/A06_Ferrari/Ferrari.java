package A06_Ferrari;

public class Ferrari implements Car{

    private static final String MODEL = "488-Spider";
    private String driverName;

    public Ferrari (String driverName) {
        this.driverName = driverName;
    }

    @Override
    public String brakes() {
        return Car.super.brakes();
    }

    @Override
    public String gas() {
        return Car.super.gas();
    }

    @Override
    public String toString() {
        return String.format("%s/%s/%s/%s", MODEL, brakes(), gas(), this.driverName);
    }
}
