import java.util.Scanner;

public class Travelling_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String destination = scanner.nextLine();
        while (!destination.equals("End")) {
            double cash = 0;
            double cost = Double.parseDouble(scanner.nextLine());
            while (cash < cost) {
                double income = Double.parseDouble(scanner.nextLine());
                cash += income;
                if (cash >= cost) {
                    System.out.printf("Going to %s!%n", destination);
                }
            }
            destination = scanner.nextLine();
        }
    }
}
