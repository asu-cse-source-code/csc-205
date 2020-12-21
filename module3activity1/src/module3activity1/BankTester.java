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
public class BankTester {
    public static void main(String[] args)
    {
        CheckingAccount studentAcct = new CheckingAccount();
        System.out.println(studentAcct.getBalance());
        studentAcct.deposit(50);
        System.out.println(studentAcct.getBalance());
        studentAcct.setTransactionFee(5);
        studentAcct.deposit(15);
        System.out.println(studentAcct.getBalance());
        
    }
}
