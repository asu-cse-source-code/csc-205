/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Module14ProjectBST;
import java.util.*;
/**
 * LinkedBinarySearchTree implements the BinarySearchTreeADT
 * @author austinspencer
 * 
 * and also extends the LinkedBinaryTree
 * @param <T> generic class
 */
public class LinkedBinarySearchTree<T> extends LinkedBinaryTree<T> implements BinarySearchTreeADT <T>{
    
    //private LinkedBinarySearchTree<T> left;
    //private LinkedBinarySearchTree<T> right;
    
    /**
     * general constructor with no parameters
     * Calls the super
     */
    public LinkedBinarySearchTree(){
        
        super();
    }
    
    /**
     * General constructor with parameter
     * calls super again
     * @param element to put into constructor
     */
    public LinkedBinarySearchTree(T element){
        
        super(element);
        
        
        if(!(element instanceof Comparable)){
            throw new NonComparableElementException("Binary Search Tree");
        }
            
    }
    
    /**
     * this method will take the element in the parameter and add 
     * it into the tree
     * 
     *\ calls the other add element method
     * @param element element you want to add
     */
    public void addElement(T element){
        
        //Alway check if the list is empty first
        if (isEmpty())
            root = new BinaryTreeNode<>(element);
        else
            //calls other addElement method
            addElement(element, root);
        
        //Always increment count when adding an element
        count++;       
    
    }
    
    /**
     * this method uses recursion to add the element to the correct spot
     * @param element taken from other addElement method
     * @param node Usually the root to begin with then changed with 
     * recursion
     */
    private void addElement(T element, BinaryTreeNode<T> node)
    {
        Comparable<T> comparableElement = (Comparable <T>)element;
        if(comparableElement.compareTo(node.element)<0){
            if(node.left == null) //base case
                node.left = new BinaryTreeNode<>(element);
            else
                addElement(element, node.left);
        }
        
        else
        {
            if (node.right == null)
                node.right = new BinaryTreeNode<>(element);
            else
                addElement(element, node.right);
            
        }
            
    }
    
    /**
     * This method will add the element iteratively
     * @param element the element you want to add
     */
    public void addIterative(T element){
        
        BinaryTreeNode<T> current = root;
        BinaryTreeNode<T> parent = null;
        
        Comparable<T> comparableElement = (Comparable <T>)element;
        
        if(isEmpty())
            root = new BinaryTreeNode<>(element);
        
        else
        {
            while(current!= null)
            {
                parent = current;
                
                if(comparableElement.compareTo(current.element) < 0)
                    current = current.left;
                else
                    current = current.right;
            }
            
            if(comparableElement.compareTo(parent.element) < 0)
                parent.left = new BinaryTreeNode<>(element);
            else
                parent.right = new BinaryTreeNode<>(element);
                
               
        }
        //Always increment count when adding an element
        count++;
        
    }
    
    /**
     * This method will safely remove a specific element while not losing 
     * any of the other nodes that may be attached
     * Calls the replacement method to ensure we don't lose any nodes
     * 
     * This took me a long time as well because I kept leaving out leaf nodes
     * before using this with the replacement method
     * 
     * @param targetElement
     *              Element to be removed
     * @return the element removed
     * @throws ElementNotFoundException 
     *                  Throw this exception when the element to be removed
     *                  isn't within the tree
     */
    @Override
    public T removeElement(T targetElement) throws ElementNotFoundException {
        BinaryTreeNode<T> current = root;
        BinaryTreeNode<T> parent = null;
        Comparable<T> comparableElement = (Comparable <T>)targetElement;
        T element = null;
        boolean found = false;
        
        //Always check if the tree is empty first
        if(isEmpty())
            throw new EmptyCollectionException("Binary Search Tree");
        
        //If the element is the root
        if (targetElement.equals(root.element))
        {
            element = root.element;
            root = replacement(root);
            
        }
        else 
        {
            //Check if we need to iterate through the left sub tree or right 
            // subtree
            if (comparableElement.compareTo(root.element) < 0)
                current = root.left;
            else
                current = root.right;
            
            //While loop that will quit after reaching the end (null) or the
            // target element
            while(current != null && !found)
            {
                if(targetElement.equals(current.element))
                {
                    found = true;
                    element = current.element;
                    //Call replacement based on location
                    if(current == parent.left)
                        parent.left = replacement(current);
                    else
                        parent.right = replacement(current);
                    
                }
                else
                {
                    //Change values so the while loop doesn't have a runtime error
                    parent = current;
                    if (comparableElement.compareTo(current.element) < 0)
                        current = current.left;
                    else
                        current = current.right;
                }
            }
            //If the flag never gets set then the Element was never found and
            //We need to throw an exception
            if (!found)
                throw new ElementNotFoundException("Binary Search Tree");
        }
        //Always decrement the count when removing an item
        count--;
        return element;
    }  
    
    /**
     * This method is the key to removing elements without losing nodes
     * 
     * This method, along with the removeElement method, took the longest for me
     * It gets very confusing with all the left and right and trying to not 
     * forget to include any of the child nodes 
     * This method required me to draw several diagrams 
     * 
     * @param node
     * @return the element
     */
    private BinaryTreeNode<T> replacement(BinaryTreeNode<T> node){
        BinaryTreeNode <T> element = null;
        
        //First case is if there are no children of the node to be replaced
        //This is the simplest case
        if(node.left == null && node.right == null)
            element = null;
        
        //This case is if there is only a child on the left
        else if(node.left != null && node.right == null)
            element = node.left;
        
        //This case is if there is only a child on the right
        else if (node.left == null && node.right != null)
            element = node.right;
        
        //This is when there is a child on both left and right
        else 
        {
            BinaryTreeNode<T> current = node.right;
            BinaryTreeNode<T> parent = node;
            
            //This will get to the leaf node on the left
            while (current.left != null)
            {
                parent = current;
                current = current.left;
            }
            
            //If there is no child to the left then we can use this case
            if(node.right == current)
                current.left = node.left;
            
            //This is when there are more 
            else 
            {
                //This will replace the element in inOrder fashion
                parent.left = current.right;
                current.right = node.right;
                current.left = node.left;
            }
            element = current;
        }
        return element;//This is the element to link to 
    }
    
