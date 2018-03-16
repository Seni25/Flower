package accenture_exercise_card;

/**
 * 3. Exercise Description Card class Create a Card class, that has a color and
 * a value. Create a constructor for setting those values Card should be
 * represented as string in this format: ● 9 Hearts ● Jack Diamonds Deck class
 * Create a Deck class, that has a list of cards in it. Create a constructor
 * that takes a whole number as parameter. The constructor should fill the list
 * with the number of different cards using at least 4 different colors (except
 * if the number given is smaller than four, than all cards should have
 * different colors). We should be able to shuffle the deck, which randomly
 * orders the cards.
 * -----Eddig jutottam -------Eddig jutottam --------------
 * We should be able to draw the top card which returns the
 * drawn card and also removes it from the deck. Each card only occurs once in
 * the deck. Deck should be represented as string in this format: ● 12 cards - 3
 * Clubs, 3 Diamonds, 3 Hearts, 3 Spades
 *
 *
 *
 * @author Kazai Ágnes
 */
public class Accenture_exercise_Card {

    /**
     * Itt példányosítottam, objektumot hoztam létre a
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Card nineOfHearts = new Card("9", "Hearts");
        System.out.println(nineOfHearts.toString());

        Card jackDiamonds = new Card("Jack", "Diamonds");
        System.out.println(jackDiamonds.toString());

        DeckOfCards pakli = new DeckOfCards();
        System.out.println(pakli.deck[4].toString());
        for (Card card : pakli.deck) {
            System.out.println(card);
        }

        pakli.suffleCard();
         for (Card card : pakli.deck) {
            System.out.println(card);
        }

    }

}
