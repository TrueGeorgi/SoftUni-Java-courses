import java.util.Scanner;

public class Moving_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int widthSpace = Integer.parseInt(scanner.nextLine());
        int lengthSpace = Integer.parseInt(scanner.nextLine());
        int highSpace = Integer.parseInt(scanner.nextLine());
        int space = widthSpace * lengthSpace * highSpace;
        String boxesString = scanner.nextLine();
        while (!boxesString.equals("Done")) {
            int boxes = Integer.parseInt(boxesString);
            space -= boxes;
            if (space <= 0) {
                break;
            }
            boxesString = scanner.nextLine();
        }
        if (space > 0) {
            System.out.printf("%d Cubic meters left.", space);
        } else {
            System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(space));
        }
    }
}
