package AE04_TrafficLights;

import java.util.Scanner;

public class TrafficLightsMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] signalsString = scanner.nextLine().split("\\s+");

        TrafficLight[] trafficLights = new TrafficLight[signalsString.length];

        for (int i = 0; i < signalsString.length; i++) {
            Signal currentSignal = Signal.valueOf(signalsString[i]);
            TrafficLight trafficLight = new TrafficLight(currentSignal);
            trafficLights[i] = trafficLight;
        }

        int spins = Integer.parseInt(scanner.nextLine());

        while (spins-- > 0) {
            trafficLights = changeTrafficLigthSignals(trafficLights);
            printTrafficLights(trafficLights);
        }

    }

    public static TrafficLight[] changeTrafficLigthSignals(TrafficLight[] trafficLights) {
        for (TrafficLight trafficLight : trafficLights) {
            trafficLight.changeSignal();
        }

        return trafficLights;
    }

    public static void printTrafficLights (TrafficLight[] trafficLights) {
        for (TrafficLight trafficLight : trafficLights) {
            System.out.print(trafficLight.getCurrentSignal().name() + " ");
        }
        System.out.println();
    }
}
