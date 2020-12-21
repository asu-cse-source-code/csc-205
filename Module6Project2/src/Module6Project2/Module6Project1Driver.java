/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Module6Project2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dilshad Haleem
 * @version 1.1
 * Driver for Module 6 project 1 
 * Demonstrates using abstract classes with interfaces.
 * <p>
 * Do NOT change this driver.
 * <p>
 * Output should look like...
 * <pre>
 *  Do Homework....
 *  Task Priority : Maximum
 *  
 *  Mow Lawn...
 *  Task Priority : Minimum
 *  
 *  Browsing library...
 *  Reading book...
 *  Task Priority : Medium

 * </pre>
 * Actual output
 * 
 * 
 * Do Homework....
 * Task Priority : Maximum

 * Mow Lawn...
 * Task Priority : Minimum

 * Browsing library...
 * Reading book...
 * Task Priority : Medium
 */
public class Module6Project1Driver {

    /**
     *
     * @param args main function that calls everything
     */
    public static void main(String[] args) {

    	//Using the interface as the reference type. 
    	//This is polymorphism via interface
        PrioritizedTask homework = new DoHomework();
        homework.setPriority(PrioritizedTask.MAX_PRIORITY);
        
        PrioritizedTask mowLawn = new MowLawn();
        mowLawn.setPriority(PrioritizedTask.MIN_PRIORITY);
        
        PrioritizedTask readBook = new ReadBook();
        readBook.setPriority(PrioritizedTask.MED_PRIORITY);
        
       //Creating an ArrayList to store task
        //Check the reference type is List an interface ArrayList implements
        List<PrioritizedTask> tasks = new ArrayList<>();

        tasks.add(homework);
        tasks.add(mowLawn);
        tasks.add(readBook);

        for (PrioritizedTask task : tasks) {
        	
            if (task instanceof ReadBook) {
                ((ReadBook) task).browseLibrary(); // narrowing cast
               
            }
            
            ((Task) task).executeTask();  // polymorphic method call using narrowing cast
            
            if(((Task)task).getPriority() == PrioritizedTask.MAX_PRIORITY)
            	System.out.println("Task Priority : Maximum\n");
            
            else if(((Task)task).getPriority() == PrioritizedTask.MED_PRIORITY)
            	  System.out.println("Task Priority : Medium\n");
            
            else
            	  System.out.println("Task Priority : Minimum\n");
        }

                 
    }
}
