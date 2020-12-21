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
public class BankAccount{
	

	/**
	 * Account Number
	 */
	private int acctNum;
	/**
	 * Name of the account holder
	 */
	private String name;
	/**
	 * Current Account Balance
	 */
	private double balance;
	/**
	 * total number of BankAccount objects
	 */
	private static int acctCount;

	/**
	 * Constructor initializes
	 * acctNum to 0, name to unknown
	 */
	public BankAccount() {
		acctNum = 0;
		name = "unknown";
		balance = 0;
		acctCount++;

	}

	/**
	 * The constructor initializes the account with 
         * an account number, a name, and a balance
	 * @param acctNum
	 * @param name
	 * @param balance
	 */

	public BankAccount(int acctNum, String name, double balance) throws NegativeBalanceException {

		this.acctNum = acctNum;
                if (name.isEmpty())
                    throw new EmptyNameStringException();
		this.name = name;
                if (balance < 0)
                    throw new NegativeBalanceException(balance);
		this.balance = balance;
		acctCount++;
	} 

	/**
	 * The setAcctNum method stores a value in the acctNum variable.
	 * 
	 *            
         * @param acctNum
	 */
	public void setAcctNum(int acctNum) {
		this.acctNum = acctNum;
	}

	/**
	 * The setName method stores a value in the name field.
	 * @param name
	 *            
	 */

	public void setName(String name) 
        {
            if (name.isEmpty())
                throw new EmptyNameStringException();
            this.name = name;
	}

	/**
	 * sets the balance
	 * @param balance
	 */
    
	public void setBalance (double balance) throws NegativeBalanceException 
        {
            if (balance < 0)
                throw new NegativeBalanceException(balance);
            this.balance = balance;
		
	}
	/**
	 * The getAcctNum method returns the value of BankAccount object's instance
	 * variable name.
	 * 
	 * @return The value in the name variable.
	 */
	public int getAcctNum() {
		return acctNum;
	}

	/**
	 * Return the name instance variable
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * The getBalance method returns a BankAccount object's balance instance
	 * variable.
	 * 
	 * @return The value in the balance instance variable.
	 */

	public double getBalance() {
		return balance;
	}

	/**
	 * The withdraw checks to see if balance is sufficient for withdrawal.If so,
	 * decrement balance by amount; if not prints message.
	 * @param amount
	 */

	public void withdraw(double amount) {
		if (balance >= amount)
			balance -= amount;
		else
			System.out.println("Insufficient funds");
	}

	/**
	 * The deposit method adds amount to the balance
	 * @param amount
	 */
	public void deposit(double amount) {
		balance += amount;
	}
        /**
        * 
        * @return
        */
	public static int getAcctCount() {
		
	 return acctCount; 	
	}
	/**
	 * Returns a string containing the name, account number, and balance
	 */
	public String toString() {
		return  "Account Number: " + acctNum + "\tName: " + name +"\tBalance: " + balance;
	}

	

}