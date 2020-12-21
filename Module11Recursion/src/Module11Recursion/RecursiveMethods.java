/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Module11Recursion;

/**
 *
 * @author austinspencer
 */
public class RecursiveMethods 
{
    public static void main(String args[])
    {
        int[] array = {5,8,2,8,7};
        int target = 5;
        lessByOne(5);
        boolean found = false;
        int result = recursiveLinearSearch(array.length-1, target, array);
        
        // Iterative linear search
        for(int i = 0; i< array.length; i++)
        {
            if(array[i] == target)
                found = true;
        }
        if (result == -1)
            System.out.println("The target " + target + " is NOT in the array!");
        else
            System.out.println("The target is at index: " + result);
        
        // Recursive search 
        
        recursiveAsterisk(5);
        
    }
    
    
    public static void lessByOne(int num)
    {
        if (num >=0)
        {
            lessByOne(num - 1);
        }
        System.out.println(num);
        
        
        
    }
    public static int recursiveLinearSearch(int index, int target, int[] array)
    {
        
        if (index == -1)
        {
            return -1;
        }
        else if (array[index] == target)
        {
            return index;   
        }
        else
            return recursiveLinearSearch(index-1, target, array);
        
        
        
    }
    public static void recursiveAsterisk(int num)
    {
        if (num == 1)
        {
            System.out.print("*");
        }
        else
        {
            recursiveAsterisk(num-1);
            System.out.print("*");
            
        }
            
        
    }
    
    
    
}
