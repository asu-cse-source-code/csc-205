/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Module6Demo2;

/**
 * BankAccount.java
 * 
 * @author Dilshad and Java Foundations A bank account class with methods to
 *         deposit to, withdraw from, change the name, account number and
 *         return a string representation of the account.
 */

public class BankAccount implements Comparable <BankAccount>
{

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

	public BankAccount(int acctNum, String name, double balance) {

		this.acctNum = acctNum;
		this.name = name;
		this.balance = balance;
		acctCount++;
	} 

	/**
	 * The setAcctNum method stores a value in the acctNum variable.
	 * 
	 * @param name
	 *            
	 */

	public void setAcctNum(int acctNum) {
		this.acctNum = acctNum;
	}

	/**
	 * The setName method stores a value in the name field.
	 * @param name
	 *            
	 */

	public void setName(String name) {
		this.name = name;
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
	 * @param amount to be withdrawn
	 */

	public void withdraw(double amount) {
		if (balance >= amount)
			balance -= amount;
		else
			System.out.println("Insufficient funds");
	}

	/**
	 * The deposit method adds amount to the balance
	 * @param amount to be deposited
	 */
	public void deposit(double amount) {
		balance += amount;
	}
/**
 * 
 * @return total BankAccount objects
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

    @Override
    public int compareTo(BankAccount obj) 
    {
        if(this.balance > obj.balance)
            return 1;
        else if(this.balance < obj.balance)
            return -1;
        
        
        return 0;
    }

}