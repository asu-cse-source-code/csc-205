package Module8Project2;

import java.util.*;
import java.io.*;
/**
 * 
 * @author Dilshad Haleem
 * This program display the maximum number stored
 * in a stack. It uses Collections.max method
 * that took O(n) operations in order to find the maximum
 * number on the stack, where n is the 
 * size of the Stack. 
 * <p>
 * output:
 *How many queries: 
 *3
 *push 6
 *push 2
 *max
 *6
 *
 */

public class StackWithMaxNaive{
	
	static public void main(String[] args) throws IOException {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("How many queries: ");
		int queries = scan.nextInt();
		//creating a stack  to store integers
		Stack<Integer> stack = new Stack<Integer>();
    //Creating another stack that is an auxiliary stack which keeps max at the top
                Stack<Integer> trackStack = new Stack<Integer>();
                
                // Create the maxHold to contain the max integegers as string type
                String maxHold = "";
    //Add a 0 value to trackStack so when the first push happens it
    //isn't comparing to nothing
    
                trackStack.push(0);
        
		for (int qi = 0; qi < queries; ++qi) {
			String operation = scan.next(); 
			if ("push".equals(operation)) {
                            int value = scan.nextInt();
                            stack.push(value);
                            
                            // this will see if value entered is greater than the current max
                            if (value > trackStack.peek())
                                trackStack.push(value); //IF so push new value to top
                            else 
                                trackStack.push(trackStack.peek());//Else just add the current top again
			} else if ("pop".equals(operation)) {
				stack.pop();
                                trackStack.pop();// remove the current top
			} else if ("max".equals(operation)) {
                   //When max is called add the current max to string maxHold for formatting
				maxHold += trackStack.peek() + "\n"; 
			}
		}
                System.out.println("max:"); //Print the max:
                System.out.println(maxHold);// Print the max integers that were held
                        
                
	}

	
}
