
package module6project1;

/**
 * ********************************************************************
 *Program Name: HospitalEmployee.java     Base class for Inheritance   
 *@author : Lewis and Loftus and Dilshd Haleem
 *Brief Description: 
 * Defines a HospitalEmployee class
 */
 

import java.text.NumberFormat;
import java.text.DecimalFormat;

/**
 *
 * @author austinspencer
 */
public class HospitalEmployee {

    /**
     *
     */
    protected DecimalFormat fmt = new DecimalFormat("0.00");

    /**
     *
     */
    protected NumberFormat nfmt = NumberFormat.getCurrencyInstance();
        
	private String empName;
	private int empNumber;
	private double hoursWorked;
	private double payRate;
        private String socSecNumber;

	private static int hospitalEmployeeCount = 0;
        /**
        * 
        *Sets up this hospital employee with default information.
        */
	public HospitalEmployee() {
		empName = "Chris Smith";
		empNumber = 9999;
		hoursWorked = 0;
		payRate = 0;
                socSecNumber = "000-00-0000";

		hospitalEmployeeCount++;

	}

        /**
        * Overloaded constructor
        * @param empName  employee name
        * @param empNumber  employee number
        * @param hoursWorked    hours worked by employee
        * @param payRate     currect pay rate
        * @param socSecNumber social of the employee
        * 
        */
	public HospitalEmployee(String empName, int empNumber, double hoursWorked, 
                double payRate, String socSecNumber)
        {
		this.empName = empName;
                
		this.empNumber = empNumber;
		this.hoursWorked = hoursWorked;
		this.payRate = payRate;
                this.socSecNumber = socSecNumber;

		hospitalEmployeeCount++;

	}

	/**
	 * Sets the name for this employee.
	 * @param empName Employee name
	 */
	public void setEmpName(String empName) {
		
		this.empName = empName;
	}

	/**
	 * Sets the employee number for this employee.
	 * @param empNumber employee number
	 */
	public void setEmpNumber(int empNumber) {
		
		this.empNumber = empNumber;
	}

	/**
	 * Sets the employee number for this employee.
	 * @param hoursWorked by the the employee
	 */
	public void setHoursWorked(double hoursWorked) {
		
		this.hoursWorked = hoursWorked;
	}

	/**
	 * Sets the pay rate for this employee.
	 * @param payRate of the employee
	 */
	public void setPayRate(double payRate) {
		
		this.payRate = payRate;
	}

	/**
	 * Returns this employee's name.
	 * @return
         * @throws module6project1.InvalidNameException
	 */
	public String getEmpName() throws InvalidNameException {
		if (empName.isEmpty())
                    throw new InvalidNameException();
		return empName;
	}

	/**
	 * Returns this employee's number.
	 * @return
     * @throws module6project1.InvalidEmpNumberException
	 */
	public int getEmpNumber() throws InvalidEmpNumberException {
		if (empNumber < 0)
                    throw new InvalidEmpNumberException();
		return empNumber;
	}

	/**
	 * Returns hours worked.
	 * @return hoursWorked    
     * @throws module6project1.InvalidHoursWorkedException    
	 */
	public double getHoursWorked() throws InvalidHoursWorkedException
        {
		if (hoursWorked < 0 || hoursWorked > 84 )
                    throw new InvalidHoursWorkedException(hoursWorked);
		return hoursWorked;
	}

	/**
	 * Returns employee payRate
	 * @return payRate
     * @throws module6project1.InvalidPayRateException
	 */
	public double getpayRate() throws InvalidPayRateException {
		if (payRate < 0 || payRate > 25)
                    throw new InvalidPayRateException(payRate);
		return payRate;
	}

	/**
	 * Returns this employee's gross pay.
	 * @return hours worked * payrate
	 */
	public double calculateGrossPay() {
		
		return (hoursWorked * payRate);
	}

	/**
	 * This adds or subtracts hours from the hoursWorked instance var.
	 * @param hours
	 */
	public void changeHoursWorked(double hours) {
		
		hoursWorked = hoursWorked + hours;
	}

	/**
	 * Changes the instance variable payRate by the amount
	 * @param amount
	 */
	public void changePayRate(double amount) {
		
		payRate = payRate + amount;
	}

	/**
	 * Calculates a bonus based on a rating
	 *Returns 500 for excellent employees
	 * Returns 300 for satisfactory employees
	 * Returns 0 for all other ratings
	 *
	 * good example to overload.
	 * @param rating
	 * @return bonus
	 */
	public double calculateBonus(String rating) {

		double bonus = 0.0;
		rating = rating.toLowerCase();

		if (rating.equals("excellent")) {
			bonus = 500;
		} else if (rating.equals("satisfactory")) {
			bonus = 300;
		} // everyone else is 0

		return bonus;
	}

	/**
	 * overloaded calculateBonus
	 *bonus is calculated as a percent of gross pay
	 *percent = 10% passed in a 10

	 * @param percent
	 * @return bonus
	 */
	public double calculateBonus(double percent) {
		
		double bonus = calculateGrossPay() * percent / 100.0;
		return bonus;

	}
        /**
         * Sets the social security number for the employee
         * @param socSecNumber of the employee
     * @throws module6project1.InvalidSocException
         */
        public void setSocSecNumber(String socSecNumber) throws InvalidSocException
        {
            
            if (!isValid(socSecNumber))
                throw new InvalidSocException(socSecNumber);
                    
            this.socSecNumber = socSecNumber;
        }
        
    /**
     *
     * @param socSecNumber
     * @return
     */
    public Boolean isValid(String socSecNumber) 
        {
            if (socSecNumber.length() < 11 || socSecNumber.length() > 11){
                return false;
                
            }
            char char0 = socSecNumber.charAt(0);
            char char1 = socSecNumber.charAt(1);
            char char2 = socSecNumber.charAt(2);
            char char3 = socSecNumber.charAt(3); // hyphen
            char char4 = socSecNumber.charAt(4);
            char char5 = socSecNumber.charAt(5);
            char char6 = socSecNumber.charAt(6); // hyphen
            char char7 = socSecNumber.charAt(7);
            char char8 = socSecNumber.charAt(8);
            char char9 = socSecNumber.charAt(9);
            char char10 = socSecNumber.charAt(10);
            if (Character.isDigit(char0) && Character.isDigit(char1) 
                    && Character.isDigit(char2) && Character.isDigit(char4) 
                    && Character.isDigit(char5) && Character.isDigit(char7)
                    && Character.isDigit(char8) && Character.isDigit(char9)
                    && Character.isDigit(char10) && char3 == '-' && char6 == '-')
            {
                return true;
            }
            
            return false;
            
        }
        /**
        * @return a description of this employee as a string.
	*/
    
	public String toString() {
		
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		return ("empName: " + empName + "\t empNumber: " + empNumber + "\thoursWorked: " + hoursWorked + "\tpayRate: "
				+ fmt.format(payRate));
	}

	/**
	 * static method that returns number of HospitalEmployee objects created
	 * @return  total number of employee objects
	 */
	public static int getHospitalEmployeeCount() {

		return hospitalEmployeeCount;

	}

}