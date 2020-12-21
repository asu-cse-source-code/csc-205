/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Module8Demo1;

/**
 *
 * @author austinspencer
 */
public class Box <T> {

	
	private T object;  //private T t; 

	/**
	 * constructor does not have the T parameter
	 */
	public Box() {
            object = null;
        }
	
        public Box(T obj){
            object = obj;
        }
	
	
	
	/**
	 * getObject ()
	 * @return object of type T
	 */
        public T getObject(){
            return object;
        }
	
	
	
	/**
	 * setObject
	 * @param object of type T
	 */
        public void setObject(T obj){
            object = obj;
        }

	
	
        /**
        * @return STring
        */

	@Override
	public String toString() {
            StringBuilder builder = new StringBuilder();
            builder.append("Box [object=");
            builder.append(object);
            builder.append("]");
            return builder.toString();
	}

	


}
