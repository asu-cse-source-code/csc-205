/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package module8demo2;

import java.util.Arrays;

/**
 *
 * @author austinspencer
 */
public class ArrayStack<T> implements StackADT<T> {

	T[] stack;  
	int top;
	private static final int INITIAL_CAPACITY = 16;
	
	public ArrayStack() {
		// Generic arrays have to be created with Object arrays
		//Java does not allow to create/instantiate generic array by itself
		stack = (T[]) (new Object[ArrayStack.INITIAL_CAPACITY]);
		top = 0;
	}

	/**
	 * Method stubs of Stack <T> interface given, lets implement them together. 
	 */
	@Override
	public void push(T element) {
            if(top == stack.length){
                expandCapacity();
            }
            
            stack[top] = element;
            top++;
		
	}

	@Override
	public T pop() {
            
            if (isEmpty())
                throw new EmptyCollectionException("Stack");
            
            top--;
            T result = stack[top];
            
            stack[top] = null;
            return result;
            
	}

	@Override
	public T peek() {
            if (isEmpty())
                throw new EmptyCollectionException("Stack");
            
            
            T result = stack[top-1];
            
            return result;
	}

	@Override
	public boolean isEmpty() {
            if (stack[0] == null)
                return true;
            return false;
	}

	@Override
	public int size() {
            
            return top;
            
	}
	private void expandCapacity(){
            stack = Arrays.copyOf(stack, stack.length * 2);
        }
        public String toString() {
            
            StringBuilder builder = new StringBuilder();
            builder.append("Stack");
            builder.append(Arrays.toString(stack));
            return builder.toString();
	}


}

