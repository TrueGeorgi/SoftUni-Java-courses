import java.util.Scanner;

public class Oscars_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String actor = scanner.nextLine();
        double academyPoints = Double.parseDouble(scanner.nextLine());
        int jury = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= jury; i++) {
            String juryName = scanner.nextLine();
            double juryPoints = juryName.length() * Double.parseDouble(scanner.nextLine()) / 2;
            academyPoints += juryPoints;
            if (academyPoints > 1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actor, academyPoints);
                break;
            }
        }
        if (academyPoints <= 1250.5) {
            double pointsNeeded = 1250.5 - academyPoints;
            System.out.printf("Sorry, %s you need %.1f more!", actor, pointsNeeded);
        }
    }
}
