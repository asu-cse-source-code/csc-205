/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Module5Activity1;
import java.util.*;
// Catch exceptions for array index out of bounds
// or dividing by 0 

public class FixDebugTwelve3
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println( " enter i/p ");
        while (scan.hasNext()) { // This will loop your i/p.
            if (scan.hasNextInt()) { // if i/p int 
                System.out.println(" Int " + scan.nextInt());
            } 
            else if (scan.hasNextFloat()) { // if i/p float
                System.out.println(" Float " + scan.nextFloat());
            } 
            else    { // if i/p String
                System.out.println( " String " + scan.next());
            }
        }
     
    }
}