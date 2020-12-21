/** Program Name: InvalidHoursWorkedException.java
 *
 * @author Austin Spencer 
 * Class: CSC 205
 * Date: 09/26/2019
 * Description: Exception class for hours worked
 * 
 */
package module6project1;


public class InvalidHoursWorkedException extends Exception
{
    public InvalidHoursWorkedException()
    {
        super("Invalid hours worked"); //prints invalid hours worked when thrown
    }
    public InvalidHoursWorkedException(double hoursWorked)
    {
        super("Invalid hours worked: " + hoursWorked);
    }
}
