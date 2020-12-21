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
 * interface for Module 6 project 1 
 * Sets final values for the different priorities
 * Also creates abstract methods for getter and setter for priority
 */
public interface PrioritizedTask {
    static final int MED_PRIORITY = 5;
    static final int MAX_PRIORITY = 10;
    static final int MIN_PRIORITY = 1;
    /**
     * 
     * @return will return priority value after being implemented
     */
    int getPriority();
    /**
     * 
     * @param priority must put in priority when calling set priority
     */
    void setPriority(int priority);
}
