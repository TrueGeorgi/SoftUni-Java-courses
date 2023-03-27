package A05_VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Vehicle> vehicles = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String typeOfVehicleLow = input.split("\\s+")[0];
            String typeOfVehicle = typeOfVehicleLow.substring(0, 1).toUpperCase() + typeOfVehicleLow.substring(1);
            String modelOfVehicle = input.split("\\s+")[1];
            String colorOfVehicle = input.split("\\s+")[2];
            String horsepowerOfVehicle = input.split("\\s+")[3];

            Vehicle vehicle = new Vehicle(typeOfVehicle
            ,modelOfVehicle
            ,colorOfVehicle
            ,horsepowerOfVehicle);

            vehicles.add(vehicle);

            input = scanner.nextLine();
        }
        input = scanner.nextLine();
        while (!input.equals("Close the Catalogue")) {
            String currentModel = input;
            for (Vehicle vehicle : vehicles) {
                if (vehicle.getModel().equals(currentModel)) {
                    System.out.println(vehicle);
                    break;
                }
            }
            input = scanner.nextLine();
        }
        double totalCarsHorsepower = 0;
        int amountOfCars = 0;
        double totalTrucksHorsepower = 0;
        int amountOfTrucks = 0;

        for (Vehicle vehicle : vehicles) {
            if (vehicle.getType().equals("Car")) {
                totalCarsHorsepower += Double.parseDouble(vehicle.getHorsePower());
                amountOfCars++;
            } else {
                totalTrucksHorsepower += Double.parseDouble(vehicle.getHorsePower());
                amountOfTrucks++;
            }
        }
        double averageHPCars = 0;
        double averageHPTrucks = 0;
        if (amountOfCars > 0) {
            averageHPCars = totalCarsHorsepower / amountOfCars;
        }
        if (amountOfTrucks > 0) {
            averageHPTrucks = totalTrucksHorsepower / amountOfTrucks;
        }
        System.out.printf("Cars have average horsepower of: %.2f.%n", averageHPCars);
        System.out.printf("Trucks have average horsepower of: %.2f.", averageHPTrucks);
    }
}
