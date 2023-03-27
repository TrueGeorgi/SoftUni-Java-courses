import java.util.Scanner;

public class A11_Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfSnowballs = Integer.parseInt(scanner.nextLine());
        int bestSnow = 0;
        int bestTime = 0;
        int bestQuality = 0;
        double bestValue = 0;
        for (int i = 1; i <= numberOfSnowballs ; i++) {
            int snow = Integer.parseInt(scanner.nextLine());
            int time = Integer.parseInt(scanner.nextLine());
            int quality = Integer.parseInt(scanner.nextLine());
            int midQuality = snow / time;
            double value = Math.pow(midQuality, quality);

            if (value > bestValue) {
                bestSnow = snow;
                bestQuality = quality;
                bestTime = time;
                bestValue = value;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)", bestSnow, bestTime, bestValue, bestQuality);
    }
}
