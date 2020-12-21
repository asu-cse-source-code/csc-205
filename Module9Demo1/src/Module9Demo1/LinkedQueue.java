/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Module9Demo1;

/**
 *
 * @author austinspencer
 */
public class LinkedQueue <T> implements QueueADT<T>
{
    SinglyLinkedList<T> sll;
    
    
    public LinkedQueue ()
    {
        sll = new SinglyLinkedList<T>();
    }
    
    @Override
    public void offer(T e) 
    {
        sll.addLast(e);
    }

    @Override
    public T poll() 
    {
        return sll.removeFirst();
    }

    @Override
    public T peek() {
        return sll.inspectFirst();
    }

    @Override
    public boolean isEmpty() {
        return sll.isEmpty();
    }

    @Override
    public int size() 
    {
        return sll.size();
    }
    
    public void displayQ()
    {
        for (T i : sll)
            System.out.print(i + " ");
    }
    
}
