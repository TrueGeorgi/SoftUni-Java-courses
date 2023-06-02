package AE.ThirdTask;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int carsToTrack = Integer.parseInt(scanner.nextLine());

        Map<String, Car> cars = new LinkedHashMap<>();

        while (carsToTrack-- > 0) {
            String[] input = scanner.nextLine().split("\\s+");
            String model = input[0];
            int fuelAmount = Integer.parseInt(input[1]);
            double fuelCost = Double.parseDouble(input[2]);
            cars.put(model, new Car(model, fuelAmount, fuelCost));
        }

        String action = scanner.nextLine();

        while (!action.equals("End")) {

            String carModel = action.split("\\s+")[1];
            int km = Integer.parseInt(action.split("\\s+")[2]);

            cars.get(carModel).isMoving(km);

            action = scanner.nextLine();
        }

        for (Map.Entry<String, Car> entry : cars.entrySet()) {
            System.out.println(entry.getValue().toString());
        }
    }
}
