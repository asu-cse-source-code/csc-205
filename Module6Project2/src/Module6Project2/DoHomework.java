/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Module6Project2;

/**
 *
 * @author austinspencer
 * @version 1
 * Subclass for Module 6 project 1 
 * Finds the priority for doing homework
 * 
 */
public class DoHomework extends Task {
    /**
     * default constructor calls super
     */
    public DoHomework(){
        super();
    }

    @Override
    /**
     * Prints do homework when called
     */
    public void executeTask() {
        System.out.println("Do Homework....");
    }
}
