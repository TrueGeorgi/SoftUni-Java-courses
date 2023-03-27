import java.util.*;

public class A04_SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int commands = Integer.parseInt(scanner.nextLine());
        Map<String, String> parking = new LinkedHashMap<>();

        for (int i = 1; i <= commands ; i++) {
            String input = scanner.nextLine();
            String command = input.split(" ")[0];
            String username = input.split(" ")[1];
            switch (command) {
                case "register":
                    String licensePlate = input.split(" ")[2];
                    if (!parking.containsKey(username)) {
                        parking.put(username, licensePlate);
                        System.out.printf("%s registered %s successfully%n", username, licensePlate);
                    } else {
                        System.out.printf("ERROR: already registered with plate number %s%n",
                                licensePlate);
                    }
                    break;
                case "unregister":
                    if (!parking.containsKey(username)) {
                        System.out.printf("ERROR: user %s not found%n", username);
                    } else {
                        parking.remove(username);
                        System.out.printf("%s unregistered successfully%n", username);
                    }
                    break;
            }
        }
        parking.entrySet().forEach(car -> System.out.printf("%s => %s%n", car.getKey(), car.getValue()));
    }
}
