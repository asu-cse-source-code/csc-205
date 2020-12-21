/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Module6Demo1;

import java.text.*;

/**
 * This class is a sub class of Shape class.
 * 
 * In this class the constructor takes
 * that takes two parameters.
 * 
 * @author Dilshad Haleem
 *
 */
public class Rectangle implements Shape
{
    protected double width;
    protected double length;
    protected static DecimalFormat form = new DecimalFormat("0.##");

    /**
     * 
     * @param wid is the parameter width
     * @param len is the parameter length
     */

    public Rectangle(double wid, double len) 
    {
        width = wid;
        length = len;
    }
/**
 * 
 * @return the width
 */
    public double getWidth() 
    {
        return width;
    }

    /**
     * 
     * @return  the double value of the length.
     */
       public double getLength() 
    {
        return length;
    }

    /**
     * @return  Returns the calculated value of the area
     * @Override
     * 
     */
    
    public double computeArea() 
    {
        return length * width;
    }

    /**
     * @return the calculated value of the perimeter.
     */
    public double computePerimeter() 
    {
        return 2 * (length + width);
    }

   /**
    * @return pertinent information about the rectangle.
    * @Override
    * 
    */
    public String toString() 
    {
        return "Rectangle [w = " + width  + " l = " + length + " area = " + 
                           form.format(computeArea()) + "]";
    }
}
