/**Program Name:    RoomCarpet.java
Author:                  Austin Spencer
Class:                    CSC 205
Date Written:        09/02/19
Brief Description: Driver Class, runs the program
*/
package roomcarpet;
import java.util.Scanner;

public class CarpetCalculator 
{
    /**
     * 
     * @param args 
     */
    public static void main(String[] args) 
    {
        
        System.out.println("This program will display price to carpet a room. "
                + "\nYou must input the room's dimensions in feet.");
        System.out.print("Enter the length first: ");
        Scanner in = new Scanner(System.in);
        double carpetLength = in.nextDouble();
        System.out.print("\nNow enter the width: ");
        double carpetWidth = in.nextDouble();
        RoomDimension roomDims = new RoomDimension(carpetLength,carpetWidth); 
        /**
         * this sets the rooms dimensions as whatever the user wants
         */
        System.out.print(roomDims.toString());
        RoomCarpet roomCarp = new RoomCarpet(roomDims, 8.0); //sets price to $8 per square foot
        System.out.println(roomCarp.toString());
        
    }
}
