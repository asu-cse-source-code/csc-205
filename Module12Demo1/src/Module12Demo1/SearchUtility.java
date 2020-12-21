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
public class SearchUtility {
    public static int binarySearchIterative(int array[], int target)
    {
        int min = 0;
        int max = array.length - 1;
        
        while(min <= max)
        {
           int mid = (min+max)/2;
           
           if(array[mid] == target)
               return mid;
           
           else if(array[mid] < target)
           {
               min = mid+1;
           }
           else{
               max = mid-1;
           }

        }// while loop
        return -1; // Target not found     
    }
    
    
    public static int BinarySearchRecursive(int array[], int min, int max, int target){
        int mid = (min+max)/2;
        
        if (min <= max){
            
            if (array[mid] == target)
                return mid;

            else if (array[mid] < target){
                return(BinarySearchRecursive(array, mid+1, max, target));
            }
            else
                return(BinarySearchRecursive(array, min, mid-1, target));
        }
        return -1;
    }
    public static <T extends Comparable <T>> int genericBinarySearchRecursive(T array[], int min, int max, T target){
        int mid = (min+max)/2;
        
        if (min <= max){
            if (array[mid].compareTo(target) == 0)
                return mid;

            else if (array[mid].compareTo(target)< 0){
                return(genericBinarySearchRecursive(array, mid+1, max, target));
            }
            else
                return(genericBinarySearchRecursive(array, min, mid-1, target));
        }
        return -1;
    }
    
}
