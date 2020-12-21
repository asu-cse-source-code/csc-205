/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Module9Demo1;

import java.util.Iterator;

public class SinglyLinkedListDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

            LinkedListADT<Integer> stack = new SinglyLinkedList<>();
            System.out.print("Stack Collection\ntop ");
            stack.addFirst(3);
            stack.addFirst(2);
            stack.addFirst(1);
            stack.addFirst(4);
            stack.addFirst(5);
            stack.addFirst(6);
            
            
		
            System.out.println(stack);
            System.out.println("Using for each loop");
            for (Integer i : stack)
                System.out.print(i + " ");
            
            System.out.println("\nUsing explicit Iterator object");
            
            Iterator <Integer> itr = stack.iterator();
            while (itr.hasNext())
                System.out.print(itr.next() + " "); 
            
            
            LinkedListADT<Integer> q = new SinglyLinkedList<>();
            System.out.print("\nq Collection\nHead ");
            q.addFirst(3);
            q.addLast(2);
            q.addLast(1);
            q.addLast(4);
            q.addLast(5);
            q.addLast(6);
            
            
            
		
            System.out.println(q);
            q.removeFirst();//
            System.out.println("Using for each loop");
            for (Integer i : q)
                System.out.print(i + " ");
            System.out.print("\n" + q.contains(4));
            q.remove(4);
            System.out.println("\n" + q);
            System.out.println("\nUsing explicit Iterator object");
            
            Iterator <Integer> itrq = q.iterator();
            while (itrq.hasNext())
                System.out.print(itrq.next() + " ");
            
            
            


	}

}