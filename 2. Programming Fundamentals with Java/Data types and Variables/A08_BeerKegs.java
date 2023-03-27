import java.util.Scanner;

public class A08_BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalKegs = Integer.parseInt(scanner.nextLine());
        String biggestKeg = "";
        double biggestVolume = 0;

        for (int i = 1; i <= totalKegs ; i++) {
            String modelKeg = scanner.nextLine();
            double radiusKeg = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            double volume = 3.14 * (radiusKeg * radiusKeg) * height;
            if (volume > biggestVolume) {
                biggestVolume = volume;
                biggestKeg = modelKeg;
            }
        }
        System.out.println(biggestKeg);
    }
}
