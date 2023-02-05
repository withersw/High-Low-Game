// Import library for user input. 
import java.util.Scanner;

public class Director {
    public boolean isPlaying = true;
    public int score = 300;
    public String userChoice;
    public String playAgain;

    Card card;

    public Director(Card card) {
        this.card = card;
    }

    // Get user's guess
    public void getInputs() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Higher or lower? ");
        userChoice = scanner.nextLine();
    }

    // Generate new card. 
    // Compare new card to old card and update score.
    public void doUpdates() {
        int newCard = card.cardChoice();
        int oldCard = card.cards.get(card.cards.size() - 2);

        if ((userChoice.equals("h") && newCard > oldCard) || (userChoice.equals("l") && newCard < oldCard)) {
            score += 100;
        }
        else {
            score -= 75;
        }

        // Display new card and add it to list of cards.
        System.out.println("The new card was " + newCard);
    }

    // Display score. Prompt user to play again. Check if still playing.
    public void doOutPuts() {
        System.out.println("Your score is " + score);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Play again? [y/n] ");
        playAgain = scanner.nextLine();

        if (playAgain.equals("n") || score <= 0) {
            isPlaying = false;
        }
        else {
            isPlaying = true;
        }
    }

    // Check if isPlaying is true. Call getInput, doUpdates and doOutputs.
    public void startGame() {
        if (score > 0) {
            isPlaying = true;
        }
        else if (score <= 0) {
            isPlaying = false;
        }

        while (isPlaying == true) {
            getInputs();
            doUpdates();
            doOutPuts();
        }
    }

}

