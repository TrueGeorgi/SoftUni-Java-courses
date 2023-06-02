package AE.ThirdTask;

import java.util.HashSet;
import java.util.Set;

public class Car {

    private String model;

   private double fuelAmount;

   private double fuelCostPerKilometer;

   private int distanceTravelled;

                                                // Constructors


    public Car(String model, double fuelAmount, double fuelCostPerKilometer) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelCostPerKilometer = fuelCostPerKilometer;
        this.distanceTravelled = 0;
    }

    public void isMoving (int distanceToTravel) {
        double fuelCost = fuelCostPerKilometer * distanceToTravel;
        if (fuelCost <= fuelAmount) {
            fuelAmount -= fuelCost;
            distanceTravelled += distanceToTravel;
        } else {
            System.out.println("Insufficient fuel for the drive");
        }
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %d", model, fuelAmount, distanceTravelled);
    }
}
