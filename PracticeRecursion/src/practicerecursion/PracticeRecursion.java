/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicerecursion;

/**
 *
 * @author austinspencer
 */
public class PracticeRecursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(reverse("Hello"));
        
        primeFactor(12);
        
        
    }
    public static String reverse(String str){
        if (str.length()<=1){
            return str;
            
        }
        else
            return reverse(str.substring(1, str.length()))+str.charAt(0);
    }
    
    // Recursion to get the factoral tree
    
    /**
     * so ex;
     * enter a num: 55
     * output:
     * 55 11 5
     * 
     * enter a num: 66
     * output:
     * 66 33 11 3 2 1
     */
    
    public static void primeFactor(int num){
        if (num>0){
            for(int i = 1; i < num; i = i+2){
                int newnum = num % i;
                int newnum2 = num/i;
                if ((num % i) == 0)
                    num = newnum2;
                    System.out.print(num + " ");
            }
        }
        else
            System.out.println("Not a valid number");
    }
    
    
    
    
}
