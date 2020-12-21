/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Module5Demo3;

/**
 *
 * @author austinspencer
 */
public class Bank 
{
    public static void main(String[] args)
    {
        try{
            BankAccount bank = new BankAccount();
            BankAccount Chase = new BankAccount(1234, "Harry Potter", 90);
            
        }
        catch (NegativeBalanceException e)
        {
            System.out.println(e.getMessage());
        }
        catch (EmptyNameStringException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
