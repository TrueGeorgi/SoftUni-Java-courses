package AE.FifthTask;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int inputEngines = Integer.parseInt(scanner.nextLine());

        Map<String, Engine> engines = new LinkedHashMap<>();
        List<Car> cars = new ArrayList<>();

        while (inputEngines-- > 0) {
            String[] input = scanner.nextLine().split("\\s+");

            int inputLength = input.length;

            String engineModel = input[0];
            String enginePower = input[1];

            switch (inputLength) {
                case 2:
                    engines.put(engineModel, new Engine(engineModel, enginePower));
                    break;
                case 3:
                    if (input[2].charAt(0) >= 48 && input[2].charAt(0) <= 57) {
                        int engineDisplacement = Integer.parseInt(input[2]);
                        engines.put(engineModel, new Engine(engineModel, enginePower, engineDisplacement));
                    } else {
                        String engineEfficiency = input[2];
                        engines.put(engineModel, new Engine(engineModel, enginePower, engineEfficiency));
                    }
                    break;
                case 4:
                    int engineDisplacement = Integer.parseInt(input[2]);
                    String engineEfficiency = input[3];
                    engines.put(engineModel, new Engine(engineModel, enginePower, engineDisplacement, engineEfficiency));
                    break;
            }
        }

        int inputCars = Integer.parseInt(scanner.nextLine());

        while (inputCars-- > 0) {
            String[] input = scanner.nextLine().split("\\s+");

            String carModel = input[0];

            String engineCar = input[1];

            int inputLength = input.length;

            switch (inputLength) {
                case 2:
                    cars.add(new Car(carModel, engines.get(engineCar)));
                    break;
                case 3:
                    if (input[2].charAt(0) >= 48 && input[2].charAt(0) <= 57) {
                        int carWeight = Integer.parseInt(input[2]);
                        cars.add(new Car(carModel, engines.get(engineCar), carWeight));
                    } else {
                        String color = input[2];
                        cars.add(new Car(carModel, engines.get(engineCar), color));
                    }
                    break;
                case 4:
                   int carWeight = Integer.parseInt(input[2]);
                    String color = input[3];
                    cars.add(new Car(carModel, engines.get(engineCar), carWeight, color));
                    break;
            }
        }

        for (Car car : cars) {
            System.out.println(car.toString());
        }
    }
}
