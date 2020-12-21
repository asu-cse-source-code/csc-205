/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Module5Activity2;

/**
 * Fraction class.
 * 
 * For use with Activity 2.
 *
 */
public class Fraction {

	private int numerator;
	private int denominator;

	
	/**
	 * Constructor with parameter
	 * 
	 * @param numerator numerator
	 * @param denominator denominator
	 */
	Fraction(int numerator, int denominator) throws DenominatorIsZeroException  {
		
	   this.numerator = numerator;
           if (denominator == 0)
               throw new DenominatorIsZeroException();
	   this.denominator = denominator;
	}

	/**
	 * Get the numerator.
	 * 
	 * @return numerator
	 */
	public int getNumerator() {
		return numerator;
	}

	/**
	 * Set the numerator.
	 * 
	 * @param numerator numerator
	 */
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	/**
	 * Get the denominator.
	 * 
	 * @return the denominator
	 */
	public int getDenominator() {
		return denominator;
	}

	/**
	 * Set the denominator.
	 * 
	 * @param denominator denominator
	 * @throws DenominatorIsZeroException 
	 */
	public void setDenominator(int denominator)  {
		
		this.denominator = denominator;
	}

	/**
	 * Convert the fraction to a mixed number.
	 * 
	 * @return The mixed number.
	 */
	public String toMixedNumber() {

		String ret = "";
		int remainder = numerator % denominator;

		ret += numerator / denominator;
		ret += " ";
		if (remainder != 0) {
			ret += numerator % denominator;
			ret += "/";
			ret += denominator;
		}

		return ret;
	}

	/**
	 * Override of {@link java.lang.Object#toString} method.
	 */
	@Override
	public String toString() {
		String ret = Integer.toString(numerator) + "/" + denominator;
		return ret;
	}
	
}
