/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Module8Project1;

/**
 *
 * @author austinspencer
 * 
 * This is a generic interface class which will be implemented by MyBag
 * that contains 3 abstract methods needed to be overridden
 * 
 */

/**
 * 
 * @author austinspencer
 * @param <T> 
 */
public interface Bag <T> {
    public boolean isEmpty();
    public int size();
    public void add(T item);
}
