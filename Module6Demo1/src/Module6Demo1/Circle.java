/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Module6Demo1;

import java.text.*;

/**
 * 
 * @author Dilshad
 * This is a sub class of Shape class. It represents a Circle 
 *
 */
public class Circle implements Shape {
	
	private double radius;
	
	 protected static DecimalFormat form = new DecimalFormat("0.##");
	 
	 
	public Circle() {
		
		this(1); //calling the constructor with parameter
	}
/**
 * 
 * @param r to set the radius of the Circle
 */
	public Circle(double radius) {
		this.radius = radius;
	}
/**
 * 
 * @return radius of the Circle
 */
	public double getRadius() {
		return radius;
	}
/**
 * 
 * @param radius of the Circle
 */
	public void setRadius(double radius) {
		this.radius = radius;
	}
        @Override
	public double computeArea() {
		return Math.PI * Math.pow(radius,2);
	}

	public double computePerimeter() {
		return radius * 2.0 * Math.PI;
	}
	
	@Override
	public String toString() {
		return "Circle    [r= " + getRadius() + " area = " + form.format(computeArea()) + "]";
	}

}