/**Program Name:    RoomCarpet.java
Author:                  Austin Spencer
Class:                    CSC 205
Date Written:        09/02/19
Brief Description: Gets the dimensions of the floor and area
*/
package roomcarpet;

/**
 *
 * @author austinspencer
 */
public class RoomDimension 
{
    private double length;
    private double width;
    
    /**
     * 
     * @param len length of the room type double
     * @param w width of the room type double
     */
    public RoomDimension(double len, double w)
    {
        this.length = len;
        this.width = w;
        
    }
    
    public double getArea() 
    {
        return this.length * this.width;// area = length * width
    }
    
    public String toString()
    {
        return "\nRoom dimensions: " + "\nLength: " + this.length +
                "\nWidth: " + this.width + "\nArea: " + getArea();
        /**
         * Returns everything needed to show the size of the room
         */
                
    }
}
