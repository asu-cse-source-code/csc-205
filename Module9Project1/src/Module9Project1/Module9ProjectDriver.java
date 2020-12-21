package Module9Project1;

import java.util.Iterator;
/**
 * @author Austin Spencer
 * Date: 10/30/2019
 * Driver for LinkedStack
 * Uses iterator to print the stack
 * Uses pop, peek, and push to view and edit the stack
 */
/**
 * 
 * <p>
 * Output should be as follows if you follow the instructions accurately
 * <p>
 * <pre>
 *     6 5 4 1 2 3
 *     6 5 4 1 2 3
 *     2 3
 *     2 2
 *     3
 * </pre>
 * ACTUAL OUTPUT
 * <pre>
 *     6 5 4 1 2 3
 *     6 5 4 1 2 3
 *     2 3
 *     2 2
 *     3
 * </pre>
 */

public class Module9ProjectDriver {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        LinkedStack<Integer> stack = new LinkedStack<>();
        
        
        //Pushes the elements into the stack
        stack.push(3);
        stack.push(2);
        stack.push(1);
        stack.push(4);
        stack.push(5);
        stack.push(6);

        // use forEach method to display contents
       // System.out.println("Using for each loop");
        for (Object i : stack)
            System.out.print(i + " ");

        System.out.println();

        // below use an explicit iterator to iterate over
        //the stack and display its elements
        //System.out.println("\nUsing explicit Iterator object");
        
        Iterator <Integer> itr = stack.iterator();
            while (itr.hasNext())
                System.out.print(itr.next() + " ");
       




        System.out.println();
   //Below perform 4 pop operations
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();



     // use forEach method to display contents
     //System.out.println("Using for each loop");
        for (Object i : stack)
            System.out.print(i + " ");
        




        System.out.println();

        //invoke a peek operations and then a pop. Make sure to 
        //display the elements
        System.out.print(stack.peek() + " ");
        System.out.print(stack.pop() + "\n");


   //Use below a forEach loop  to display stack
        //System.out.println("Using for each loop");
        for (Object i : stack)
            System.out.print(i + " ");





        System.out.println();

        }

}
