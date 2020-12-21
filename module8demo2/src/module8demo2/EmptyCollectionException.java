/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package module8demo2;

/**
 *
 * @author austinspencer
 */
public class EmptyCollectionException extends RuntimeException
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Sets up this exception with an appropriate message.
	 * @param collection the name of the collection
	 */
	public EmptyCollectionException(String collection)
	{
		super("The " + collection + " is empty.");
	}
}
