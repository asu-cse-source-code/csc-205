package Module9Demo1;

import java.util.Iterator;
import java.util.NoSuchElementException;



/**
 *
 * @author austinspencer
 * @param <T>
 */
public class SinglyLinkedList <T> implements LinkedListADT<T> {
	
	private Node <T> head;
        private Node <T> tail;
	private int count;
	
	
	public SinglyLinkedList () {
		
		head = null;
                tail = null;
		count = 0;
		
	}
	
	public void addFirst(T e)
	{
		Node<T> newNode = new Node<>(e);
		if(head == null){
                    //head = newNode;
                    tail = newNode;
                }
		else
		{
                    newNode.next = head ;
                   // head = newNode;
		}
                head = newNode;
		count++;
	}
	
	
	public T removeFirst()
	{
		if(head == null)
                    throw new EmptyCollectionException("Stack");
		T result = head.element;
		head = head.next;
		count--;
                if (isEmpty())
                    tail = null;
		return result;
		
	}
	
	public int size()
	{
            return count;
	}
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

    @Override
    public T inspectFirst() {
        if (isEmpty())
            throw new EmptyCollectionException("List is empty");
        return head.element;
    }

    @Override
    public boolean isEmpty() {
        return (count == 0);
    }

    @Override
    public Iterator<T> iterator() 
    {
        return new SinglyLinkedListIterator(head);
    }

    @Override
    public void addLast(T e) {
        Node<T> newNode = new Node<>(e);
	if(head == null){
            head = newNode;
        }
	else
	{
            tail.next = newNode;
            //tail = newNode;
	}
        tail = newNode;
        count++;
            
    }

    @Override
    public T inspectLast() {
        if (isEmpty())
            throw new EmptyCollectionException("List is empty");
        
        return tail.element;
    }

    @Override
    public T removeLast() {
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

    @Override
    public boolean contains(T target) {
        
        boolean found = false;
        
        if (isEmpty())
            throw new EmptyCollectionException("List is empty");
        Node <T> current = head;
        
        while (current.element != null && !current.element.equals(target))
        {
            current = current.next;
        }
        
        if (current != null)
            found = true;
        
        return found;
            
    }

    @Override
    public T remove(T target) {
        T e;
        if(isEmpty())
            throw new EmptyCollectionException("List is empty");
        
        Node <T> current = head;
        Node <T> previous = null;
        while (current != null && !current.element.equals(target)){
            previous = current;
            current = current.next;
            }
            previous.next = current.next;
        if (current == null)
            throw new NoSuchElementException();
        
        if(current == head)
            e = removeFirst();
        
        else if(current == tail)
            e = removeLast();
        
        else
        {
            e = current.element;
            previous.next = current.next;
            count--;
        }
        
        
        return e;
    }

    @Override
    public void addAfter(T element, T target) 
    {
        if(isEmpty())
            throw new EmptyCollectionException("List is empty");
        
      
        
        //Create the new node
        Node <T> newNode = new Node<>(element);
        
        Node <T> current = head;
        
        while (current.element != null && !current.element.equals(target))
        {
            current = current.next;
        }
        
        if(current == null)
            throw new NoSuchElementException();
        if(current == tail)
            addLast(target);
        
        else
        {
            newNode.next = current.next;
            current.next = newNode;
            count++;
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
	    
	   /**
	    *  
	    * @param name of the person
	    * Also set the nextP reference to null
	    */
	    public Node (T e){
	    	
	    	element = e;
	    	next = null;
	    }
	   
	    
	}//end of the Node <T>
        //////////////////////////////////////////////
        public class SinglyLinkedListIterator <T> implements Iterator <T> {
            
            Node <T> current;
            
            public SinglyLinkedListIterator (Node <T> start) {
                current = start;
            }

            @Override
            public boolean hasNext() {
                return (current != null);
                
            }

            @Override
            public T next() {
                
                if(!hasNext())
                    throw new NoSuchElementException("No more elements");
                T e = current.element;
                current = current.next;
                return e;
            }
            
            @Override
            public void remove() throws UnsupportedOperationException
            {
                throw new UnsupportedOperationException();
            }
            
            
            
            
        }
	
               
} //end of SLL