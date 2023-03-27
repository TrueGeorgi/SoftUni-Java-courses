import java.text.DecimalFormat;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class A01_CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] numbers = input.split(" ");

        Map<Double, Integer> timesNumMap = new TreeMap<>();

        for (int i = 0; i < numbers.length; i++) {
            double currentNum = Double.parseDouble(numbers[i]);
            if (!timesNumMap.containsKey(currentNum)) {
                timesNumMap.put(currentNum, 0);
            }
            timesNumMap.put(currentNum, timesNumMap.get(currentNum) + 1);
        }
        for (Map.Entry<Double, Integer> entry : timesNumMap.entrySet()) {
            DecimalFormat df = new DecimalFormat("#.######");
            System.out.printf("%s -> %d%n", df.format(entry.getKey()), entry.getValue());
        }
    }
}
