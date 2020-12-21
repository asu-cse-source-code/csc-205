/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Module14ProjectBST;

/**
 * Represents a situation where the element to add/remove/find is not found
 * using RuntimeException so it is unchecked
 * @author Java Foundations
 */
public class ElementNotFoundException extends RuntimeException {

    public ElementNotFoundException() {
        super();
    }

    public ElementNotFoundException(String message) {
        super(message);
    }

   
}
