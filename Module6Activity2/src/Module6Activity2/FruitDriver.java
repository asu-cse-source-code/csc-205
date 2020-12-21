/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Module6Activity2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 * @author Austin Spencer
 * Date Written: 09/24/19
 * Brief Description: 
 * 
 * 
 * Your Output:
 * 
 * 
 *
 */

//import appropriate classes for this program

public class FruitDriver {
	/**
	 * 
	 * @param args to the main method
	 */
	
	public static void main (String[] args) {
		
		Fruit f1 = new Fruit("Apple", "Good", 100);
		Fruit f2 = new Fruit("Apple", "Good", 1000);
		Fruit f3 = new Fruit("Pear", "Good", 640);
		Fruit f4 = new Fruit("Pear", "Good", 222);
		Fruit f5 = new Fruit("Pear", "Good", 100);
		Fruit f6 = new Fruit("Pinapple", "Good", 1000);
		Fruit f7 = new Fruit("Tomato", "Good", 10);
		Fruit f8 = new Fruit("Apple", "Excellent", 100);
		
	//Create an ArrayList to store Fruit objects and follow instructions 
    // in the activity documents. 
		
	
		List <Fruit> fruitList = new ArrayList<>();
                fruitList.add(f1);
		fruitList.add(f2);
                fruitList.add(f3);
                fruitList.add(f4);
                fruitList.add(f5);
                fruitList.add(f6);
                fruitList.add(f7);
                fruitList.add(f8);
                
                System.out.println("UNSORTED LIST");
                
                fruitList.forEach(e -> System.out.println(e));
                
                Collections.sort(fruitList);
                
                System.out.println("\nSORTED LIST");
                
                fruitList.forEach(e -> System.out.println(e));
		
	}

}