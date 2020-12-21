/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Module5Demo3;

/**
 *
 * @author austinspencer
 *  This is thrown by the BankAccount class if a negative balance
 * is passed to its constructor
 */
public class NegativeBalanceException extends Exception
{
    /**
     * Default / no arg constructor
     */
    public NegativeBalanceException()
    {
        super("Error: Negative Starting Balance");
    }
    /**
     * 
     * @param amount starting balance
     */
    public NegativeBalanceException(double amount)
    {
        super("Error: Negative Starting Balance: " + amount);
        
    }
    
}
