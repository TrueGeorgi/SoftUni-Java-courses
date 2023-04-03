import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class A04_CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToDouble(Double::parseDouble)
                .toArray();

        Map<Double, Integer> timesANumber = new LinkedHashMap<>();

        for (double num : input) {
            if (!timesANumber.containsKey(num)) {
                timesANumber.put(num, 0);
            }
            int times = timesANumber.get(num) + 1;
            timesANumber.put(num, times);
        }
        timesANumber.forEach((n, t) -> System.out.printf("%.1f -> %d%n", n, t));
    }
}
