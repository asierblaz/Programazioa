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
public class IncomeTaxCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
        // Declare constants first (variables may use these constants)
      // The keyword "final" marked these as constant (i.e., cannot be changed).
      // Use uppercase words joined with underscore to name constants
      final double TAX_RATE_ABOVE_20K = 0.1;
      final double TAX_RATE_ABOVE_40K = 0.2;
      final double TAX_RATE_ABOVE_60K = 0.3;

      // Declare variables
      int taxableIncome;
      double taxPayable = 0;
     
      
        System.out.print("Enter the taxable income: $");
           Scanner in = new Scanner(System.in);  // Scan the keyboard for input

           taxableIncome= in.nextInt();
           
      // Compute tax payable in "double" using a nested-if to handle 4 cases
      if (taxableIncome <= 20000) {         // [0, 20000]
        taxPayable =taxableIncome*0;
      } else if (taxableIncome <= 40000) {  // [20001, 40000]
        taxPayable = (20000 * 0) - ((taxableIncome - 20000) * TAX_RATE_ABOVE_20K); 	
      } else if (taxableIncome <= 60000) {  // [40001, 60000]
         taxPayable = (20000 * 0) + (20000 * TAX_RATE_ABOVE_20K) + ((taxableIncome - 40000) * TAX_RATE_ABOVE_40K);

      } else {                              // [60001, ]
             taxPayable = (((taxableIncome - 60000)* TAX_RATE_ABOVE_60K) + (20000 * 0) + (20000 * TAX_RATE_ABOVE_20K) + (20000 * TAX_RATE_ABOVE_40K));

      }
      
      
      		System.out.printf("The income tax payable is: $%.2f%n", taxPayable);
   
     in.close();
    }
}
