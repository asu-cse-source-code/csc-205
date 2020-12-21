/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package module3activity1;

/**
 *
 * @author austinspencer
 */
public class CheckingAccount extends BankAccount
{
    private double transactionFee;
    
    public CheckingAccount()
    {
        super();
        transactionFee = 1;
    }
    
    public CheckingAccount(int acctNum, String name, double balance, double transactionFee)
    {
        super (acctNum, name, balance);
        this.transactionFee = transactionFee;
    }
    
    public double getTransactionFee() 
    {
        return transactionFee;
    }
    
    public void setTransactionFee(double transactionFee)
    {
        this.transactionFee = transactionFee;
    }
    
    public void deposit(double amount)
    {
        super.deposit(amount - transactionFee);
    }
    
    public void withdraw(double amount)
    {
        super.withdraw(amount - transactionFee);
    }
    
    public String toString()
    {
        return super.toString() + transactionFee;
    }
}
