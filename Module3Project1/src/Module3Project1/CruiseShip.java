package Module3Project1;

/** Program Name: CruiseShip.java
 *
 * @author Austin Spencer 
 * Class: CSC 205
 * Date: 09/12/2019
 * Description: subclass of super class (ship) which has its own specific 
 * parameter of int passengersMax
 * 
 */
public class CruiseShip extends Ship
{
    private int passengersMax;
    
    /**
     * constructors that call the superclass (Ship) constructors
     */
    public CruiseShip() 
    {
        super();//call the superclass constructor
        passengersMax = 100;//initialize maximum passengers to 100
    }
    /**
     * constructs a cruise ship with a name, year built, and maximum passengers
     * @param name name of the cruise ship
     * @param year year the cruise ship was built
     * @param passengersMax maximum amount of passengers for the cruise ship
     */
    public CruiseShip(String name, String year, int passengersMax)
    {
        super(name, year);
        this.passengersMax = passengersMax;
        
    }
    /**
     * the accessor method for max passengers
     * @return int max passengers for the cruise ship
     */
    public int getPassengersMax()
    {
        return passengersMax;
    }
    /**
     * sets the passengersMax
     * @param passengersMax the maximum passengers allowed
     */
    public void setPassengersMax(int passengersMax)
    {
        this.passengersMax = passengersMax;
    }
    /**
     * This is an overridden method.
     * @return String representation of CruiseShip object
     */
    @Override
    public String toString()
    {
        return "Name: " + getName() + ", Year built: " + getYear() + ", Maximum passengers: " + getPassengersMax();
    }
    
}
