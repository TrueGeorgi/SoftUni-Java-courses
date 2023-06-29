package AE02_VehiclesExtension;

import AE02_VehiclesExtension.Vehicles.Bus;
import AE02_VehiclesExtension.Vehicles.Car;
import AE02_VehiclesExtension.Vehicles.Truck;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] carInput = scanner.nextLine().split("\\s+");
        Vehicle car = new Car(Double.parseDouble(carInput[1]), Double.parseDouble(carInput[2]), Double.parseDouble(carInput[3]));

        String[] truckInput = scanner.nextLine().split("\\s+");
        Vehicle truck = new Truck(Double.parseDouble(truckInput[1]), Double.parseDouble(truckInput[2]), Double.parseDouble(truckInput[3]));

        String[] busInput = scanner.nextLine().split("\\s+");
        Bus bus = new Bus(Double.parseDouble(busInput[1]), Double.parseDouble(busInput[2]), Double.parseDouble(busInput[3]));

        int commandsNum = Integer.parseInt(scanner.nextLine());
        String[] command;

        while (commandsNum-- >0) {
            command = scanner.nextLine().split("\\s+");

            switch (command[0]) {
                case "Drive":
                    switch (command[1]) {
                        case "Car":
                            car.drive(Double.parseDouble(command[2]));
                            break;
                        case "Truck":
                            truck.drive(Double.parseDouble(command[2]));
                            break;
                        case "Bus":
                            bus.drive(Double.parseDouble(command[2]));
                            break;
                    }
                    break;
                case "Refuel":
                    switch (command[1]) {
                        case "Car":
                            car.refuel(Double.parseDouble(command[2]));
                            break;
                        case "Truck":
                            truck.refuel(Double.parseDouble(command[2]));
                            break;
                        case "Bus":
                            truck.refuel(Double.parseDouble(command[2]));
                            break;
                    }
                    break;
                    default:
                        bus.driveEmpty(Double.parseDouble(command[2]));
            }
        }
        System.out.printf("%s%n%s%n%s", car, truck, bus);
    }
}
