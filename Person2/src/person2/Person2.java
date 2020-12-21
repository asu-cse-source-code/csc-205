/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person2;

/**
 *
 * @author austinspencer
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
     * @return name of the person
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
	 * @return true if the age is approximately the same. 
	 * It is the same as if they are born in the same year
	 */
	public boolean equals (Person p) {
		
		//this.birthYear is the object that is invoking/calling
		//equals method and p is the parameter of the type Person
		return this.birthYear == p.birthYear;
		
	}
	/**
	 * @return string representation of a Person object
	 */
	public String toString() {
		
		return "\tName: " + this.name + "\n  Birth Year: " + birthYear;
	}
	

}