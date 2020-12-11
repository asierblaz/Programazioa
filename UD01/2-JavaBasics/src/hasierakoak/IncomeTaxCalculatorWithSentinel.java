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
public class IncomeTaxCalculatorWithSentinel {

    /**
     * @param args the command line arguments
     */
     public static void main(String args[]) {
      
        final int SENTINEL = -1;    // Terminating value for input
        final double TAX_RATE_ABOVE_20K = 0.1;
        final double TAX_RATE_ABOVE_40K = 0.2;
      final double TAX_RATE_ABOVE_60K = 0.3;

      // Declare variables
      int taxableIncome;
      double taxPayable;
  
           Scanner in = new Scanner(System.in);  // Scan the keyboard for input

         
           
      // Read the first input to "seed" the while loop
      System.out.print("Enter the taxable income (or -1 to end): $");
      taxableIncome = in.nextInt();

      while (taxableIncome != SENTINEL) {
         // Compute tax payable
        if (taxableIncome <= 20000) {         // [0, 20000]
        taxPayable =taxableIncome*0;
      } else if (taxableIncome <= 40000) {  // [20001, 40000]
        taxPayable = (20000 * 0) - ((taxableIncome - 20000) * TAX_RATE_ABOVE_20K); 	
      } else if (taxableIncome <= 60000) {  // [40001, 60000]
         taxPayable = (20000 * 0) + (20000 * TAX_RATE_ABOVE_20K) + ((taxableIncome - 40000) * TAX_RATE_ABOVE_40K);

      } else {                              // [60001, ]
             taxPayable = (((taxableIncome - 60000)* TAX_RATE_ABOVE_60K) + (20000 * 0) + (20000 * TAX_RATE_ABOVE_20K) + (20000 * TAX_RATE_ABOVE_40K));

      }
      

         // Read the next input
         System.out.print("Enter the taxable income (or -1 to end): $");
         taxableIncome = in.nextInt();
            // Repeat the loop body, only if the input is not the SENTINEL value.
            // Take note that you need to repeat these two statements inside/outside the loop!
            
      }
      System.out.println("bye!");

     }
}

