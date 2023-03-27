import java.util.Scanner;

public class Journey_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String destination = "";
        double moneySpent = 0;
        String accomodation = "";

        if (budget <= 100) {
            destination = "Bulgaria";
            switch (season){
                case "summer":
                    moneySpent = budget * 0.3;
                    accomodation = "Camp";
                    break;
                case "winter":
                    moneySpent = budget * 0.7;
                    accomodation = "Hotel";
                    break;
            }
        } else if (budget <= 1000) {
            destination = "Balkans";
            switch (season){
                case "summer":
                    moneySpent = budget * 0.4;
                    accomodation = "Camp";
                    break;
                case "winter":
                    moneySpent = budget * 0.8;
                    accomodation = "Hotel";
                    break;
            }
        }else {
            destination = "Europe";
            moneySpent = budget * 0.9;
            accomodation = "Hotel";
        }
        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %.2f", accomodation, moneySpent);
    }
}
