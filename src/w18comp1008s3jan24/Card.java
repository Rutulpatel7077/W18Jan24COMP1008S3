package w18comp1008s3jan24; //This allows other classes in the same package
                            //to "see" each other

/**
 *
 * @author JWright
 */
//This is how we define a class 
public class Card {
    
    //these are "instance" variables.  We make them private so that our
    //class controls how they are modified and accessed
    private String faceName, suit;

    /**
     * This is a constructor.  It is automatically called when we create 
     * a new instance of the class.  It's job is to validate and set 
     * the instance variables to ensure we have a valid instance of our
     * class
     * @param faceName
     * @param suit 
     */
    public Card(String faceName, String suit) {
        this.faceName = faceName;
        this.suit = suit;
    }
}
