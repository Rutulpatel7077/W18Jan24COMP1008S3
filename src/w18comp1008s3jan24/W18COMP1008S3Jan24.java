
package w18comp1008s3jan24;

/**
 *
 * @author JWright
 */
public class W18COMP1008S3Jan24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //challenge 1
        for (int counter=100; counter>= 1; counter -= 5)
            System.out.println(counter);
        
        //challenge 2
        for (int counter=0; counter<= 100; counter += 10)
            System.out.println(counter);
        
        //challenge 3
        for (int counter=0; counter<= 100; counter += 10)
            System.out.printf("%d %s%n", counter, counter%20==0? "Java":"");
        
        //create a method called timeToSki and test it
        System.out.printf("With 30 cm of snow, the result is %b%n",timeToSki(30));
        System.out.printf("With 31 cm of snow, the result is %b%n",timeToSki(31));
           
    }
    
    /**
     * This method will return true if the snow depth is over 30 cm
     */
    public static boolean timeToSki(int snowDepth)
    {
        return snowDepth>30;
    }
    
}
