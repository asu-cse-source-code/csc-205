
package module6project1;

/** Program Name: InvalidSocException.java
 *
 * @author Austin Spencer 
 * Class: CSC 205
 * Date: 09/26/2019
 * Description: Exception class for social security number
 * 
 */
public class InvalidSocException extends Exception
{
    public InvalidSocException(String socSecNumber)
    {
        super("Invalid format on Social Security Number: " + socSecNumber);        
    }
    
}
