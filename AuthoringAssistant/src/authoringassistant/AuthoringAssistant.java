
package authoringassistant;

import java.util.Scanner;


/**
 *
 * @author austinspencer
 */
public class AuthoringAssistant 
{
    /**
     * 
     * @param args 
     */
    public static void main(String[] args)
    {
        
        System.out.println("Enter a sample text: ");
        Scanner scan = new Scanner(System.in); //creating the scanner for the main string
        String str = scan.nextLine();
        
        System.out.print("You entered: " + str);
        char choice; //character of your choice from the printmenu
        String find; //used in the do-while loop
        
        
        
        
        do //This will allow the print menu to be printed each time unless q is entered
        {
            choice = printMenu(scan); // 'choice' will then be the same as 'input'
            
            if (choice == 'c')
            {
                System.out.print("Number of non-whitespace characters: " + getNumOfNonWSCharacters(str));
            }
            if (choice == 'w') 
            {
                System.out.print("Number of words: " + getNumOfWords(str));
            }
            if (choice == 'f') 
            {
                System.out.print("Enter a word or phrase to be found: ");
                Scanner scann = new Scanner(System.in); 
                find = scann.nextLine();
                System.out.print("\"" + find + "\"" + " instances: " + findText(find, str));
            }
            if (choice == 'r') 
            {
                System.out.print("Edited text: " + replaceExclamation(str));
            }
            if (choice == 's') 
            {
                System.out.print("Edited text: " + shortenSpace(str));
            }
            
        } while (choice != 'q'); //if q is entered the while loop will be exited
        System.out.println("Goodbye!!");
        
    }
    /**
     * 
     * @param scnr this is the scanner used in the method to see which option
     * @return 
     */
    public static char printMenu(Scanner scnr) 
    { 
        char input;
        System.out.println("\nMENU");
        System.out.println("c - Number of non-whitespace characters");
        System.out.println("w - Number of words");
        System.out.println("f - Find text");
        System.out.println("r - Replace all !'s");
        System.out.println("s - Shorten spaces");
        System.out.println("q - Quit");
        System.out.println("Choose an option: ");
        
        input = scnr.next().toLowerCase().charAt(0);//allows the input to be viewed outside of this method
        return input; 
    }
    /**
     * 
     * @param usrStr will take spaces out of the string and count what's remaining
     * @return 
     */
    public static int getNumOfNonWSCharacters(final String usrStr)
    {
        int numOfChars = usrStr.replace(" ", "").length(); //gets rid of whitespace
        
        return numOfChars;
    }
    /**
     * 
     * @param usrStr this will use the space to tell between words
     * @return 
     */
    public static int getNumOfWords(final String usrStr) 
    {
        if (usrStr == null || usrStr.isEmpty()) 
        {
            return 0;
        }
        
        String[] words = usrStr.split("\\s+");//adds each word into an array
        int numOfWords = words.length;//counts size of the array to tell how many words
        
        return numOfWords;
    }
    /**
     * 
     * @param usrStr this will replace any ! with a .
     * @return 
     */
    public static String replaceExclamation(final String usrStr)
    {
        String periods = usrStr.replaceAll("!", ".");
        
        return periods;
    }
    /**
     * 
     * @param usrStr this will remove whitespace whenever there is 2 or more in a row
     * @return 
     */
    public static String shortenSpace(final String usrStr)
    {
        String lessSpaces = usrStr.replaceAll("  +"," "); //removes extra whitespace
        
        return lessSpaces;
    }
    /**
     * 
     * @param toFind this is the substring that will be found in the main string
     * @param usrStr main string to be searched inside of
     * @return 
     */
    public static int findText(String toFind, String usrStr)
    {
        int last = 0;
        int count = 0;
        while (last != -1) // this loop will go until the string has been exhausted
        {
            last = usrStr.indexOf(toFind, last);
            if (last != -1)
            {
                count++; // adds one each time substring is found in main string
                last += toFind.length();
            }
                
        }
        return count;
        
    }
    
    
}
