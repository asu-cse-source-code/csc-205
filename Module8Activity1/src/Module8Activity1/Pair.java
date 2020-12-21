/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Module8Activity1;

/**
 *
 * @author austinspencer
 * @version 1
 * Module 8 Activity 1
 * Pair class has getters and setters for the first and second item in Pair
 * Pair is a generic class so any type can be passed as pair and it will compile
 */
/**
 * 
 *
 * @param <T> generic type
 */
public class Pair <T> {
    
    private T first;
    private T second;
    
    /**
     * Default construct sets first and second of pair to null since we 
     * shouldn't pass a type T
     */
    public Pair(){
        first = null;
        second = null;
    }
    /**
     * 
     * @param firstItem first item in the pair
     * @param secondItem Second item in the pair
     */
    public Pair(T firstItem, T secondItem){
        first = firstItem;
        second = secondItem;
    }
    /**
     * 
     * @param newFirst new first item of pair
     */
    public void setFirst(T newFirst){
        first = newFirst;
    }
    /**
     * 
     * @param newSecond new second item of pair
     */
    public void setSecond(T newSecond){
        second = newSecond;
    }
    /**
     * Getter for first item
     * @return first item
     */
    public T getFirst(){
        return first;
    }
    /**
     * getter for second item
     * @return second item
     */
    public T getSecond(){
        return second;
    }
    /**
     * 
     * @param otherPair pair to compare the calling pair to
     * @return true or false whether the two pairs are equal
     */
    public Boolean equals(Pair<T> otherPair){
        if (this.getFirst() == (otherPair.getFirst()) && 
                this.getSecond() == (otherPair.getSecond()))
            return true;
        return false;
    }
    /**
     * to string method
     * @return concatenated string with the first then second then both together
     */
    public String toString(){
        return "First: " + getFirst() + " Second: " + getSecond()
                + "\nTogether: " + getFirst() + " " + getSecond();
                
    }
    
    
}
