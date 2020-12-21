
package validatepassword;
import java.util.Scanner;
public class ValidatePassword {
    private int counter;
    private String password;
   
    public static void main(String[] args) {
       
        ValidatePassword a = new ValidatePassword();
        System.out.println("Enter a password >> ");
        int d = 0;
        while (d < 3){
            d = 0;
            Scanner in = new Scanner(System.in);
            String password = in.next();
        
            int counter = 0;
            if (a.calculateUpper(password)<2) {
                System.out.println("The password did not have enough of the following:");
                System.out.println("uppercase letters");
            }
            else {
                d++;
            }
            if (a.calculateLower(password)<2) {
                System.out.println("The password did not have enough of the following:");
                System.out.println("lowercase letters");
            }
            else    {
                d++;
            }
            if (a.calculateDigits(password)<2){
                System.out.println("The password did not have enough of the following:");
                System.out.println("digits");
            }
            else {
                d++;
            }
            if (d<3){
                System.out.println("ReEnter a password");
            }
            }
        System.out.println("Valid Password");
        System.out.println("Goodbye!");
        }
    
    public ValidatePassword() {
        this.counter = 0;
        this.password = "Random";
        
    }
    public ValidatePassword(String password, int counter) {
        this.counter = counter;
        this.password = password;
        
    }
    public void setPassword (String password) {
        this.password = password;
    }
    public void setCounter(int counter) {
        this.counter = counter;
    }
    public int calculateUpper(String password) {
        counter = 0;
        for (int i = 0; i< password.length(); i++)
        {
            char c = password.charAt(i);
            if (Character.isUpperCase(c)){
                counter++;
            }
        }      
        int UpperCase = counter;
        return UpperCase;
    }

    
    public int calculateLower(String password) {
        int num = 0;
        for (int i = 0; i< password.length(); i++)
        {
            char c = password.charAt(i);
            if (Character.isLowerCase(c)){
                num++;
            }
        }
        int LowerCase = num;
        return LowerCase;
    }

    
    public int calculateDigits(String password) {
        int b = 0;
        for (int i = 0; i< password.length(); i++)
        {
            char c = password.charAt(i);
            if (Character.isDigit(c)){
                b++;
            }
        }
        int Digits = b;
        return Digits;
    }

}
