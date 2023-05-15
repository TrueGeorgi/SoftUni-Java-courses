import java.util.*;
import java.util.stream.Collectors;

public class AE09_PoisonousPlants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfStartingPlants = Integer.parseInt(scanner.nextLine());

        List<Integer> plantsPesticide = new ArrayList<>(Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList()));

        ArrayDeque<Integer> positions = new ArrayDeque<>();

        int days = 0;
        boolean continueOperation = true;

        while (continueOperation) {
            int deathPlants = 0;
            for (int i = 0; i <= plantsPesticide.size() - 2; i++) {
                int plant1 = plantsPesticide.get(i);
                int plant2 = plantsPesticide.get(i + 1);
                if (plant1 < plant2) {
                    positions.push(i + 1);
                    deathPlants++;
                }
            }
            if (deathPlants == 0) {
                continueOperation = false;
            } else {
                while (!positions.isEmpty()) {
                    int indexToBeRemoved = positions.pop();
                    plantsPesticide.remove(indexToBeRemoved);
                }
                days++;
            }
        }

        System.out.println(days);
    }
}
