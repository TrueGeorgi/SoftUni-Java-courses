import java.text.DecimalFormat;
import java.util.*;

public class AE10_Robotics {
    private static int secondsPassed;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputRobots = scanner.nextLine().split(";");

        int[] startingTime = Arrays.stream(scanner.nextLine().split(":"))
                .mapToInt(Integer::parseInt)
                .toArray();

        String inputProducts = scanner.nextLine();

        Map<String, Integer> robots = new LinkedHashMap<>();

        ArrayDeque<String> freeRobots = new ArrayDeque<>();

        Map<String, Integer> workingRobots = new LinkedHashMap<>();

        ArrayDeque<String> products = new ArrayDeque<>();

        int hour = startingTime[0];
        int minutes = startingTime[1];
        int seconds = startingTime[2];

        for (int i = 0; i < inputRobots.length; i++) {
            String robotName = inputRobots[i].split("-")[0];
            int processTime = Integer.parseInt(inputRobots[i].split("-")[1]);

            robots.put(robotName, processTime);
            freeRobots.offer(robotName);
        }

        while (!inputProducts.equals("End")) {
            products.offer(inputProducts);
            inputProducts = scanner.nextLine();
        }

        while (!products.isEmpty()) {
            seconds++;
            String product = products.poll();

            if (seconds == 60) {
                seconds = 0;
                minutes++;
                if (minutes == 60) {
                    minutes = 0;
                    hour++;
                }
            }

            if (!freeRobots.isEmpty()) {
                String currentRobot = freeRobots.poll();
                int currentRobotProcessTime = robots.get(currentRobot);

                System.out.printf("%s - %s [%02d:%02d:%02d]%n"
                        , currentRobot
                        , product
                        , hour
                        , minutes
                        , seconds);

                workingRobots.put(currentRobot, currentRobotProcessTime);
            } else {
                products.offer(product);
            }

            for (Map.Entry<String, Integer> entry : workingRobots.entrySet() ) {
                entry.setValue(entry.getValue() - 1);

                if (entry.getValue() == 0) {
                    freeRobots.offer(entry.getKey());
                    workingRobots.remove(entry);
                }

            }
        }
    }
}
