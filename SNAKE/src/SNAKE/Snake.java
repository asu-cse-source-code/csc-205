/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SNAKE;
import java.util.*;
/**
 *
 * @author austinspencer
 */
public class Snake {
    
    public Snake(){

    }
            
    
    
    public static boolean isEqual(int a, int b, int c, int d){
        boolean result = false;
        
        if (a == b && a == c && a == d){
            result = true;
        }
        
        return result;
    } // isEqual
    
    public static void printMethod(int a, int b, int c, int d){
        if (isEqual(a,b,c,d))
            System.out.println("They are equal!");
        else
            System.out.println("They are not equal!");
    }//printMethod
    
    
    
    
    
}


