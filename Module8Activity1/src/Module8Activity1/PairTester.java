/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Module8Activity1;

/**
 *
 * @author austinspencer
 * @version 1
 * Module 8 Activity 1
 * calls different methods from the pair.java class
 * 
 * OUTPUT:
 * 
 * First: What's Second: up?
 * Together: What's up?
 * First: 33 Second: 44
 * Together: 33 44
 * These ARE the same.
 * These are NOT the same.
 * 
 * 
 * 
 * 
 * 
 */
public class PairTester {
    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {
        Pair <String> pair1 = new Pair<>("What's","up?"); //Create/Instantiate new Pair of type String

        Pair paira = new Pair<>("10", "13"); // New Pair of type T
       
        Pair pairb = new Pair<>("10", "13");// New pair of type T
        
        Pair pairc = new Pair<>("ten", "thirteen");// New pair of type T
        
        Pair<Integer> pair2 = new Pair<> (33, 44);// New Pair of type Integer
     
        
        System.out.println(pair1.toString());// Prints pair1 toString 
        
        System.out.println(pair2.toString());// Prints pair2 toString
        
        
        if (paira.equals(pairb)) //If statement that will run if equals() return true
            System.out.println("These ARE the same.");
        else System.out.println("These are NOT the same.");// equals() false then this prints
        
        if (paira.equals(pairc)) //If statement that will run if equals() return true
            System.out.println("These ARE the same.");
        else System.out.println("These are NOT the same.");// equals() false then this prints
    }
}
