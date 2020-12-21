package Module11Project;

/**
 * Module11Project that finds number of squares added
 * @author austinspencer
 * 
 * Uses 3 methods to find the same result
 * 
 * This to me shows how elegant the recursive methods can look relatively
 */
public class PuzzleSquares 
{
    /**
     * 
     * @param n 
     * @return number of squares added using simple arithmetic
     */
    public static int puzzleFormula(int n)
    {  
        return 2*n*n+2*n+1;
    }
    
    /**
     * 
     * @param n 
     * @return number of squares added using for loop
     */
    public static int puzzleLoop(int n)
    {
        int result = 2*n+1;
        for (int i = 1; i <= n; i++)
        {
            result += 4*i-2;
        }
        
        return result;
    }
    
    /**
     * 
     * @param n 
     * @return number of squares added using recursion
     */
    public static int puzzleRecursive(int n)
    {
        if (n==0)// Base case
            return 1;
        else
            return (puzzleRecursive(n-1) + +4*n);// Recursive step
        
    }
    
    
}
