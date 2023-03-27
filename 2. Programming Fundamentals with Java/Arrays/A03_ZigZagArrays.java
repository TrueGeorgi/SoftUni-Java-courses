import java.util.Arrays;
import java.util.Scanner;

public class A03_ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());

        int[] groupOne = new int[lines];
        int[] groupTwo = new int[lines];
        int counter = 1;

        for (int i = 0; i < lines; i++) {
            int[] input = Arrays
                    .stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            if (counter % 2 == 0) {
                groupTwo[i] = input[0];
                groupOne[i] = input[1];
            } else {
                groupOne[i] = input[0];
                groupTwo[i] = input[1];
            }
            counter++;
        }
        for (int i = 0; i < groupOne.length; i++) {
            if (i == groupOne.length -1) {
                System.out.println(groupOne[i]);
            } else {
                System.out.print(groupOne[i] + " ");
            }
        }
        for (int i = 0; i < groupTwo.length; i++) {
            if (i == groupTwo.length -1) {
                System.out.println(groupTwo[i]);
            } else {
                System.out.print(groupTwo[i] + " ");
            }
        }
    }
}
