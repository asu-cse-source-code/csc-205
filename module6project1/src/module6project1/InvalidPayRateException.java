package module6project1;

/** Program Name: InvalidPayRateException.java
 *
 * @author Austin Spencer 
 * Class: CSC 205
 * Date: 09/26/2019
 * Description: Exception class for payRate
 * 
 */
public class InvalidPayRateException extends Exception
{
    public InvalidPayRateException()
    {
        super("Invalid Pay Rate");
    }
    
    public InvalidPayRateException(double payRate)
    {
        super("Invalid Pay Rate: " + payRate);
    }
}
