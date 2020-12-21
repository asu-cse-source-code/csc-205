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
 * Finds priority of mowing lawn

 */
public class MowLawn extends Task {
    /**
     * Default construct calls for super
     */
    public MowLawn(){
        super();
    }

    @Override
    /**
     * prints mow lawn when executed
     */
    public void executeTask() {
        System.out.println("Mow Lawn...");
    }
}
