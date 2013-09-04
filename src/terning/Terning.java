
package terning;

import java.util.Random;

/**
 *
 * @author Kim Vammen
 */
public class Terning
{
    public final static int MAX_VALUE = 6;  //instanc variable
    private int value;                      //instance variable 
    
    public Terning () //constructor
    {
        roll(); 
    }
    
        public int getValue () //metode med returværdi
        {
            return value;         
        }        
            public void roll () //kaster terningen
            {
                Random ran = new Random ();
                value = ran.nextInt(MAX_VALUE) + 1;
            }
            
}
