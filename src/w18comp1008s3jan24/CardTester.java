
package w18comp1008s3jan24;

/**
 *
 * @author JWright
 */
public class CardTester {
    public static void main(String[] args)
    {
        //the next line "instantiates" an object
        Card card1 = new Card("Ace","Spades");
        System.out.printf("The suit of my card is: %s%n", card1.getSuit());
        System.out.printf("The name of my card is: %s%n", card1.getFaceName());
        
        Card card2 = new Card("King","spades");
        System.out.printf("The suit of my card is: %s%n", card2.getSuit());
        System.out.printf("The name of my card is: %s%n", card2.getFaceName());
        System.out.printf("The value of my card is: %d%n", card2.getValue());
        System.out.printf("My card2 is: %s %n", card2);
        System.out.printf("My card1 is: %s %n", card1);
        
        DeckOfCards deck = new DeckOfCards();
        System.out.print(deck);
    }
}
