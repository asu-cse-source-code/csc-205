/** Program Name: DenominatorIsZeroException.java
 *
 * @author Austin Spencer 
 * Class: CSC 205
 * Date: 09/17/2019
 * Description: Creates the exception class to find the error for 
 * denominator of zero
 * 
 */
package Module5Activity2;

/**
 * Custom exception class.
 * 
 * @author 
 *
 */
public class DenominatorIsZeroException extends Exception {

    /**
    * Needed because one of this classes parents is @see Serializable.
    */
    private static final long serialVersionUID = 1L;
	
    /**
     * Default constructor
     */
    public DenominatorIsZeroException()
    {
        super("Error: The denominator is zero ");
    }
    /**
     * 
     * @param message of denominator as zero 
     */
    public DenominatorIsZeroException(String message)
    {
        super("Error: The denominator is zero: ");
        
    }
	
	
	
	
	
}
