package Module10BonusProject;

import java.util.Iterator;
import java.util.NoSuchElementException;
import Module9Demo1.EmptyCollectionException;
import java.util.function.Consumer;

/**
 * Main class for the program with majority of methods.
 * @author austinspencer
 * @param <T>
 * 
 * This class implement all abstract methods from the LinkedList interface
 * 
 * Also able to iterate through any type of lists forward or backwards
 * DoublyLinkedList which is linked from element to element forward and in reverse
 * Includes private variables of head, tail, count, and direction
 * Also has subclasses of Node, LinkedListIterator and ReverseLinkedListIterator
 * as well as an enum of FORWARD and REVERSE
 * 
 */
public class DoublyLinkedList <T> implements LinkedList<T> {
	
    private Node <T> head;
    private Node <T> tail;
    
    
    
    private int count;
    private Iteration direction;


    /**
     * General Constructor that sets a general value to the private variables
     */
    public DoublyLinkedList () {

            head = null;
            tail = null;
            count = 0;
            direction = Iteration.FORWARD;// Make the general direction set to Forward

    }
    
    /**
     * 
     * @return the direction of the Iterator which is type Iteration
     */
    public Iteration getIteration()
    {
        
        return direction;
        
    }
    
    /**
     * 
     * @param i which will either be FORWARD OR REVERSE
     */
    public void setIteration(Iteration i){
        
        //Switch case that will set the direction based on i
        /**switch(i){
            case REVERSE:
                direction = Iteration.REVERSE;
                break;
            case FORWARD:
                direction = Iteration.FORWARD;
                break;
            default:
                direction = Iteration.FORWARD;
                break;
                
        }*/
        
        /**
         * 
         * This is an if statement that will check if the entered param is equal 
         * to reverse and if not sets the Iteration to forward.
         * I chose to do this because I think it is simpler and reads easier 
         * than the switch case, however, the switch case works just the same.
         * 
         */
        if (i == Iteration.REVERSE)
            direction = Iteration.REVERSE;
        else
            direction = Iteration.FORWARD;
        
            
        
       
            
    }
    
    /**
     * 
     * @param e add the element e of generic type to the front of list
     */
    public void addFirst(T e)
    {
        Node<T> newNode = new Node<>(e);
        if(head == null){
            
            tail = newNode;
            
        }
        else
        {
           newNode.next = head ;
           head.prev = newNode;//Make sure to keep the prev pointer
           
        }
        newNode.prev = null;//Make sure there is a clear end to list
        head = newNode;
        count++;
    }

    /**
     * 
     * @return the first element in the list
     */
    @Override
    public T getFirst()
    {
        if(head == null)
            throw new EmptyCollectionException("Stack");
        T result = head.element;
        head = head.next;
        head.prev = null;//Keep the prev pointer in the list
        count--;
        if (isEmpty())
            tail = null;
        return result;

    }
    
    /**
     * 
     * @return number of elements within the list
     */
    @Override
    public int size()
    {
        return count;
    }
    /**
     * 
     * @return the entire list as a string
     */
    @Override
    public String toString()
    {
        Node<T> current = head;
        String result = "";

        while(current != null)
        {
          result += current.element + "  ";
          current = current.next;
        }

        return result;
    }
    
    /**
     * 
     * @return the first element in the list
     */
    @Override
    public T first() {
        if (isEmpty())
            throw new EmptyCollectionException("List is empty");
        return head.element;
    }
    
    /**
     * 
     * @return true if list is empty false if not
     */
    @Override
    public boolean isEmpty() {
        return (count == 0);
    }
    
    /**
     * 
     * @param e add element e to the end of the list
     */
    @Override
    public void addLast(T e) {
        Node<T> newNode = new Node<>(e);
	if(head == null){
            head = newNode;
            newNode.prev = null;//Keep null infront of first element
        }
	else
	{
            tail.next = newNode;
            newNode.prev = tail;//Keep pointer from last element to second to last
            
	}
        tail = newNode;
        count++;
            
    }
    
