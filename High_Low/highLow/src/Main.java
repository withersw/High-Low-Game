public class Main {
    public static void main(String[] args) {
        Card card = new Card();
        Director director = new Director(card);
        int firstCard = card.cardChoice();
        System.out.println("The card is " + firstCard);
        director.startGame();
    }
}