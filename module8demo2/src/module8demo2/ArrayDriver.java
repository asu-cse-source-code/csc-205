/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package module8demo2;

/**
 *
 * @author austinspencer
 */
public class ArrayDriver {

	public static void main(String[] args) {

            //create an ArrayStack object of type Stack that stores Integers 
            
            StackADT <Integer> stack = new ArrayStack<>();
		
            //Push 1, 2, 3, 4, and 5 on stack 
            
            stack.push(1);
            stack.push(2);
            stack.push(3);
            stack.push(4);
            stack.push(5);
		
		
		
            //Display contents of stack
            System.out.println(stack);
		
		
            //pop one of the element
            stack.pop();
		
		
		
            //Display stack 
            System.out.println(stack);
		
		
            //push some more integers on stack
            stack.push(8);
            stack.push(9);
		
		
            //Display
            System.out.println(stack);
                    
		
		
		
	}

}
