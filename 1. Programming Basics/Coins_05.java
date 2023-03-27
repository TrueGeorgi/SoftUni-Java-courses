import java.text.DecimalFormat;
import java.util.Scanner;

public class Coins_05 {
    public static void main(String[] args) {
        // 2,1,0.5,0.2,0.1,0.05,0.02,0.01
        Scanner scanner = new Scanner(System.in);
        double change = Math.round(Double.parseDouble(scanner.nextLine()) * 100);
        int coinsCount = 0;
        while (change > 0) {
            coinsCount++;
            if (change >= 200) {
                change -= 200;
            } else if (change >= 100) {
                change -= 100;
            } else if (change >= 50) {
                change -= 50;
            } else if (change >= 20) {
                change -= 20;
            } else if (change >= 10) {
                change -= 10;
            } else if (change >= 5) {
                change -= 5;
            } else if (change >= 2) {
                change -= 2;
            } else if (change >= 1) {
                change -= 1;
            }
        }
        System.out.println(coinsCount);
    }
}
