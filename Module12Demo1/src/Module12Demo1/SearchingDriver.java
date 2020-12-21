/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Module12Demo1;

/**
 *
 * @author austinspencer
 */
public class SearchingDriver {
    public static void main(String[] args)
    {
        
        int [] array = {34, 45, 78, 90, 92};
        int [] array2 = {34, 45, 78, 90, 92};
        Integer [] objarray = {23, 45, 79, 90, 92};
        
        System.out.println("Using iterative search method\n");
        
        int result = SearchUtility.binarySearchIterative(array, 90);
        
        if (result != -1)
            System.out.println("The target is found at index " + result);
        else
            System.out.println("The target is NOT found");
        
        System.out.println("\nUsing recursive method");
        
        int result2 = SearchUtility.BinarySearchRecursive(array2, 0, 4, 90);
        
        if (result2 != -1)
            System.out.println("The target is found at index " + result2);
        else
            System.out.println("The target is NOT found");
        
        System.out.println("\nusing generic recursive method");
        
        result = SearchUtility.genericBinarySearchRecursive(objarray, 0, 4, 90);
        if (result != -1)
            System.out.println("The target is found at index " + result);
        else
            System.out.println("The target is NOT found");
        
    }
}
