package accenture_exercise_card;

/**
 *
 * @author kazai
 */
public class Card {
    private String cardColor;
    private String cardValue;
    
    
    /**
     * Konstruktor a "Card" osztályhoz, két paraméterrel.
     * @param color "Spades","Clubs,"Hearts","Diamonds"
     * @param value "4",...,"10","Jack","Queen","King","Ace"
     */
    public Card(String value, String color){
        cardValue = value;
        cardColor = color;
    }
    
    /**
     * "Card" objektumot String-ként adja vissza.
     * @return 
     */
    @Override
    public String toString(){
        return cardValue +" " + cardColor;
    }
}
