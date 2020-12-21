/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package month;

/**
 *
 * @author austinspencer
 */
public class Month 
{
    private int monthNumber;
    String monthName;
    
    public Month() 
    {
        monthNumber = 1; //initializing monthNumber to 1
    }
  
    public Month(int m)
    {
        this.monthNumber = m; //initializing monthNumber to m
    }
    
    /**
     * 
     * @param monthName initializing monthNumber according to monthName
     */
    public Month(String monthName)  //if for each month to its corresponding number
    {
        this.monthName = monthName;
        if (this.monthName.equals("January")) 
        {
            this.monthNumber = 1;
        }
        else if (this.monthName.equals("February")) 
        {
            this.monthNumber = 2;
        }
        else if (this.monthName.equals("March")) 
        {
            this.monthNumber = 3;
        }
        else if (this.monthName.equals("April")) 
        {
            this.monthNumber = 4;
        }
        else if (this.monthName.equals("May")) 
        {
            this.monthNumber = 5;
        }
        else if (this.monthName.equals("June")) 
        {
            this.monthNumber = 6;
        }
        else if (this.monthName.equals("July")) 
        {
            this.monthNumber = 7;
        }
        else if (this.monthName.equals("August")) 
        {
            this.monthNumber = 8;
        }
        else if (this.monthName.equals("September")) 
        {
            this.monthNumber = 9;
        }
        else if (this.monthName.equals("October")) 
        {
            this.monthNumber = 10;
        }
        else if (this.monthName.equals("November")) 
        {
            this.monthNumber = 11;
        }
        else if (this.monthName.equals("December")) 
        {
            this.monthNumber = 12;
        }
        else 
        {
            this.monthNumber = 1;
        }
        
    }
    public String getMonthName() //gets the monthName from the monthNumber
    {
        if (this.monthNumber == 1) 
        {
            this.monthName = "January";
        }
        else if (this.monthNumber == 2) 
        {
            this.monthName = "February";
        }
        else if (this.monthNumber == 3) 
        {
            this.monthName = "March";
        }
        else if (this.monthNumber == 4) 
        {
            this.monthName = "April";
        }
        else if (this.monthNumber == 5) 
        {
            this.monthName = "May";
        }
        else if (this.monthNumber == 6) 
        {
            this.monthName = "June";
        }
        else if (this.monthNumber == 7) 
        {
            this.monthName = "July";
        }
        else if (this.monthNumber == 8) 
        {
            this.monthName = "August";
        }
        else if (this.monthNumber == 9) 
        {
            this.monthName = "September";
        }
        else if (this.monthNumber == 10) 
        {
            this.monthName = "October";
        }
        else if (this.monthNumber == 11) 
        {
            this.monthName = "November";
        }
        else if (this.monthNumber == 12) 
        {
            this.monthName = "December";
        }
        else 
        {
            this.monthName = "January"; // Allows for bad month to be January
        }
        return monthName;
    }
    
    
    public int getMonthNumber() 
    {
        return monthNumber;
        
    }
    
    
   
    /**
     * 
     * @param m sets the month numbers from 0 to 12
     */
    public void setMonthNumber(int m) 
    {
        if (monthNumber >= 0 && monthNumber <= 12) 
        {
            this.monthNumber = m;
        }
        else 
        {
            m = 1;
        }
    }
    
    /**
     * 
     * @param month2 // sees if the calling object month is greater than month2
     * @return 
     */
    public boolean greaterThan(Month month2) 
    {
        if (this.getMonthNumber() > month2.getMonthNumber()) 
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    /**
     * 
     * @param month2 sees if the calling object month is less than month2
     * @return 
     */
    public boolean lessThan(Month month2) 
    {
        if (this.getMonthNumber() < month2.getMonthNumber()) 
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    /**
     * 
     * @param month2 sees is the calling object month is equal to month2
     * @return 
     */
    public boolean equals(Month month2) 
    {
        if (this.getMonthNumber() == month2.getMonthNumber()) 
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public String toString() 
    {
        return getMonthName();
    }

}
    
