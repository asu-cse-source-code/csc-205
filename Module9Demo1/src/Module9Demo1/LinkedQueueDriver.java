/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Module9Demo1;

/**
 * 
 * @author Dilshad haleem
 * This class test all of the method in the QueueADT interface
 * <p>
 * 
 * Current State of the Queue
 * 3 4 7 9 1 0 
 * Removing 3.
 * 4 7 9 1 0 
 * Is list empty? false
 * List size: 5
 * Peek method returns: 4

 * <p>
 *
 */
public class LinkedQueueDriver
{

    public static void main(String[] args)
    {
        QueueADT<Integer> list = new LinkedQueue<>();

        list.offer(3);
        list.offer(4);
        list.offer(7);
        list.offer(9);
        list.offer(1);
        list.offer(0);

        System.out.println("\nCurrent State of the Queue");
        ((LinkedQueue<Integer>) list).displayQ();	

        System.out.println("\nRemoving 3.");

        list.poll();

        ((LinkedQueue<Integer>) list).displayQ();

        System.out.println();

        System.out.println("Is list empty? " + list.isEmpty());

        System.out.println("List size: " + list.size());

        System.out.println("Peek method returns: " + list.peek());

    }

}