// Import Java library for arrays
import java.util.ArrayList;

public class Card {
    // Create new array and card variable. 
    ArrayList<Integer> cards = new ArrayList<Integer>();
    public int card;

    public Card() {

    }
    // Generate a random integer from 0 to 14. 
    // Add it to an array of integers.
    public int cardChoice() {
        card = (int)(Math.random() * 14);
        cards.add(card);
        return card;
    }
}
