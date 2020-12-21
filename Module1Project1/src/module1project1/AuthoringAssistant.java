package module1project1;

import java.util.Scanner;


/**
 *
 * @author austinspencer
 */
public class AuthoringAssistant 
{
    public static void main(String[] args)
    {
        
        System.out.println("Enter a sample text: ");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        
        System.out.print("You entered: " + str);
        char choice;
        
        
        
        
        do 
        {
            choice = printMenu(scan);
            
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
                
            }
            if (choice == 'r') 
            {
                System.out.print("Edited text: " + replaceExclamation(str));
            }
            if (choice == 's') 
            {
                System.out.print("Edited text: " + shortenSpace(str));
            }
            
        } while (choice != 'q');
        
    }
    
    public static char printMenu(Scanner scnr) 
    { 
        char input;
        System.out.println("MENU");
        System.out.println("c - Number of non-whitespace characters");
        System.out.println("w - Number of words");
        System.out.println("f - Find text");
        System.out.println("r - Replace all !'s");
        System.out.println("s - Shorten spaces");
        System.out.println("q - Quit");
        
        input = scnr.next().toLowerCase().charAt(0);
        return input;
    }
    public static int getNumOfNonWSCharacters(final String usrStr)
    {
        int numOfChars = usrStr.replace(" ", "").length();
        
        return numOfChars;
    }
    public static int getNumOfWords(final String usrStr) 
    {
        if (usrStr == null || usrStr.isEmpty()) 
        {
            return 0;
        }
        
        String[] words = usrStr.split("\\s+");
        int numOfWords = words.length;
        
        return numOfWords;
    }
    public static String replaceExclamation(final String usrStr)
    {
        String periods = usrStr.replaceAll("!", ".");
        
        return periods;
    }
    public static String shortenSpace(final String usrStr)
    {
        String lessSpaces = usrStr.trim();
        
        return lessSpaces;
    }
    
    public static int findText(String toFind, String usrStr)
    {
        return 0;
        
    }
    
    
}
