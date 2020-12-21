/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Module5Demo3;

/**
 *
 * @author austinspencer
 */
public class EmptyNameStringException extends RuntimeException
{
    /**
     * Default constructor
     */
    public EmptyNameStringException()
    {
        super("Error: The name is an empty string");
    }
    /**
     * 
     * @param name 
     */
    public EmptyNameStringException(String name)
    {
        super("Error: The name is an empty string: " + name);
        
    }
    
}

