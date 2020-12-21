package Module3Project1;

/** Program Name: CargoShip.java
 *
 * @author Austin Spencer 
 * Class: CSC 205
 * Date: 09/12/2019
 * Description: subclass of superclass (Ship) which has its own specific 
 * parameter of int capacity
 * 
 */
public class CargoShip extends Ship
{
    private int capacity;
    /**
     * 
     * constructors that call the superclass (Ship) constructors
     */
    public CargoShip() 
    {
        super();//call the superclass constructor
        capacity = 1000;//initialize the default capacity to 1000
    }
    /**
     * constructs a cargo ship with a name, year built, and capacity
     * @param name name of the cargo ship
     * @param year year the cargo ship was built
     * @param capacity capacity of the cargo ship in tons
     */
    public CargoShip(String name, String year, int capacity)
    {
        super(name, year);
        this.capacity = capacity;
        
    }
    /**
     * the accessor method for the capacity
     * @return int capacity of the cargo ship
     */
    public int getCapacity()
    {
        return capacity;
        
    }
    
    /**
     * 
     * @param capacity set the capacity of the cargo ship
     */
    public void setCapacity(int capacity)
    {
        this.capacity = capacity;
    }
    /**
     * this is an overridden method.
     * @return String representation of CargoShip object
     */
    @Override
    public String toString()
    {
        return "Name: " + getName() + ", Year built: " + getYear() + ", "
                + "Cargo capacity: " + getCapacity() + " tons";
    }
    
    
}
