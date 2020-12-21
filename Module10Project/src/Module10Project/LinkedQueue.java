/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Module10Project;
import Module9Demo1.SinglyLinkedList;
/**
 *
 * @author austinspencer
 * Generic class that implements the queueADT generic interface
 * @param <T>
 */
public class LinkedQueue <T> implements QueueADT<T>
{
    SinglyLinkedList<T> sll;
    
    /**
     * default constructor that instantiates sll
     */
    public LinkedQueue ()
    {
        sll = new SinglyLinkedList<T>();
    }
    
    @Override
    /**
     * @param T e 
     */
    public void offer(T e) 
    {
        sll.addLast(e);
    }

    @Override
    /**
     * @return the element in the front of the list and remove it
     */
    public T poll() 
    {
        return sll.removeFirst();
    }

    @Override
    /**
     * @return the first element in the list
     */
    public T peek() {
        return sll.inspectFirst();
    }

    @Override
    /**
     * @return true if sll is empty
     * false if sll is not empty
     */
    public boolean isEmpty() {
        return sll.isEmpty();
    }

    @Override
    /**
     * @return int size which is the number of elements in the list
     */
    public int size() 
    {
        return sll.size();
    }
    /**
     * for each loop that displays the list
     */
    public void displayQ()
    {
        for (T i : sll)
            System.out.print(i + " ");
    }
    
}

