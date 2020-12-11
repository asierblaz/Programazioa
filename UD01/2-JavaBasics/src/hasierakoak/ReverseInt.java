package hasierakoak;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author blazquez.asier
 */
public class ReverseInt {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // Declare variables
      int inNumber;   // to be input
      int inDigit;    // each digit
      int reverse=0;     
      Scanner in = new Scanner(System.in);  // Scan the keyboard for input
      System.out.print("Enter a positive integer: ");
      inNumber=in.nextInt();

      // Extract and drop the "last" digit repeatably using a while-loop with modulus/divide operations
      while (inNumber > 0) {
         inDigit = inNumber % 10; // extract the "last" digit
         // Print this digit (which is extracted in reverse order)
          reverse=reverse*10+inDigit;
         inNumber /= 10;          // drop "last" digit and repeat
      }
        System.out.println("The reverse is: "+reverse);        
        
        in.close();
    }
}
