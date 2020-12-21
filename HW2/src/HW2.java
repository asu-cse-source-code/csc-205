import java.util.Scanner;
public class HW2 {
    public static void main(String[] args) {
       int price = 10;
       int max = 10;
       
       
       System.out.println("I have an amazing offer for you!");
       System.out.println("I have a maximum of 10 Java Programs for sale for only $10 per program.");
       Scanner in = new Scanner(System.in);
       System.out.print("Would you like to purchase any programs?\nEnter 'y' for yes or 'n' for no:  ");
       char answer = in.next().charAt(0);
       if (answer == 'y')
       {
           
            System.out.print("How many Java Programs would you like? : ");
            double amount = in.nextDouble();
            double total = amount * 10.0;
            if (amount > 10)
            {
                System.out.println(amount + " is not a valid amount.\n Setting quantity to 10");
                amount = 10;
                double newTotal = amount * 10.0;
                System.out.println("\nYour total is:\n\t10 * " + amount + " = $" + newTotal);
            }
            else if (amount < 0)
            {
                System.out.println(amount + " is not a valid amount.\n Setting quantity to 0");
                amount = 0;
                double newTotal = amount * 10.0;
                System.out.println("\nYour total is:\n\t10 * " + amount + " = $" + newTotal);
            }
            else
            {
                System.out.println("\nYour total is:\n\t10 * " + amount + " = $" + total);
            }
       }
       else
       {
           System.out.println("Have a good day!");
       }
    }
}
