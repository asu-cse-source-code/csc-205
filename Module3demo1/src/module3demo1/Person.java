/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package module3demo1;


public class Person 
{
    private String name;
    private int birthYear;

	
	/**
	 * Default Constructor
	 */
	
	public Person() {
		
		this.name = "Unknown";
		this.birthYear = 0;
		
	}
	
	/**
	 * Overloaded Constructor
	 * @param name
	 * @param birthYear
	 */
	public Person(String name, int birthYear) {
		
		this.name = name;
		this.birthYear = birthYear;
		
	}
    /**
     * 	
     * @return name
     */
	public String getName() {
		
		return name;
	}
	
	/**
	 * 
	 * @return birthYear
	 */
	public int getBirthYear() {
		
		return birthYear;
	}
	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		
		this.name = name;
	}
	/**
	 * 
	 * @param birthYear
	 */
	public void setBirthYear(int birthYear) {
		
		this.birthYear = birthYear;
	}
	/**
	 * 
	 * @param currentYr
	 * @return approximate age of a person object
	 */
	public int calcualteAge (int currentYr) {
		
		return currentYr - birthYear;
	}

	/**
	 * The better way of writing equals method.
	 * This method overrides the equals method in the Object class
	 * @param p
	 * @return true if the age and the name is same 
	 */
	public boolean equals (Object p) {
		
		boolean result ;
		if(p == null)
			result = false;
		else 
		{
		  Person per = (Person)p;
		
		  result = this.birthYear == per.birthYear && this.name.equals(per.name);
		}
		
		return result;
		
	}
	/**
	 * return string rep. of a Person object
	 */
	public String toString() {
		
		return getClass().getName() 
			  + "[ Name = " + name 
			  + ", Birth Year =  " + birthYear 
			  + " ]";
	}
}
