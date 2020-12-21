package Module3Project1;

/** Program Name: Ship.java
 *
 * @author Austin Spencer 
 * Class: CSC 205
 * Date: 09/12/2019
 * Description: superclass for CruiseShip and CargoShip which initializes the 
 * name and year of ship
 * 
 */
public class Ship 
{
    private String name;
    private String year;
    /**
     * default constructor initializes name and year to an initial value
     */
    public Ship()
    {
        name = "unknown";
        year = "1800";
    }
    
    /**
     * Constructs a ship with a name and year built
     * @param name name of the ship
     * @param year year the ship was built
     */
    public Ship(String name, String year)
    {
        this.name = name;
        this.year =year;
    }
    /**
     * accessor method for the name of the ship
     * @return string name of the ship
     */
    public String getName()
    {
        return name;
    }
    /**
     * sets the name
     * @param name name of the ship
     */
    public void setName(String name)
    {
        this.name = name;
    }
    /**
     * accessor method for the year the ship was built
     * @return string year 
     */
    public String getYear()
    {
        return year;
    }
    
    /**
     * sets the year
     * @param year the year the ship was built
     */
    public void setYear(String year)
    {
        this.year = year;
    }
    /**
     * method that returns the string for basic ship
     * @return string representation of the Ship object
     */
    public String toString()
    {
        return "Name: " + getName() + ", Year built: " + getYear();
    }
    
    
    
    
}
