/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Module8Project1;

/**
 *
 * @author austinspencer
 * 
 * This is the Driver program for MyBag which creates an Integer and String
 * Array list respectively
 * It then is able to use methods from MyBag to add to list, get size of list
 * and check if the list is empty
 * It then prints the contents of each list using the for-each loop in the
 * to-string method inside MyBag
 * 
 * OUTPUT:
 * 
 * false
 * 4
 * false
 * 2
 * 12
 * 15
 * 25
 * 35
 *
 * Hello
 * How Are You
 * 
 * 
 */
public class MyBagDriver {
    
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
    
        
    //Creating a MyBag object that can store Integers
    MyBag<Integer> Numbers = new MyBag<>(); 
    
    //Creating a MyBag object that can store Strings
    MyBag<String>  Words = new MyBag<>();
    
    
    //Adding random Integers into the Numbers list
    Numbers.add(12);
    Numbers.add(15);
    Numbers.add(25);
    Numbers.add(35);
    
    
    
    // Adding random words into the Words list
    Words.add("Hello");
    Words.add("How Are You");
    
    //Printing whether or not the Numbers list is empty and the size
    System.out.println(Numbers.isEmpty());
    System.out.println(Numbers.size());
    
    //Printing whether or not the Words list is empty and the size
    System.out.println(Words.isEmpty());
    System.out.println(Words.size());
    

    // Using the toString method to print the for loop displaying contents of lists
    System.out.println(Numbers);
    System.out.println(Words);
    }
    
    
    
    
    
    }

