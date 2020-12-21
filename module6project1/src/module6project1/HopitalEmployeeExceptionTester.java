
package module6project1;
import module6project1.InvalidEmpNumberException;
import module6project1.InvalidHoursWorkedException;
import module6project1.InvalidNameException;
import module6project1.InvalidPayRateException;
import module6project1.InvalidSocException;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Austin Spencer
 * This program demonstrates the trying and catching of exceptions thrown by HospitalEmployee class's methods. 
 * 
 * <p>
 * Expected output
 * 
 *Error - Invalid name
 *Error - Invalid Employee number
 *Error - Invalid pay rate: 150.0
 *Error - Invalid number of hours: 100.0
 *Error - Invalid the social security number : 45-4567-45647a
*/
/**
 * Actual output
 *Error - Invalid name
 *Error - Invalid Employee number
 *Error - Invalid pay rate: 150.0
 *Error - Invalid number of hours: 100.0
 *Error - Invalid format on Social Security Number: 000000000
 * 
 */


public class HopitalEmployeeExceptionTester
{
 
    /**
     *
     * @param args
     */
    public static void main(String[] args) 
   {
      HospitalEmployee hospitalEmployee = null;      // Reference variable set it  to null
      // Create an HospitalEmployee object in the try block with an empty string for the name in the constructor
      //make sure that the rest of the arguments are all valid.
       try {
           HospitalEmployee emptyName = new HospitalEmployee();
           emptyName.setEmpName("J");
           emptyName.getEmpName();
           
           
           
           
           //You can always use the Multicatch block to catch all of them in one catch using |
           
           
           
           
           // Create a an HospitalEmployee object in the try block with an invalid EmpNumber in the constructor
           
           emptyName.setEmpNumber(9);
           emptyName.getEmpNumber();
           
           
           
           
           
           
           // Try to set an invalid hourly pay rate.
           
           emptyName.setPayRate(12);
           emptyName.getpayRate();
           
           
           
           // Try to set an invalid number of hours worked.
           emptyName.setHoursWorked(10);
           emptyName.getHoursWorked();
           // Try to set an invalid social security number.
           emptyName.setSocSecNumber("000-00-0000");
           
           
       
       }catch (InvalidNameException ex) {
           System.out.println("Error - " + ex.getMessage());
       } catch (InvalidEmpNumberException ex) {
           System.out.println("Error - " + ex.getMessage());
       } catch (InvalidPayRateException ex) {
           System.out.println("Error - " + ex.getMessage());
       } catch (InvalidHoursWorkedException ex) {
           System.out.println("Error - " + ex.getMessage());
       } catch (InvalidSocException ex) {
           System.out.println("Error - " + ex.getMessage());
       }
       
    
      
      
      
      
      
      
     
      
      
      
      System.out.println(hospitalEmployee);
      
      
   }
}

