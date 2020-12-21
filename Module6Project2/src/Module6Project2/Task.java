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
 * Parent class for Module 6 project 1 
 * Abstract class that implements the prioritizedTask interface
 * Parent to the other classes which provides body for getter and setter
 * 
 */
public abstract class Task implements PrioritizedTask {
    private int priority;
    /**
     * Default construct set to med_priority
     */
    public Task(){
        priority = 5;
    }
    /**
     * 
     * @return priority value
     */
    public int getPriority(){
        return priority;
    }
    /**
     * 
     * @param priority 
     * sets priority value
     */
    public void setPriority(int priority){
        this.priority = priority;
    }
    /**
     * abstract method
     */
    public abstract void executeTask();
}
