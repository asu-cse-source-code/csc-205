/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Module10Project;

/**
 *
 * @author austinspencer
 * @param <T>
 */
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

    /**
     * 
     * @return true if there are elements in queue
     *  false if no elements in queue
     */
    boolean isEmpty();
    /**
     * 
     * @return int number of elements within the queue
     */
    int size();

}