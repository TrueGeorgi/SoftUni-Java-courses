import java.util.Arrays;
import java.util.Scanner;

public class A04_ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rotations = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= rotations; i++) {
            int firstElement = input[0];
            for (int j = 0; j < input.length - 1; j++) {
                input[j] = input[j +1];
            }
            input[input.length - 1] = firstElement;
        }
        for (int i = 0; i < input.length; i++) {
            if (i < input.length - 1) {
                System.out.print(input[i] + " ");
            } else {
                System.out.print(input[i]);
            }
        }
    }
}
