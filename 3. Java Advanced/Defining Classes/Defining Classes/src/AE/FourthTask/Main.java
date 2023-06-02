package AE.FourthTask;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Set<Car> cars = new LinkedHashSet<>();

        while (n-- > 0) {
            String[] input = scanner.nextLine().split("\\s+");

            String model = input[0];
            int engineSpeed = Integer.parseInt(input[1]);
            int enginePower = Integer.parseInt(input[2]);
            int cargoWeight = Integer.parseInt(input[3]);
            String cargoType = input[4];
            double tireOnePressure = Double.parseDouble(input[5]);
            int tireOneAge = Integer.parseInt(input[6]);
            double tireTwoPressure = Double.parseDouble(input[7]);
            int tireTwoAge = Integer.parseInt(input[8]);
            double tireThreePressure = Double.parseDouble(input[9]);
            int tireThreeAge = Integer.parseInt(input[10]);
            double tireFourPressure = Double.parseDouble(input[11]);
            int tireFourAge = Integer.parseInt(input[12]);

            System.out.println();

            cars.add(new Car(model
                    , engineSpeed, enginePower
                    , cargoWeight, cargoType
            , tireOnePressure, tireOneAge
            , tireTwoPressure, tireTwoAge
            , tireThreePressure, tireThreeAge
            , tireFourPressure, tireFourAge));

        }

        String command = scanner.nextLine();

        switch (command) {
            case "fragile":
                for (Car car : cars) {
                    if (car.getCargo().getType().equals("fragile") && car.hasTireBelowOne()) {
                        printCarModel(car);
                    }
                }
                break;
            case "flamable":
                for (Car car : cars) {
                    if (car.getCargo().getType().equals("flamable") && car.getEngine().getPower() > 250) {
                        printCarModel(car);
                    }
                }
                break;
        }
    }

    private static void printCarModel(Car car) {
        System.out.println(car.getModel());
    }
}
