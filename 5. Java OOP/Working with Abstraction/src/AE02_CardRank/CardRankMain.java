package AE02_CardRank;

public class CardRankMain {
    public static void main(String[] args) {

        System.out.println("Card Ranks:");

        for (Rank rank : Rank.values()) {
            System.out.println("Ordinal value: " + rank.ordinal() + "; Name value: " + rank.name());
        }
    }
}
