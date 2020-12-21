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
 * Finds priority of reading book and also browses the library
 */
public class ReadBook extends Task {
    /**
     * default constructor which call super
     */
    public ReadBook(){
        super();
    }
    
    @Override
    /**
     * prints reading book when called
     */
    public void executeTask() {
        System.out.println("Reading book...");
    }
    /**
     * prints browsing library when called
     */
    public void browseLibrary(){
        System.out.println("Browsing library...");
    }
    
}
