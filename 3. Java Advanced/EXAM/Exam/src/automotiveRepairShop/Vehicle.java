package automotiveRepairShop;

public class Vehicle {

    private String VIN;

    private int mileage;

    private String damage;

    // Constructors

    public Vehicle(String VIN, int mileage, String damage) {
        this.VIN = VIN;
        this.mileage = mileage;
        this.damage = damage;
    }

    // getters

    public String getVIN() {
        return VIN;
    }

    public int getMileage() {
        return mileage;
    }

    public String getDamage() {
        return damage;
    }
// toString

    @Override
    public String toString() {
        return "Damage: " + damage + ", Vehicle: " + VIN + " (" + mileage + " km)";
    }
}