    /**
     * 
     * @return the element at the end of the list
     */
    @Override
    public T last() {
        if (isEmpty())
            throw new EmptyCollectionException("List is empty");
        
        return tail.element;
    }
    
    /**
     * 
     * @return the element at the end of the list
     * Also removes the element
     * Dont need to add any prev 
     */
    @Override
    public T getLast() {
        if(isEmpty())
            throw new EmptyCollectionException("List is empty");
        
        T e = tail.element;
        
        if (head == tail)
            head = tail = null;
        else {
            Node <T> current = head;
            Node <T> previous = null;
            while (current.next != null)
            {
                previous = current;
                current = current.next;
            }
            tail = previous;
            tail.next = null;
        }
        count--;
        return e;
    }
    
    /**
     * 
     * @return the new Iterator whether forward or reverse
     */
    @Override
    public Iterator<T> iterator() 
    {
        if (direction == Iteration.FORWARD)
            return new LinkedListIterator(head);
        else
            return new ReversedLinkedListIterator(tail);
    }
    
    public void forEach(Consumer<? super T> consumer)
    {
        /**
        Node <T> newNode = this.head;
        
        if (newNode != null){
            do{
                consumer.accept(newNode.element);
                newNode = newNode.next;
            }while (newNode != null);
        }
        */
        // Or could do it in reverse
        Node <T> newNode = this.tail;
        
        if (newNode != null){
            do{
                consumer.accept(newNode.element);
                newNode = newNode.prev;
            }while (newNode != null);
        }
    }
        

    
	
    //////////////////////////////////////////////////////////////
    /**
     * 
     * @author Dilshad Haleem 
     *
     * @param <T>
     * private inner class Node
     */
    private class Node <T> {

        /**
         * Store any data about a Person as a String
         */
        private T element;

        /**
         * nextP is a self referential object
         * It can refer to itself
         */
        private Node <T> next;
        private Node <T> prev;

       /**
        *  
        * @param name of the person
        * Also set the nextP reference to null
        */
        public Node (T e){

            element = e;
            next = null;
            prev = null;
        }


    }//end of the Node <T>
    //////////////////////////////////////////////
    private class LinkedListIterator <T> implements Iterator <T> {

        Node <T> current;
        
        /**
         * 
         * @param start the head element of the list
         */
        public LinkedListIterator (Node <T> start) {
            current = start;
        }
        
        /**
         * 
         * @return true if current element is not null
         */
        @Override
        public boolean hasNext() {
            return (current != null);
            

        }
        
        /**
         * 
         * @return the element that is next in the list
         */
        @Override
        public T next() {

            if(!hasNext())
                throw new NoSuchElementException("No more elements");
            T e = current.element;
            current = current.next;
            return e;
        }
        
        /**
         * 
         * @throws UnsupportedOperationException 
         */
        @Override
        public void remove() throws UnsupportedOperationException
        {
            throw new UnsupportedOperationException();
        }
        
        
        
        
    }
    private class ReversedLinkedListIterator <T> implements Iterator <T> {
        Node <T> current;
        
        /**
         * 
         * @param end the tail element of the list
         */
        ReversedLinkedListIterator(Node<T> end){
            current = end;
        }
        
        /**
         * 
         * @return true if current element is not null
         */
        @Override
        public boolean hasNext() {
            return (current != null);
            
        }
        
        /**
         * 
         * @return the previous element in the list
         */
        @Override
        public T next() {
            if(!hasNext())
                throw new NoSuchElementException("No more elements");
            T e = current.element;
            current = current.prev;
            return e;
        }
        
    }
    
    /**
     * enums that will set the Iteration (forward or reverse)
     */
    public enum Iteration {

        /**
         *
         */
        FORWARD(0), 

        /**
         *
         */
        REVERSE(1);

        /**
         *
         */
        protected int code;
        Iteration(int code){
            this.code = code;
        }
    }
    
    
} //end of SLL