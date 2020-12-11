package hasierakoak;


import static java.lang.System.in;
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
public class SalesTaxCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
           // Declare constants
      final double SALES_TAX_RATE = 0.07;
      final int SENTINEL = -1;        // Terminating value for input
      
      // Declare variables
      double price, actualPrice=0, salesTax=0;  // inputs and results
      double totalPrice = 0.0, totalActualPrice = 0.0, totalSalesTax = 0.0;  // to accumulate
//    

        Scanner in = new Scanner(System.in);  // Scan the keyboard for input

      // Read the first input to "seed" the while loop
      System.out.print("Enter the tax-inclusive price in dollars (or -1 to end): ");
      price =  in.nextDouble();
      

      while (price != SENTINEL) {
         // Compute the tax
         actualPrice=price/(1+SALES_TAX_RATE);
         salesTax=price-actualPrice;
         

    //     // Accumulate into the totals
              totalPrice= totalPrice+ price;
              totalSalesTax=totalSalesTax+salesTax;
              totalActualPrice=totalActualPrice+actualPrice;
         // Print results
          System.out.println("Actual Price is:"+actualPrice+", Sales Tax is: "+salesTax);

          
         // Read the next input and repeat
         System.out.print("Enter the tax-inclusive price in dollars (or -1 to end): ");
         price =  in.nextDouble();
         
      }
      // print totals
        System.out.println("Total Price is: $"+totalPrice);
        System.out.println("Total Actual Price is: $"+totalActualPrice);
        System.out.println("Total Sales Tax is: $"+totalSalesTax);
    


    
    in.close();
    
    }
}
