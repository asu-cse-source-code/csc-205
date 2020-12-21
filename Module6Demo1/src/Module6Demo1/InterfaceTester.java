/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Module6Demo1;

/**
 *
 * @author austinspencer
 */
public class InterfaceTester {
    public static void main(String[] args)
    {
        Shape [] shape = new Shape [4];
        
        shape [0] = new Circle();
        shape [1] = new Rectangle(10.0, 4.0);
        shape [2] = new Cylinder(5.0, 10.0);
        shape [3] = new Cube(4.0, 10.0, 6.0);
        
        for (Shape s : shape)
        {
            System.out.println(s);
        }
        
        double totalArea = 0;
        
        for (int i = 0; i < shape.length; i++){
            if (shape[i] instanceof Cylinder)
            
                totalArea += ((Cylinder)shape[i]).calculateSurfaceArea();
            
            else if (shape[i] instanceof Cube)
                totalArea += ((Cube)shape[i]).calculateSurfaceArea();
            else
                totalArea += shape[i].computeArea();
            
        }
        
        System.out.println("\nThe total area is " + totalArea);
        
        
        
        double area = ((Cylinder)shape[2]).calculateSurfaceArea();
        //use instance of to make sure it is of correct type
        
        
        
    }
    
}
