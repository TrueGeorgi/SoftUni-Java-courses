import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class A01_Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> passengersInTheWagons = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int maxPerWagon = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            if (input.split(" ")[0].equals("Add")) {
                int newWagon = Integer.parseInt(input.split(" ")[1]);
                passengersInTheWagons.add(newWagon);
            } else {
                int passengers = Integer.parseInt(input);
                for (int i = 0; i < passengersInTheWagons.size(); i++) {
                    int space = maxPerWagon - passengersInTheWagons.get(i);
                    if (space >= passengers) {
                        int newAmount = passengersInTheWagons.get(i) + passengers;
                        passengersInTheWagons.set(i, newAmount);
                        break;
                    }
                }
            }

            input = scanner.nextLine();
        }
        for (int wagon : passengersInTheWagons) {
            System.out.print(wagon + " ");
        }
    }
}
