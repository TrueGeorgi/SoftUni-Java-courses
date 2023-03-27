import java.util.Arrays;
import java.util.Scanner;

public class A08_MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int uniqueNumber = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < input.length - 1; i++) {
            for (int j = i+1; j < input.length ; j++) {
                if (input[i] + input[j] == uniqueNumber) {
                    System.out.println(input[i] + " " + input[j]);
                }
            }
        }
    }
}
