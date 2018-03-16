package accenture_exercise_card;

/**
 *
 * @author kazai
 */
public class DeckOfCards {

    String[] colors = {"Spades", "Clubs", "Hearts", "Diamonds"};
    String[] values = {"4", "5", "6", "7", "9", "10", "Jack", "Queen", "King", "Ace"};
    Card[] deck = new Card[40];

    /**
     * Konstruktor feltölti a paklit. Létrehozza a kártyákat és beleteszi a kártya típusú tömbe.
     *
     */
    public DeckOfCards() {
        int k = 0;
        /*for (int i = 0; i < colors.length; i++) {
        for (int j = 0; j < values.length; j++) Ez volt eredetileg*/
        for (String color : colors) {
            for (String value : values) {
                Card card = new Card(color, value); //Itt hozza létre a kártyákat.
                deck[k] = card;
                k++;
            }
        }

    }

    /**
     * Megkeveri a pakliban lévő kártyákat a Random függvény használatával.
     */
    public void suffleCard() {
        for (int i = 0; i < deck.length; i++) {
            int index = (int) (Math.random() * deck.length);
            
            Card temp = deck[i];  //Itt pakolgatja.
            deck[i] = deck[index];
            deck[index] = temp;

        }//end loop
    }//end

} //end  class
