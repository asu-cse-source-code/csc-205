package Module11Project;

/**
 * Module11Project driver
 * @author austinspencer
 * 
 * Takes the methods from PuzzleSquares class and prints the results when
 * the same number is passed through each
 * Shows how you can use different ways to get same result, one of which is 
 * recursion
 * 
 * 
 * 
 * Sample:
 * Calling all methods with n = 2
 * 
 * OUTPUT:
 * 
 * 13
 * 13
 * 13
 * 
 */
public class PuzzleTester 
{
    /**
     * 
     * @param args 
     */
    public static void main(String[] args){
        
        int n = 2;//Can be set to whatever number
        
        //Prints the result using number set as n with each method
        System.out.println(PuzzleSquares.puzzleFormula(n));
        System.out.println(PuzzleSquares.puzzleLoop(n));
        System.out.println(PuzzleSquares.puzzleRecursive(n));
        
        
    }
}
