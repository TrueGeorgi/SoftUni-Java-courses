import java.util.Arrays;
import java.util.Scanner;

public class A07_MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int longestSequence = 1;
        int longestNumber = 0;
        int currentSequence = 1;

        for (int i = 0; i < input.length - 1; i++) {
            if (input[i] == input[i+1]) {
                currentSequence++;
            } else {
                currentSequence = 1;
            }
            if (currentSequence > longestSequence) {
                longestSequence = currentSequence;
                longestNumber = input[i];
            }
        }
        for (int i = 1; i <= longestSequence ; i++) {
            System.out.print(longestNumber + " ");
        }
    }
}
