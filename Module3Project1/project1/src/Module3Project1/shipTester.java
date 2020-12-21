package Module3Project1;

/** Program Name: shipTester.java
 *
 * @author Austin Spencer 
 * Class: CSC 205
 * Date: 09/12/2019
 * Description: Creates an array of objects from superclass and subclass
 * then prints each object in the array
 * 
 */
public class shipTester 
{

    /**
     *
     * @param args
     */
    public static void main(String[] args)
    {
        Ship[] ships = new Ship [4]; // create Ship array of size 4
        //assign the each its object and paramaters
        ships[0] = new Ship("Sentinel", "1960");
        ships[1] = new CruiseShip("Disney Magic", "1998", 2400);
        ships[2] = new CargoShip("Black Pearl", "1800", 5000);
        ships[3] = new CruiseShip("Norwegian", "1999", 3000);
        
        //loop that will print out each object in the array in order
        for(int i=0; i< ships.length; i++){
            System.out.println(ships[i].toString());
        }      
    }
}
