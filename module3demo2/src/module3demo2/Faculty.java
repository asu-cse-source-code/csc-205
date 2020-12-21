/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package module3demo2;

public class Faculty extends Person
{
    private double salary;
    private String empID;
	private boolean isTenured;
  
	/**
	 * 
	 */
  public Faculty()
  {
	  super();
	  salary = 0.0;
	  empID = "";
	  isTenured = false;
  }
   
  /**
   * 
   * @param name
   * @param birthYear
   * @param salary
   * @param empID
   * @param isTenured
   */
  public Faculty(String name, int birthYear, double salary, String empID, boolean isTenured)
  {
	  super(name, birthYear);
	  this.salary = salary;
	  this.empID = empID;
	  this.isTenured = isTenured;
	  
  }
  
  /**
   * 
   * @return salary of the faculty
   */
  public double getSalary()
  {
	  return salary;
  }
  
  /**
   * 
   * @return empID of the faculty
   */
  public String getempID()
  {
	  return empID;
  }
  
  /**
   * 
   * @return true if the faculty is tenured
   */
  public boolean getIsTenured() {
	   
	  return isTenured;
  }
   
  /**
   * 
   * @param amountInPercent to raise the salary by
   */
  public void raiseSalary(double amountInPercent) {
	  
	  salary += salary * amountInPercent/100;
  }
  
  /**
   *  @return true if the salary of this object is equal to obj 
   */
  public boolean equals (Object obj)
  {
	  boolean result;
	  if(obj == null)
		  result = false;
          else if (this.getClass() != obj.getClass())
                    result = false;
	  else
	  {
		  Faculty fac = (Faculty) obj;
		  result = this.salary == fac.salary;
	  }
	  return result;
  }
  
   @Override
   public String toString()
   {
      
      if(isTenured)
    	return  super.toString() + ",[ Salary = " + salary + " Faculty member is tenured ]";
      
      else
        return super.toString() + ",[salary= " + salary + "  Faculty member is not tenured";
   }
}