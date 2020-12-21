/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Module6Demo2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 *
 * @author austinspencer
 */
public class Bank 
{
    public static void main(String[] args)
    {
        List <BankAccount> bankList = new ArrayList<>();
        
        Random rand = new Random();
        
        for (int i =0; i <5; i++) {
            bankList.add(new BankAccount (2345, "Austin", rand.nextInt(1000)));
        }
        System.out.println("Unsorted list");
        for (BankAccount b : bankList){
            System.out.println(b);
        }
        Collections.sort(bankList);
        //sort bank account objects
        System.out.println("Sorted list");
        
        for (BankAccount b : bankList){
            System.out.println(b);
        }
        //getting an iterator on our bankList
        
        Iterator itr = bankList.iterator();
        
        System.out.println("Displayed using an iterator: ");
        
        while(itr.hasNext())
        {
            BankAccount bank = (BankAccount)(itr.next());
            
            
            System.out.println(bank);
        }
        System.out.println("Displayed using forEach: ");
        bankList.forEach(e -> System.out.println(e));
        
        IntCalculator square = x -> x * x;
        
        
        int sq = square.calculate(5);
        System.out.println("The square of 5 is " + sq);
    }
}