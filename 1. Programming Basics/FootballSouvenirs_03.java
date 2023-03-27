import java.util.Scanner;

public class FootballSouvenirs_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String team = scanner.nextLine();
        String souvenir = scanner.nextLine();
        int amountSouvenirsBought = Integer.parseInt(scanner.nextLine());
        double spend = 0;

        switch (team) {
            case "Argentina":
                switch (souvenir) {
                    case "flags":
                        spend = amountSouvenirsBought * 3.25;
                        System.out.printf("Pepi bought %d %s of %s for %.2f lv.",
                                amountSouvenirsBought,souvenir,team, spend);
                        break;
                    case "caps":
                        spend = amountSouvenirsBought * 7.2;
                        System.out.printf("Pepi bought %d %s of %s for %.2f lv.",
                                amountSouvenirsBought,souvenir,team, spend);
                        break;
                    case "posters":
                        spend = amountSouvenirsBought * 5.1;
                        System.out.printf("Pepi bought %d %s of %s for %.2f lv.",
                                amountSouvenirsBought,souvenir,team, spend);
                        break;
                    case "stickers":
                        spend = amountSouvenirsBought * 1.25;
                        System.out.printf("Pepi bought %d %s of %s for %.2f lv.",
                                amountSouvenirsBought,souvenir,team, spend);
                        break;
                    default:
                        System.out.println("Invalid stock!");
                        break;
                }
                break;
            case "Brazil":
                switch (souvenir) {
                    case "flags":
                        spend = amountSouvenirsBought * 4.2;
                        System.out.printf("Pepi bought %d %s of %s for %.2f lv.",
                                amountSouvenirsBought,souvenir,team, spend);
                        break;
                    case "caps":
                        spend = amountSouvenirsBought * 8.5;
                        System.out.printf("Pepi bought %d %s of %s for %.2f lv.",
                                amountSouvenirsBought,souvenir,team, spend);
                        break;
                    case "posters":
                        spend = amountSouvenirsBought * 5.35;
                        System.out.printf("Pepi bought %d %s of %s for %.2f lv.",
                                amountSouvenirsBought,souvenir,team, spend);
                        break;
                    case "stickers":
                        spend = amountSouvenirsBought * 1.2;
                        System.out.printf("Pepi bought %d %s of %s for %.2f lv.",
                                amountSouvenirsBought,souvenir,team, spend);
                        break;
                    default:
                        System.out.println("Invalid stock!");
                        break;
                }
                break;
            case "Croatia":
                switch (souvenir) {
                    case "flags":
                        spend = amountSouvenirsBought * 2.75;
                        System.out.printf("Pepi bought %d %s of %s for %.2f lv.",
                                amountSouvenirsBought,souvenir,team, spend);
                        break;
                    case "caps":
                        spend = amountSouvenirsBought * 6.9;
                        System.out.printf("Pepi bought %d %s of %s for %.2f lv.",
                                amountSouvenirsBought,souvenir,team, spend);
                        break;
                    case "posters":
                        spend = amountSouvenirsBought * 4.95;
                        System.out.printf("Pepi bought %d %s of %s for %.2f lv.",
                                amountSouvenirsBought,souvenir,team, spend);
                        break;
                    case "stickers":
                        spend = amountSouvenirsBought * 1.1;
                        System.out.printf("Pepi bought %d %s of %s for %.2f lv.",
                                amountSouvenirsBought,souvenir,team, spend);
                        break;
                    default:
                        System.out.println("Invalid stock!");
                        break;
                }
                break;
            case "Denmark":
                switch (souvenir) {
                    case "flags":
                        spend = amountSouvenirsBought * 3.1;
                        System.out.printf("Pepi bought %d %s of %s for %.2f lv.",
                                amountSouvenirsBought,souvenir,team, spend);
                        break;
                    case "caps":
                        spend = amountSouvenirsBought * 6.5;
                        System.out.printf("Pepi bought %d %s of %s for %.2f lv.",
                                amountSouvenirsBought,souvenir,team, spend);
                        break;
                    case "posters":
                        spend = amountSouvenirsBought * 4.8;
                        System.out.printf("Pepi bought %d %s of %s for %.2f lv.",
                                amountSouvenirsBought,souvenir,team, spend);
                        break;
                    case "stickers":
                        spend = amountSouvenirsBought * 0.9;
                        System.out.printf("Pepi bought %d %s of %s for %.2f lv.",
                                amountSouvenirsBought,souvenir,team, spend);
                        break;
                    default:
                        System.out.println("Invalid stock!");
                        break;
                }
                break;
            default:
                System.out.println("Invalid country!");
                break;
        }
    }
}
