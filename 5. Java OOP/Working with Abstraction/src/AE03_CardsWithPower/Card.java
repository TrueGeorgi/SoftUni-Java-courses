package AE03_CardsWithPower;

public class Card {

    Rank rank;
    Suit suit;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public int cardPower () {
        return rank.getValue() + suit.getValue();
    }

    public String getName() {
        return this.rank + " of " + this.suit;
    }

}
