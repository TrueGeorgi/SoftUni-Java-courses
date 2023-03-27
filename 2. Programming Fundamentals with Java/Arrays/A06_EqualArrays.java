import java.util.Arrays;
import java.util.Scanner;

public class A06_EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] lineOne = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] lineTwo = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sum = 0;
        int index = -1;
        boolean isIdentical = true;
        for (int i = 0; i < lineOne.length; i++) {
            if (lineOne[i] == lineTwo[i]) {
                sum += lineOne[i];
            } else {
                index = i;
                System.out.printf("Arrays are not identical. Found difference at %d index.", index);
                isIdentical = false;
                break;
            }
        }
        if (isIdentical) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }
    }
}
