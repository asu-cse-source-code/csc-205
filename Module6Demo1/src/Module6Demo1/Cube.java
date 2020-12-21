/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Module6Demo1;

/**
 * This class holds data about a cube. It is a sub/child class of Rentangel
 */

public class Cube extends Rectangle // Note the keyword extends
{
	private double height; // The cube's height

	/**
	 * The constructor sets the cube's length, width, and height.
	 * 
	 * @param length The cube's length.
	 * @param width The cube's width.
	 * @param height  The cube's height.
	 */

	public Cube(double length, double width, double height) {
		// Call the superclass constructor to initialize its instance variable
		super(length, width);

		// Initialize the height.
		this.height = height;
	}

	/**
	 * The getHeight method returns the cube's height.
	 * 
	 * @return The value in the height field.
	 */

	public double getHeight() {
		return height;
	}

	/**
	 * The getSurfaceArea method calculates and returns the cube's surface area.
	 * 
	 * @return The surface area of the cube.
	 */

	public double calculateSurfaceArea() {
		return computeArea() * 6; // getArea is inherited by Cube from its parents
	} 

	/**
	 * The getVolume method calculates and returns the cube's volume.
	 * 
	 * @return The volume of the cube.
	 */

	public double calculateVolume() {
		return computeArea() * height ; //height is protected in the parent class
	}
	/**
	 * @return the String representation
	 */
	@Override
	public String toString() {
		return "Cube      [l = " + length + "  w = " + width + "  h = " + height +
				"  Surface Area = " + form.format(calculateSurfaceArea()) + "]";
	}

}