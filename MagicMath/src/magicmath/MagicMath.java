
package magicmath;
import java.util.Scanner;
public class MagicMath {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = in.nextInt();
        int num2 = num + 9;
        num2 = num2*2-4;
        num2 = num2/2-num;
        /**
         * The Magic Math going on here takes any number
         * and turns it into the number 7
         */
        System.out.println("Whenever the number is " + num + " The result after some magic is " + num2);
    }
    
}
