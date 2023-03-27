import java.util.Scanner;

public class Gymnastics_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String country = scanner.nextLine();
        String item = scanner.nextLine();
        double points = 0;
        switch (country) {
            case "Russia":
                switch (item){
                    case "ribbon":
                        points = 9.1 + 9.4;
                        break;
                    case "hoop":
                        points = 9.3 + 9.8;
                        break;
                    case "rope":
                        points = 9.6 + 9;
                        break;
                }
                break;
            case "Bulgaria":
                switch (item){
                    case "ribbon":
                        points = 9.6 + 9.4;
                        break;
                    case "hoop":
                        points = 9.55 + 9.75;
                        break;
                    case "rope":
                        points = 9.5 + 9.4;
                        break;
                }
                break;
            case "Italy":
                switch (item){
                    case "ribbon":
                        points = 9.2 + 9.5;
                        break;
                    case "hoop":
                        points = 9.45 + 9.35;
                        break;
                    case "rope":
                        points = 9.7 + 9.15;
                        break;
                }
                break;
        }
        double pointsNeeded = 20 - points;
        double percentNeeded = pointsNeeded / 20 * 100;
        System.out.printf("The team of %s get %.3f on %s.%n", country, points, item);
        System.out.printf("%.2f%%", percentNeeded);
    }
}
