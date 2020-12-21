/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Module12Activity;

/**
 *
 * @author austinspencer
 */
import java.math.BigInteger;
import java.security.SecureRandom;
import java.sql.Time;
import java.util.Random;
/**
 * 
 * @author 
 * First 10 of 50000
1143138235
2047119790
1786310502
925502326
346564851
766465833
257598475
217716935
277333193
2112488089
Integer[] Selection Sort StopWatch [getElapsedTime()=2168, getMode()=MILLI]
Integer[] Insertion Sort StopWatch [getElapsedTime()=2659, getMode()=MILLI]
Integer[] Bubble Sort StopWatch [getElapsedTime()=7830, getMode()=MILLI]
Integer[] Quick Sort StopWatch [getElapsedTime()=18, getMode()=MILLI]
Integer[] Merge Sort StopWatch [getElapsedTime()=1111, getMode()=MILLI]
Done!

 *
 */

public class SortingTester {

	public static void main(String[] args) {

		final int SIZE = 50000;
		Random gen = new Random();
		StopWatch sw = new StopWatch();
                
                
		
		Integer[] control = new Integer[SIZE];
		Double[] control1 = new Double[SIZE];
		String[] control2 = new String[SIZE];
	
	
		for (int x = 0; x < SIZE; x++ ) {
			control[x] = gen.nextInt(Integer.MAX_VALUE);
			control1[x] = gen.nextDouble() * Integer.MAX_VALUE;
			control2[x] = new BigInteger(130, gen).toString(32);
			
		}

		// Pre-sort Display
		
		System.out.println("First 10 of " + control.length);
		for (int x = 0; x < 10; x++) {
			System.out.println(control[x]);
		}
	
		Integer[] target = new Integer[SIZE];
		Double[] target1 = new Double[SIZE];
		String[] target2 = new String[SIZE];
		
		


            //f Integer!!!
                
                
                
                
	//Keep a copy of the original array using System.arraycopy			
		System.arraycopy(control, 0, target, 0, control.length);	
		//reset the stop watch
		sw.reset();
		//start the stop watch
		sw.start();
		
		
		//sort the target using slectionSort
		SortingUtility.selectionSort(target);
		
		//stop the watch
		sw.stop();
		
		//print out the time elapse. Invoke stopwatch's toString method
                System.out.println(sw.toString());
		//An expected output is given below for just Integer array. 
		
	
//Repeat all the above steps for the other four sorting algorithms
                System.arraycopy(control, 0, target, 0, control.length);	
		//reset the stop watch
		sw.reset();
		//start the stop watch
		sw.start();
		
		
		//sort the target using slectionSort
		SortingUtility.insertionSort(target);
		
		//stop the watch
		sw.stop();
		
		//print out the time elapse. Invoke stopwatch's toString method
                System.out.println(sw.toString());
		//An expected output is given below for just Integer array.
                
                
                System.arraycopy(control, 0, target, 0, control.length);	
		//reset the stop watch
		sw.reset();
		//start the stop watch
		sw.start();
		
		
		//sort the target using slectionSort
		SortingUtility.bubbleSort(target);
		
		//stop the watch
		sw.stop();
		
		//print out the time elapse. Invoke stopwatch's toString method
                System.out.println(sw.toString());
		//An expected output is given below for just Integer array.
                
                
                
                System.arraycopy(control, 0, target, 0, control.length);	
		//reset the stop watch
		sw.reset();
		//start the stop watch
		sw.start();
		
		
		//sort the target using slectionSort
		SortingUtility.quickSort(target);
		
		//stop the watch
		sw.stop();
		
		//print out the time elapse. Invoke stopwatch's toString method
                System.out.println(sw.toString());
		//An expected output is given below for just Integer array.
                
                
                
                
                
                System.arraycopy(control, 0, target, 0, control.length);	
		//reset the stop watch
		sw.reset();
		//start the stop watch
		sw.start();
		
		
		//sort the target using slectionSort
		SortingUtility.mergeSort(target);
		
		//stop the watch
		sw.stop();
		
		//print out the time elapse. Invoke stopwatch's toString method
                System.out.println(sw.toString());
		//An expected output is given below for just Integer array.
                
                
                
                
                
                //Double!!!!!
                
                //Keep a copy of the original array using System.arraycopy			
		System.arraycopy(control, 0, target1, 0, control.length);	
		//reset the stop watch
		sw.reset();
		//start the stop watch
		sw.start();
		
		
		//sort the target using slectionSort
		SortingUtility.selectionSort(target1);
		
		//stop the watch
		sw.stop();
		
		//print out the time elapse. Invoke stopwatch's toString method
                System.out.println(sw.toString());
		//An expected output is given below for just Integer array. 
		
	
//Repeat all the above steps for the other four sorting algorithms
                System.arraycopy(control, 0, target1, 0, control.length);	
		//reset the stop watch
		sw.reset();
		//start the stop watch
		sw.start();
		
		
		//sort the target using slectionSort
		SortingUtility.insertionSort(target1);
		
		//stop the watch
		sw.stop();
		
		//print out the time elapse. Invoke stopwatch's toString method
                System.out.println(sw.toString());
		//An expected output is given below for just Integer array.
                
                
                System.arraycopy(control, 0, target1, 0, control.length);	
		//reset the stop watch
		sw.reset();
		//start the stop watch
		sw.start();
		
		
		//sort the target using slectionSort
		SortingUtility.bubbleSort(target1);
		
		//stop the watch
		sw.stop();
		
		//print out the time elapse. Invoke stopwatch's toString method
                System.out.println(sw.toString());
		//An expected output is given below for just Integer array.
                
                
                
                System.arraycopy(control, 0, target1, 0, control.length);	
		//reset the stop watch
		sw.reset();
		//start the stop watch
		sw.start();
		
		
		//sort the target using slectionSort
		SortingUtility.quickSort(target1);
		
		//stop the watch
		sw.stop();
		
		//print out the time elapse. Invoke stopwatch's toString method
                System.out.println(sw.toString());
		//An expected output is given below for just Integer array.
                
                
                
                
                
                System.arraycopy(control, 0, target1, 0, control.length);	
		//reset the stop watch
		sw.reset();
		//start the stop watch
		sw.start();
		
		
		//sort the target using slectionSort
		SortingUtility.mergeSort(target1);
		
		//stop the watch
		sw.stop();
		
		//print out the time elapse. Invoke stopwatch's toString method
                System.out.println(sw.toString());
		//An expected output is given below for just Integer array.
                
                
                
                
                // String!!!!!!!!
                
                
                
                
                //Keep a copy of the original array using System.arraycopy			
		System.arraycopy(control, 0, target2, 0, control.length);	
		//reset the stop watch
		sw.reset();
		//start the stop watch
		sw.start();
		
		
		//sort the target using slectionSort
		SortingUtility.selectionSort(target2);
		
		//stop the watch
		sw.stop();
		
		//print out the time elapse. Invoke stopwatch's toString method
                System.out.println(sw.toString());
		//An expected output is given below for just Integer array. 
		
	
//Repeat all the above steps for the other four sorting algorithms
                System.arraycopy(control, 0, target2, 0, control.length);	
		//reset the stop watch
		sw.reset();
		//start the stop watch
		sw.start();
		
		
		//sort the target using slectionSort
		SortingUtility.insertionSort(target2);
		
		//stop the watch
		sw.stop();
		
		//print out the time elapse. Invoke stopwatch's toString method
                System.out.println(sw.toString());
		//An expected output is given below for just Integer array.
                
                
                System.arraycopy(control, 0, target2, 0, control.length);	
		//reset the stop watch
		sw.reset();
		//start the stop watch
		sw.start();
		
		
		//sort the target using slectionSort
		SortingUtility.bubbleSort(target2);
		
		//stop the watch
		sw.stop();
		
		//print out the time elapse. Invoke stopwatch's toString method
                System.out.println(sw.toString());
		//An expected output is given below for just Integer array.
                
                
                
                System.arraycopy(control, 0, target2, 0, control.length);	
		//reset the stop watch
		sw.reset();
		//start the stop watch
		sw.start();
		
		
		//sort the target using slectionSort
		SortingUtility.quickSort(target2);
		
		//stop the watch
		sw.stop();
		
		//print out the time elapse. Invoke stopwatch's toString method
                System.out.println(sw.toString());
		//An expected output is given below for just Integer array.
                
                
                
                
                
                System.arraycopy(control, 0, target2, 0, control.length);	
		//reset the stop watch
		sw.reset();
		//start the stop watch
		sw.start();
		
		
		//sort the target using slectionSort
		SortingUtility.mergeSort(target2);
		
		//stop the watch
		sw.stop();
		
		//print out the time elapse. Invoke stopwatch's toString method
                System.out.println(sw.toString());
		//An expected output is given below for just Integer array.
                
                
		
		
                
                
		
		
		
		System.out.println("Done!");
		
	}

}