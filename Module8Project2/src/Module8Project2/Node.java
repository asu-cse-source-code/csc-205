/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Module8Project2;

/**
 *
 * @author austinspencer
 */
public class Node <T> {
	
	/**
	 * Store any data about a Person as a String
	 */
    private T element;
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
    /**
     * 
     * @param pData is the PersonNode's data
     */
    public void setElement(T e)
    {
    	element = e;
    	
    }
   /**
    *  
    * @param nextP reference to next personNode
    */
    public void setNext (Node <T> next)
    {
    	this.next = next;
    }
   /**
    *  
    * @return PersonNode's data
    */
	public T getElement() {
		
		return element;
	}
/**
 * 
 * @return the reference to the next PersonNode
 */
	public Node<T> getNext()
	{    //watch if nextP is null
		return next;
	}
/**
 * @return the PersonNode's data
 */
	
	public String toString() {
		
		return "Name : " + element;
	}
}
