package A05_BorderControl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputRaw = scanner.nextLine();

        List<Identifiable> inhabitants = new ArrayList<>();

        while (!inputRaw.equals("End")) {

            String[] input = inputRaw.split("\\s+");

            Identifiable inhabitant = null;

            if (input.length == 2) {
                String model = input[0];
                String id = input[1];
                inhabitant = new Robot(model, id);
            } else {
                String name = input[0];
                int age = Integer.parseInt(input[1]);
                String id = input[2];
                inhabitant = new Citizen(name, age, id);
            }

            inhabitants.add(inhabitant);

            inputRaw = scanner.nextLine();
        }

        String endIdSuffix = scanner.nextLine();

        inhabitants.stream().map(Identifiable::getId).filter(id -> id.endsWith(endIdSuffix)).forEach(System.out::println);
    }
}
