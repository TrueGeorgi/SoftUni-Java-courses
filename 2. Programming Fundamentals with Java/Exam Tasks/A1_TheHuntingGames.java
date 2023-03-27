import java.util.Scanner;

public class A1_TheHuntingGames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int people = Integer.parseInt(scanner.nextLine());
        double energy = Double.parseDouble(scanner.nextLine());
        double waterDayPerson = Double.parseDouble(scanner.nextLine());
        double foodDayPerson = Double.parseDouble(scanner.nextLine());
        double waterTotalGroup = waterDayPerson * days * people;
        double foodTotalGroup = foodDayPerson * days * people;


        for (int i = 1; i <= days; i++) {
            if (energy > 0) {
                double energyLost = Double.parseDouble(scanner.nextLine());
                energy -= energyLost;
                if (energy > 0) {
                    if (i % 2 == 0) {
                        double energyAdded = 5.0 / 100.0 * energy;
                        energy += energyAdded;
                        double waterLost = 30.0 / 100.0 * waterTotalGroup;
                        waterTotalGroup -= waterLost;
                    }
                    if (i % 3 == 0) {
                        foodTotalGroup = foodTotalGroup - (foodTotalGroup / people);
                        double energyAdded = 10.0 / 100.0 * energy;
                        energy += energyAdded;
                    }
                }
            }
        }
        if (energy > 0) {
            System.out.printf("You are ready for the quest. You will be left with - %.2f energy!", energy);
        } else {
            System.out.printf("You will run out of energy. You will be left with %.2f food and %.2f water.", foodTotalGroup, waterTotalGroup);
        }
    }
}
