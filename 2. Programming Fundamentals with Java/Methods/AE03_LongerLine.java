import java.util.Scanner;

public class AE03_LongerLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] pointOne = new int[2];
        int[] pointTwo = new int[2];
        int[] pointThree = new int[2];
        int[] pointFour = new int[2];

        pointOne[0] = Integer.parseInt(scanner.nextLine());
        pointOne[1] = Integer.parseInt(scanner.nextLine());
        pointTwo[0] = Integer.parseInt(scanner.nextLine());
        pointTwo[1] = Integer.parseInt(scanner.nextLine());
        pointThree[0] = Integer.parseInt(scanner.nextLine());
        pointThree[1] = Integer.parseInt(scanner.nextLine());
        pointFour[0] = Integer.parseInt(scanner.nextLine());
        pointFour[1] = Integer.parseInt(scanner.nextLine());

        double radius1 = radius(pointOne);
        double radius2 = radius(pointTwo);
        double radius3 = radius(pointThree);
        double radius4 = radius(pointFour);

        int[][] square1 = compare(pointOne, pointTwo, radius1, radius2);
        int[][] square2 = compare(pointThree, pointFour, radius3, radius4);

        double longerLine1 = longerLine(square1);
        double longerLine2 = longerLine(square2);

        if (longerLine1 >= longerLine2) {
            System.out.printf("(%d, %d)(%d, %d)", square1[0][0], square1[0][1], square1[1][0], square1[1][1]);
        } else {
            System.out.printf("(%d, %d)(%d, %d)", square2[0][0], square2[0][1], square2[1][0], square2[1][1]);
        }
    }
    public static double longerLine (int[][] square) {
        int x1 = square[0][0];
        int x2 = square[1][0];;
        int y1 = square[0][1];
        int y2 = square[1][1];

        double longerLine = ((x1 - x2) * 2) - ((y1 -y2) * 2);
        return longerLine;
    }

    public static double radius(int[] input) {
        double x = input[0];
        double y = input[1];

        return (x * x) + (y * y);
    }
    public static int[][] compare (int[] first, int[] second, double radius1, double radius2) {
        int[][] compare = new int[2][2];
        if (radius1 < radius2) {
            compare[0][0] = first[0];
            compare[0][1] = first[1];
            compare[1][0] = second[0];
            compare[1][1] = second[1];
        } else {
            compare[0][0] = second[0];
            compare[0][1] = second[1];
            compare[1][0] = first[0];
            compare[1][1] = first[1];
        }
        return compare;
    }
}
