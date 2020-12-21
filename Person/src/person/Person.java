package validatepassword;
import java.util.Scanner;
public class ValidatePassword {

    public int counter = 0;

    public ValidatePassword(int counter){
        this.counter=counter;
    }
    public boolean TestUpper(){
        this.counter = 0;
        for (int i = 0; i< password.length(); i++)
        {
            char c = password.charAt(i);
            if (Character.isUpperCase(c)){
                counter++;
            }
        }
        if (counter<2){
            System.out.println("The password did not have enough of the following:");
            System.out.println("uppercase letters");
        }
        else { 
            return true;
        }
        
    }
    public static void main(String[] args) {
        System.out.println("Enter a password >> ");
        Scanner in = new Scanner(System.in);
        String password = in.next();
        
        int counter = 0;
        for (int i = 0; i< password.length(); i++)
        {
            char c = password.charAt(i);
            if (Character.isUpperCase(c)){
                counter++;
            }
        }
        if (counter<2){
            System.out.println("The password did not have enough of the following:");
            System.out.println("uppercase letters");
        }
        else {
            for (int i = 0; i< password.length(); i++)
        {
            char c = password.charAt(i);
            if (Character.isLowerCase(c)){
                counter++;
            }
        }
        }
        if (counter<3){
            System.out.println("The password did not have enough of the following:");
            System.out.println("lowercase letters");
        }
        else {
            for (int i = 0; i< password.length(); i++)
        {
            char c = password.charAt(i);
            if (Character.isDigit(c)){
                counter++;
            }
        }

            }
        if (counter<2) {
            System.out.println("The password did not have enough of the following:");
            System.out.println("digits");
        }
    }
         
}