import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class A01_01_ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> cars = new LinkedHashSet<>();

        String input = scanner.nextLine();

        while (!input.equals("END")) {

            String[] actionAndCar = input.split(", ");
            String action = actionAndCar[0];
            String carPlate = actionAndCar[1];

            switch (action) {
                case "IN":
                    cars.add(carPlate);
                    break;
                case "OUT":
                    if (!cars.isEmpty()) {
                        cars.remove(carPlate);
                    } else {
                        System.out.println("Parking Lot is Empty");
                    }
                    break;
            }

            input = scanner.nextLine();
        }
        if (cars.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
            for (String car : cars) {
                System.out.println(car);
            }
        }
    }
}
