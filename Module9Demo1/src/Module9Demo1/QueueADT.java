/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Module9Demo1;

public interface QueueADT<T> {
	
	/**
	 * Insert an element at the rear/tail 
	 * @param e
	 */
	void offer(T e); 
	/**
	 * Remove an element from the front and return it
	 * @return
	 */
	T poll();
	/**
	 * 
	 * @return the element at the front/head of the queue 
	 */
	T peek();
	
	
	boolean isEmpty();
	
	int size();

}