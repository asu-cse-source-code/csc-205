/** Program Name: CustomExceptionTester.java
 *
 * @author Austin Spencer 
 * Class: CSC 205
 * Date: 09/17/2019
 * Description: Tester for Fraction.java and DenominatorIsZeroEception.java
 * 
 */
package Module5Activity2;
import java.util.Scanner;

/**
 *
 * @author austinspencer
 */
public class CustomExceptionTester 
{
    /**
     * 
     * @param args 
     */
    public static void main(String[] args)
    {
        boolean error; // Create boolean error so I can use it outside of loop
        do
        {
            error = false; // initialize boolean to false so the loop ends if
            // nothing changes
            Scanner in = new Scanner(System.in); // Initialize the scanner
            System.out.print("Enter the numerator: "); 
            int num = in.nextInt();
            System.out.print("Enter the denominator: ");
            int denom = in.nextInt();
            if (denom == 0) 
                /**
                * if denominator is 0 then I want to flip error to true so the
                * loop ends
                */
                {
                    error = true;
                }
        
            try
            {
            
                Fraction zero = new Fraction(num,denom); // create zero of type Fraction
                if (denom != 0)// If denominator is number other than zero print the fraction
                {
                    System.out.println(zero.toString()); // Prints the fraction
                }
                
            }
            catch (DenominatorIsZeroException e)
            {
                System.out.println(e.getMessage());// if denom =0 error will print
            }
            
        } while(error);// ends the loop if error = true
        
        
    }
    /**
     * OUTPUT:
     * 
run:
Enter the numerator: 5
Enter the denominator: 0
Error: The denominator is zero 
Enter the numerator: 4
Enter the denominator: 7
4/7
BUILD SUCCESSFUL (total time: 9 seconds)
     * 
     * 
     */
    
}
