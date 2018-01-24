package w18comp1008s3jan24;

import java.util.ArrayList;

/**
 *
 * @author JWright
 */
public class DeckOfCards {
    private ArrayList<Card> deck;
    
    /**
     * 0 argument constructor
     */
    public DeckOfCards()
    {
        deck = new ArrayList<>();
        String[] validSuits = {"spades","hearts","diamonds","clubs"};
        String[] validFaceNames = 
            {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
        
        for (String suit: validSuits)
        {
            for (String faceName : validFaceNames)
            {
                Card card = new Card(faceName, suit);
                deck.add(card);
            }
        }
    }
}
