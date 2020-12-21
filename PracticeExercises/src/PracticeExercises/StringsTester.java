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
public class StringsTester {

    /**
     *
     * @param args
     */
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
    
        Strings nums = new Strings(25, 27, 23);
        
        System.out.println("The average value is " + nums.getResult());
    }
}
