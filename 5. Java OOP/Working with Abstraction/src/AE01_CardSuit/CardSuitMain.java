package AE01_CardSuit;

public class CardSuitMain {
    public static void main(String[] args) {

        System.out.println("Card Suits:");

        for (Suit suit : Suit.values()) {
            System.out.println("Ordinal value: " + suit.ordinal() + "; Name value: " + suit.name());
        }
    }
}
