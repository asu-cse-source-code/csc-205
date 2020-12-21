/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Module6Demo1;

public class Cylinder extends Circle
{
	
	private double height;
	
	/**
	 * 
	 * @param rad = radius
	 * @param h = height
	 */
	
	public Cylinder (double rad, double h){
		super (rad);
		this.height = h;
	}
	/**
	 * 
	 * @return volume
	 */
	
	public double calculateVolume() {
		return super.computeArea() * height;		
	}
	
	/**
	 * 
	 * @return surface area
	 */
	
	public double calculateSurfaceArea(){
		return 2 * super.computeArea() + super.computePerimeter() * height;
	}
	
	@Override
	public String toString() {
		return "Cylinder  [r = " + getRadius()  + " h =" + height  
	            +  " Surface Area = " + form.format(calculateSurfaceArea())
                        + "]";
				
	}
}
