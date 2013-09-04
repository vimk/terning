// opretning af class 

package terning;

/**
 *
 * @author Kim Vammen
 */
public class Main
{
    public static void main(String[] args)
    {
        Terning t1 = new Terning(); //her oprettes et objekt 
        System.out.println(t1.getValue());
        t1.roll();
        System.out.println(t1.getValue());
    }
}