    /**
     * This element will find the minimum element and then remove it
     * @return The minimum element that was removed
     */
    public T removeMin(){
        BinaryTreeNode<T> current = root;
        BinaryTreeNode<T> parent = null;
        
        //Always check if the tree is empty first
        if (isEmpty())
            throw new EmptyCollectionException("Binary Search Tree");
        
        //Iterate through to the furthest left leaf/parent node
        while(current.left != null){
            parent = current;
            current = current.left;
        }
        
        //Making sure not to leave any elments out
        if(current.right == null)
            parent.left = null;
        else
            parent.left = current.right;
        
        //Always decrement count when removing elements
        count--;
        return current.element;
    
    }
    
    /**
     * toString method that will print out the tree elements
     * @return The tree elements iterated through
     */
    @Override
    public String toString(){
        String result = "";
        Iterator<T> itr = iterator();
        while (itr.hasNext())
            result += itr.next() + ",";
        return result;
    }
    
    /**
     * this method will find the max element and remove it safely
     * @return max element of the tree 
     */
    public T removeMax(){
        BinaryTreeNode<T> current = root;
        BinaryTreeNode<T> parent = null;
        
        if (isEmpty())
            throw new EmptyCollectionException("Binary Search Tree");
        
        while(current.right != null){
            parent = current;
            current = current.right;
        }
        
        if(current.left == null)
            parent.right = null;
        else
            parent.right = current.left;
        
        count--;
        return current.element;
    }
    
    /**
     * This method removes an element along with any duplicates
     * @param element to be removed
     * @throws ElementNotFoundException if no element found in tree
     */
    @Override
    public void removeAllOccurrences(T element) throws ElementNotFoundException
    {
        
        removeElement(element);
        //Try catch that will throw ElementNotFoundException if the
        try
        {
            while(contains(element))
            {
                
                removeElement(element);
                
            }
        }
        catch(Exception ElementNotFoundException){}
        
       //No change in count needed here since removeElement has count--
       //Any decrement here would have double decrement and incorrect number
            
    }
    
    /**
     * This method will find a specific element in the tree
     * @param targetElement Element to search for in tree
     * @return the element searching for
     * @throws ElementNotFoundException if element isnt found
     */
    public T searchIterative(T targetElement) throws ElementNotFoundException
    {
        BinaryTreeNode<T> current = root;
        BinaryTreeNode<T> parent = null;
        Comparable<T> comparableElement = (Comparable <T>)targetElement;
        T element = null;
        boolean found = false;
        
        if(isEmpty())
            throw new EmptyCollectionException("Binary Search Tree");
        
        if (targetElement.equals(root.element))
        {
            current.element = root.element;
            
        }
        else 
        {
            if (comparableElement.compareTo(root.element) < 0)
                current = root.left;
            else
                current = root.right;
            
            while(current != null && !found)
            {
                if(targetElement.equals(current.element))
                {
                    found = true;
                    
                }
                else
                {
                    //Go through tree iteratively
                    parent = current;
                    if (comparableElement.compareTo(current.element) < 0)
                        current = current.left;
                    else
                        current = current.right;
                }
            }
            //If found flag never flipped to true then throw exception
            if (!found)
                throw new ElementNotFoundException("Binary Search Tree");
        }
        
        return current.element;
    
    }
    
    /**
     * This element will find the minimum value in the tree
     * @return the smallest element
     */
    public T findMin()
    {
        
        //If tree is empty then throw exception
        if (isEmpty())
            throw new EmptyCollectionException("Binary Search Tree");
        
        BinaryTreeNode<T> node = root;
        
        while (node.left != null){
            node = node.left;
        }
        
            
        return node.element;
    }
    
    /**
     * This method will find the maximum value in the tree
     * @return the largest element 
     */
    public T findMax()
    {
        
        if (isEmpty())
            throw new EmptyCollectionException("Binary Search Tree");
        
        BinaryTreeNode<T> node = root;
        
        while (node.right != null){
            node = node.right;
        }
        
            
        return node.element;
    }
    
    /**
     * This was a tough method for me to try to figure out
     * 
     * @return the left sub tree only of main tree
     */
    public LinkedBinarySearchTree<T> getLeft()
    {
        LinkedBinarySearchTree<T> leftSub = new LinkedBinarySearchTree<>();
        
        if(isEmpty()){
            throw new EmptyCollectionException("Binary Search Tree");
        }
        
        
        
        leftSub.root = root.left;
        //leftSub.root.right = null;
        
        return leftSub;
    }   
    
    /**
     * Same as getLeft except right side
     * @return the right sub tree of main tree
     */
    public LinkedBinarySearchTree<T> getRight()
    {
        
        LinkedBinarySearchTree<T> rightSub = new LinkedBinarySearchTree<>();
        
        rightSub.root = root.right;
        //rightSub.root.right = null;
        
        return rightSub;
    }

    
    
    
    
    
    
}
