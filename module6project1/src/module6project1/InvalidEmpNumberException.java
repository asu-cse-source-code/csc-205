
package module6project1;

/** Program Name: InvalidEmpNumberException.java
 *
 * @author Austin Spencer 
 * Class: CSC 205
 * Date: 09/26/2019
 * Description: Exception class for employee number
 * 
 */
public class InvalidEmpNumberException extends Exception 
{
    public InvalidEmpNumberException()
    {
        super("Invalid Employee Number");
    }
    
    public InvalidEmpNumberException(int empNumber)
    {
        super("Invalid Employee Number: " + empNumber);
    }
}
