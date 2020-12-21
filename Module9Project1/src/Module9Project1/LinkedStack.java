package Module9Project1;
import Module9Demo1.SinglyLinkedList;

import java.util.Iterator;

/**
 * @author austinspencer
 * LinkedStack implements both the StackADT and Iterable
 * Also LinkedStack imports SinglyLinkedList
 * Overrides all abstract methods from StackADT
 * 
 */
public class LinkedStack <T> implements StackADT <T>, Iterable
{
    SinglyLinkedList<T> sll; 
    /**
     * general constructor
     */
    public LinkedStack() {
        sll = new SinglyLinkedList<T>();
    }
    @Override
    /**
     * @param T element to add to sll
     */
    public void push(T element) {
        sll.addFirst(element);
    }

    @Override
    /**
     * @return the removeFirst() method from SinglyLinkedList
     */
    public T pop() {
        return sll.removeFirst();
    }

    @Override
    /**
     * @return the inspectFirst() method from SinglyLinkedList
     */
    public T peek() {
        return sll.inspectFirst();
    }

    @Override
    /**
     * @return isEmpty method from SinglyLinkedList
     */
    public boolean isEmpty() {
        return sll.isEmpty();
    }

    @Override
    /**
     * @return size method from SinglyLinkedList
     */
    public int size() {
        return sll.size();
    }

    @Override
    /**
     * @return iterator method from iterable interface
     */
    public Iterator<T> iterator() 
    {
        return sll.iterator();
    }
        

}
