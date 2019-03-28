package classesAndObjects;
public class Card3 {
    private final Rank rank;
    private final Suit suit;
   
    public Card3(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
        System.out.println("dgh");

    }

    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

    public String toString() {
        return rank + " of " + suit;
       
    }
}
