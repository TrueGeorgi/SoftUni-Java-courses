package A02_PointInRectangle;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] rectanglePoints = stringToIntArray(scanner.nextLine());

        Point pointBottomLeft = new Point(rectanglePoints[0], rectanglePoints[1]);
        Point pointTopRight = new Point(rectanglePoints[2], rectanglePoints[3]);

        Rectangle rectangle = new Rectangle(pointBottomLeft, pointTopRight);

        int spins = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < spins; i++) {
            int[] pointCoordinates = stringToIntArray(scanner.nextLine());
            Point currentPoint = new Point(pointCoordinates[0], pointCoordinates[1]);
            System.out.println(rectangle.contains(currentPoint));
        }
    }

    public static int[] stringToIntArray (String input) {
        return Arrays.stream(input.split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
