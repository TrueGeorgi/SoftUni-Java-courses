import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class A03_NeedForSpeedIII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCars = Integer.parseInt(scanner.nextLine());

        Map<String, Integer> mileage = new LinkedHashMap<>();
        Map<String, Integer> fuel = new LinkedHashMap<>();

        for (int i = 1; i <= numberOfCars ; i++) {
            String[] newCar = scanner.nextLine().split("\\|");
            String car = newCar[0];
            int mileageCar = Integer.parseInt(newCar[1]);
            int fuelCar = Integer.parseInt(newCar[2]);
            mileage.put(car, mileageCar);
            fuel.put(car, fuelCar);
        }

        String command = scanner.nextLine();
        while (!command.equals("Stop")) {
            String[] commandArr = command.split(" : ");
            String action = commandArr[0];
            String car = commandArr[1];
            switch (action) {
                case "Drive":
                    int distance = Integer.parseInt(commandArr[2]);
                    int neededFuel = Integer.parseInt(commandArr[3]);
                    int availableFuel = fuel.get(car);
                    if (availableFuel >= neededFuel) {
                        int newMileage = distance + mileage.get(car);
                        mileage.put(car, newMileage);
                        int newFuel = availableFuel - neededFuel;
                        fuel.put(car, newFuel);
                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n"
                                , car, distance, neededFuel);
                    } else {
                        System.out.println("Not enough fuel to make that ride");
                    }
                    if (mileage.get(car) >= 100000) {
                        System.out.printf("Time to sell the %s!%n", car);
                        mileage.remove(car);
                        fuel.remove(car);
                    }
                    break;
                case "Refuel":
                    int fillFuel = Integer.parseInt(commandArr[2]);
                    int newFuel = fuel.get(car) + fillFuel;
                    if (newFuel <= 75) {
                        fuel.put(car, newFuel);
                        System.out.printf("%s refueled with %d liters%n", car, fillFuel);
                    } else {
                        int needed = 75 - fuel.get(car);
                        fuel.put(car, 75);
                        System.out.printf("%s refueled with %d liters%n", car, needed);
                    }
                    break;
                case "Revert":
                    int kilometers = Integer.parseInt(commandArr[2]);
                    int currentMileage = mileage.get(car);
                    int newMileage = currentMileage - kilometers;
                    if (newMileage < 10000) {
                        mileage.put(car, 10000);
                    } else {
                        mileage.put(car, newMileage);
                        System.out.printf("%s mileage decreased by %d kilometers%n", car, kilometers);
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        for (Map.Entry<String, Integer> entry : mileage.entrySet()) {
            System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n",
                    entry.getKey(), entry.getValue(), fuel.get(entry.getKey()));
        }
    }
}
