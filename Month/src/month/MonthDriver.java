/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package month;

/**
 *
 * @author austinspencer
 */
public class MonthDriver {
    
    public static void main(String[] args) {

		// Use the no-arg constructor.
		Month m = new Month();
		System.out.println("Month " + m.getMonthNumber() + " is " + m);
		// Set the month number to the values 0 through 12
		// (0 is invalid), and display the resulting month name.
		for (int i = 0; i <= 12; i++) {
			m.setMonthNumber(i);
			System.out.println("Month " + m.getMonthNumber() + " is " + m);
		}
		// Use the 2nd constructor to create two objects.
		Month m1 = new Month(10);
		Month m2 = new Month(5);
		System.out.println("Month " + m1.getMonthNumber() + " is " + m1);
		System.out.println("Month " + m2.getMonthNumber() + " is " + m2);

		// Test for equality.
		if (m1.equals(m2))
			System.out.println(m1 + " and " + m2 + " are equal.");
		else
			System.out.println(m1 + " and " + m2 + " are NOT equal.");

		// Is m1 greater than m2?
		if (m1.greaterThan(m2))
			System.out.println(m1 + " is greater than " + m2);
		else
			System.out.println(m1 + " is NOT greater than " + m2);

		// Is m1 less than m2?
		if (m1.lessThan(m2))
			System.out.println(m1 + " is less than " + m2);
		else
			System.out.println(m1 + " is NOT less than " + m2);

		// Use the 3rd constructor to create three objects.
		Month m3 = new Month("March");
		Month m4 = new Month("December");
		Month m5 = new Month("Bad Month");
		System.out.println("Month " + m3.getMonthNumber() + " is " + m3);
		System.out.println("Month " + m4.getMonthNumber() + " is " + m4);
		System.out.println("Month " + m5.getMonthNumber() + " is " + m5);
	}
}
