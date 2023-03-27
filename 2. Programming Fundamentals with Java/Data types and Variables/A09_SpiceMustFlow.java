import java.util.Scanner;

public class A09_SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yield = Integer.parseInt(scanner.nextLine());
        int dayCount = 0;
        int yieldStorage = 0;
        while (yield >= 100) {
            dayCount++;
            yieldStorage += yield - 26;
            yield -= 10;
        }
        yieldStorage -= 26;
        if (yieldStorage < 0) {
            yieldStorage = 0;
        }
        System.out.println(dayCount);
        System.out.println(yieldStorage);
    }
}
