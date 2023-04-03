import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class A01_ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Set<String> cars = new LinkedHashSet<>();

        while (!input.equals("END")) {

            String action = input.split(",\\s+")[0];
            String registrationPlate = input.split(",\\s+")[1];

            switch (action) {
                case "IN":
                    cars.add(registrationPlate);
                    break;
                case "OUT":
                    cars.remove(registrationPlate);
                    break;

            }
            input = scanner.nextLine();
        }
        if (cars.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
            cars.forEach(System.out::println);
        }
    }
}
