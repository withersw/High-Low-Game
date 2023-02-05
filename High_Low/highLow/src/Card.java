import java.util.ArrayList;

public class Card {
    ArrayList<Integer> cards = new ArrayList<Integer>();
    public int card;

    public Card() {

    }
    // Generate a random integer from 0 to 14 and add it to an array of integers.
    public int cardChoice() {
        card = (int)(Math.random() * 14);
        cards.add(card);
        return card;
    }
}
