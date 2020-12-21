/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Module10Project;
import java.util.Stack;
import java.util.Scanner;
/**
 *
 * @author austinspencer
 * Driver class that takes the user input of word/phrase
 * It then will check using queue and stack if the input is a palindrome
 * Next it will print that it is a palindrome if it is
 * Or print the reverse of the string if it is not a palindrome
 * 
 * OUTPUT 1:
 * Enter word/phrase to see if it's a palindrome: race car
 *
 * It's a palindrome
 * 
 * OUTPUT 2:
 * Enter word/phrase to see if it's a palindrome: Are we not drawn onward, to new era.
 *
 * It's a palindrome
 * 
 * OUTPUT 3:
 * Enter word/phrase to see if it's a palindrome: This is not a palindrome!!!
 * !!!emordnilap a ton si siht
 * 
 * 
 */
public class ProjectDriver 
{
    static String notPalindromeStack = ""; //In case the given string isn't a palindrome
    static String notPalindromeQueue = ""; //In case the given string isn't a palindrome
    
    /**
     * 
     * @param args main method
     * print the results
     */
    public static void main (String[] args)
    {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter word/phrase to see if it's a palindrome: ");
        String word = in.nextLine();
        boolean result = isPalindrome(word);//Set flag result depending on isPalindrome
        
        /**
         * If isPalindrome is true and the word/phrase is a palindrome
         */        
        if(result){
            System.out.print("\nIt's a palindrome\n");
        }
        /**
         * This is if not palindrome
         * Can print the reversed string using queue or stack
         */
        else{
            //System.out.print(notPalindromeStack + "\n");
            System.out.print(notPalindromeQueue + "\n");
        }
        
        
    }
    /**
     * 
     * @param word String that is given by user via scanner
     * @return true or false whether the string is a palindrome
     */
    public static boolean isPalindrome(String word)
    {
        boolean result = true;
        //Creating stack and queues since they are imported
        QueueADT<Character> queue = new LinkedQueue<>();
        Stack<Character> stack = new Stack<>();
        QueueADT<Character> queue2 = new LinkedQueue<>();
        Stack<Character> stack2 = new Stack<>();
        Stack<Character> stack3 = new Stack<>();
        
        word = word.toLowerCase(); // Conver word/phrase to all lower case
        char letter; // Keeps track of current letter in the word
        
        //For loop that goes through the given word/phrase
        for (int i = 0; i < word.length(); i++){
            letter = word.charAt(i);  
            stack2.push(letter);
            stack3.push(letter);
            
            // Make sure the character is a letter for checking if palindrome
            if(Character.isLetter(letter)){
                stack.push(letter);
                queue.offer(letter);
            }
            
                   
            
            
        }
        // While stack2 is not empty
        while (!stack2.isEmpty()){
            // If stack is not empty and element popped from stack == queue poll element
            if (!stack.isEmpty() && stack.pop() != queue.poll())
            {
                result = false; //if the elements arent equal then isPalindrome is false
            }
            notPalindromeStack += stack2.pop();//Uses only stack to create reversed string
            queue2.offer(stack3.pop());// Uses both Stack and Queue
            //By popping stack into queue2 that reverses the order
            
        }
        // while queue2 is not empty
        // This is a while loop to create reverse string using queue
        while(!queue2.isEmpty())
            notPalindromeQueue += queue2.poll();//Uses queue to add elements in reverse order
        
        return result;
    }
    
    
}
