/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticeExercises;

import java.util.Scanner;

/**
 *
 * @author austinspencer
 */
public class Strings {
    
    
    private int first;
    private int second;
    private int third;
    
    /**
     *
     * @param args
     */
    public Strings (){
        first = 0;
        second = 1;
        third = 2;
        
    }
    public Strings(int first, int second, int third){
        this.first = first;
        this.second = second;
        this.third = third;
       
    }
    public double getResult(){
        return (first+second+third) /3;
        
    }
}
