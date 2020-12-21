/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author austinspencer
 */
public class ArrayDriver 
{
    public static void main(String[] args)
    {
        Person[] pDatabase = new Person[3];
        pDatabase[0] = new Person("James Gosling", 1955);
        
        pDatabase[1] = new Person("Dennis Ritchie", 1941);
        
        pDatabase[2] = new Person();
        
        System.out.println("The age of " + pDatabase[0].getName() + " is " + 
                pDatabase[0].calculateAge(2019) + "years");
        
        System.out.println("The age of " + pDatabase[1].getName() + " is " + 
                pDatabase[1].calculateAge(2019) + "years");
        
        System.out.println("The age of " + pDatabase[3].getName() + " is " + 
                pDatabase[3].calculateAge(2019) + "years");
    }
}
