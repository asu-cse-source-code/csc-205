/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Module8Demo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.*;



/**
 * Example output...
 * <pre>
 * 
 * </pre>
 */
public class Driver {

    public static void main(String[] args) {

        Box<Integer> box1 = new Box<>();
        //Create more Box objects
        box1.setObject(6);
        
        System.out.println(box1);
        
        Box<String> box2 = new Box<>();
        
        box2.setObject("Generics");
        
        System.out.println(box2);
        
        List<Box> crate = new ArrayList<>();
        
        crate.add(box1);
        crate.add(box2);
        
        
     // use for-each loop to display box objects
        Iterator <Box> itr = crate.iterator();
        
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        
        
        
        
    
        
        System.out.println("         Using for each method with method reference") ;  
        /* New Syntax Alert :
        * for each method using method reference in java 8 
        *   crate.forEach(System.out::println);
        */
      

      
    }

}

