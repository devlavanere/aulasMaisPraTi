package lesson7_java_ed.doublyLinkedList.exercicio_05;

public class CardGameMain {
    public static void main(String[] args) {
        CardGame game = new CardGame();
        game.addCard("Ace of Spades");
        game.addCard("King of Hearts");
        game.addCard("Queen of Clubs");
        game.displayHand();
        game.removeCard("King of Hearts");
        game.displayHand();
        game.moveCard("Queen of Clubs", 0);
        game.displayHand();
    }
}
