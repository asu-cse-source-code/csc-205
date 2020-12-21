/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package module1demo2;

/**
 *
 * @author austinspencer
 */
public class Address {
	
	// The street number and name
	   private String street;

	   // The city in which the address is located
	   private String city;

	   // The state in which the address is located
	   private String state;

	   // The zip code associated with the city and street
	   private String zip;

	   /**
	      Constructor
	      @param road Describes the street number and name.
	      @param town Describes the city.
	      @param st Describes the state.
	      @param zipCode Describes the zip code.
	   */

	   public Address(String road, String town, String st,
	                  String zipCode)
	   {
	      street = road;
	      city = town;
	      state = st;
	      zip = zipCode;
	   }

	   /**
	    * 
	    * @param road 
	    * @param town
	    * @param st 
	    * @param zipCode
	    */
	   	public void setAddress(String road, String town, String st,
	                  String zipCode)
	   	{
	   		street = road;
	   		city = town;
	   		state = st;
	   		zip = zipCode;
		   
	   	   }

    /**
     *
     * @param original
     */
    public Address (Address original) {
                    this.city = original.city;
                    this.street = original.street;
                    this.state = original.state;
                    this.zip = original.zip;
                }
                /**
                 * 
                 * @param street address
                 */
                public void setStreet (String street) {
                    this.street = street;
                }
	   /**
            * 
            * @return full address of the person
            */

	   public String toString()
	   {
	      return (street + ", " + city +
	              ", " + state + " " + zip);
	   }

	

}
