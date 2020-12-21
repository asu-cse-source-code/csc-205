package hw3;
public class HW3 {

    public static void main(String[] args) {
        int lowerLimit = (int) -(76 * Math.random());// This is the lower constraint to the random range
        int upperLimit = (int) (76 * Math.random());// This is the higher constraint
        int counter = upperLimit - 2; /**
         * instead of counting up with every prime number I decided to
         * count down from the maximum amount of prime numbers.
         * So each time a number is not prime I subtract one from the original 
         * maximum amount of primes until I reach the actual number of primes.
         */
        int min = lowerLimit; /**
         * I mad the 'min' variable because I did not want to permanently
         * change the 'lowerLimit' variable so that I could still use it in the output.
         */
        while (min <= upperLimit) {
            if (min > 2) { //no prime numbers below 2 are allowed in this program
                int num = 2;
                while (num < min) {
                    if (min % num == 0) { // when modulus of the lowerLimit is equal to 0 that mean that the number is not prime
                        counter--; //using the subtraction since this number is NOT prime due to having no remainder
                        num = min; /**
                         * Since this number is already found to be not prime it isn't
                         * necessary to continue to test it. So by setting the num to min I am 
                         * exiting the while loop.
                         */
                    }
                    else {
                        num++;
                    } // adding one to num and if still less than lowerlimit will redo the loop to check for prime
                }
                min++;
            }
            else { 
                min++;
            }
        }
        
        System.out.println("There are " + counter + " prime numbers between the numbers " 
        + lowerLimit + " and " + upperLimit);
    }
    
    
}
