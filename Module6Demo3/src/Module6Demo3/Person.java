/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Module6Demo3;

/**
 * 
 * @author Dilshad Haleem
 *
 */

/**
   This class defines a Person using a name and birth year
*/

public class Person {
	
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
	 * Constructor
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
	public int calculateAge (int currentYr) {
		
		return currentYr - birthYear;
	}

	/**
	 * 
	 * @param p
	 * @return true if the age and the name is same 
	 */
	public boolean equals (Object p) {
		
		Person per = (Person)p;
		
		return (this.birthYear == per.birthYear && this.name == per.name);
		
	}
	/**
	 * return string rep. of a Person object
	 */
	public String toString() {
		
		return "Name: " + this.name + "\n  Birth Year: " + birthYear;
	}
	


}