import java.util.Scanner;

public class A07_WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int waterTank = 255;
        int timesPour = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= timesPour ; i++) {
            int pour = Integer.parseInt(scanner.nextLine());
            if (waterTank >= pour) {
                waterTank -= pour;
            } else {
                System.out.println("Insufficient capacity!");
            }
        }
        int waterInTank = 255 - waterTank;
        System.out.println(waterInTank);
    }
}
