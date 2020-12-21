/**Program Name:    RoomCarpet.java
Author:                  Austin Spencer
Class:                    CSC 205
Date Written:        09/02/19
Brief Description: Gets the total cost of the carpet
*/

package roomcarpet;

public class RoomCarpet 
{

    private RoomDimension size;
    private double carpetCost;
    
    /**
     * 
     * @param dim dimensions of the room from class RoomDimension
     * @param cost this is the total cost of the carpet
     */
    public RoomCarpet(RoomDimension dim, double cost) 
    {
        
        this.carpetCost = cost;
        
        this.size = dim;
        
    }
    
    public double getTotalCost() 
    {
        return this.carpetCost * this.size.getArea(); // Gives cost of entire area of carpet
        
        
    }
    
    public String toString() 
    {
        return "\nCarpet cost: $" + String.format("%,.2f", getTotalCost());
        /**
         * I used the format to make the output look like currency when returned
         */
    }
}
