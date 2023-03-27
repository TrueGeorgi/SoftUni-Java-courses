import java.util.Scanner;

public class TrekkingMania_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int groups = Integer.parseInt(scanner.nextLine());
        int musala = 0;
        int monblanc = 0;
        int kilimanjaro = 0;
        int k2 = 0;
        int everest = 0;
        int climbers = 0;
        for (int i = 1; i <= groups; i++) {
            int groupSize = Integer.parseInt(scanner.nextLine());
            climbers+= groupSize;
            if (groupSize <= 5) {
                musala += groupSize;
            } else if (groupSize <= 12) {
                monblanc += groupSize;
            } else if (groupSize <= 25) {
                kilimanjaro += groupSize;
            } else if (groupSize <= 40) {
                k2 += groupSize;
            } else {
                everest += groupSize;
            }
        }
        double musalaPercent = musala * 1.0 / climbers * 100;
        double monblacPercent = monblanc * 1.0 / climbers * 100;
        double kilimanjaroPercent = kilimanjaro * 1.0 / climbers * 100;
        double k2Percent = k2 * 1.0 / climbers * 100;
        double everestPercent = everest * 1.0 / climbers * 100;

        System.out.printf("%.2f%%%n", musalaPercent);
        System.out.printf("%.2f%%%n", monblacPercent);
        System.out.printf("%.2f%%%n", kilimanjaroPercent);
        System.out.printf("%.2f%%%n", k2Percent);
        System.out.printf("%.2f%%", everestPercent);
    }
}
