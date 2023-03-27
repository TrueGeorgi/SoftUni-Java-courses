import java.util.Arrays;
import java.util.Scanner;

public class A05_TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i < input.length; i++) {
            int biggestNumber = input[i];
            boolean isBigger = true;
            for (int j = i + 1; j < input.length; j++) {
                if (biggestNumber <= input[j]) {
                    isBigger = false;
                    break;
                }
            }
            if (isBigger) {
                System.out.print(biggestNumber + " ");
            }
        }
    }
}
