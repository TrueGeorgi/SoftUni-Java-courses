import java.util.Scanner;

public class AE02_CenterPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] pointOne = new int[2];
        int[] pointTwo = new int[2];

        pointOne[0] = Integer.parseInt(scanner.nextLine());
        pointOne[1] = Integer.parseInt(scanner.nextLine());
        pointTwo[0] = Integer.parseInt(scanner.nextLine());
        pointTwo[1] = Integer.parseInt(scanner.nextLine());

        double radius1 = radius(pointOne);
        double radius2 = radius(pointTwo);

        if (radius1 < radius2) {
            System.out.printf("(%d, %d)", pointOne[0], pointOne[1]);
        } else {
            System.out.printf("(%d, %d)", pointTwo[0], pointTwo[1]);
        }

    }
    public static double radius (int[] input) {
        double x = input[0];
        double y = input[1];

        return Math.pow(x, x) + Math.pow(y, y);
    }
}
