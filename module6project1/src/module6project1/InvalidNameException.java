
package module6project1;

/** Program Name: InvalidNameException.java
 *
 * @author Austin Spencer 
 * Class: CSC 205
 * Date: 09/26/2019
 * Description: Exception class for invalid name
 * 
 */
public class InvalidNameException extends Exception
{

    /**
     * prints invalid name when thrown
     */
    public InvalidNameException()
    {
        super("Invalid Name");//Prints invalid name when thrown
    }
}
