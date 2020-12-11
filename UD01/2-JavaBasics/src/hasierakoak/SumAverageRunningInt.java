package hasierakoak;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author blazquez.asier
/**
 * Compute the sum and average of running integers from a lowerbound to an upperbound using loop.
 */
public class SumAverageRunningInt {   // Save as "SumAverageRunningInt.java"
   public static void main (String[] args) {
      // Define variables
      int sum = 0;          // The accumulated sum, init to 0
      double average;       // average in double
      int lowerbound = 2;
      int upperbound = 7;
      int cont= 0;

      
     /* --------------------usig for-----------------------------------
       Use a for-loop to sum from lowerbound to upperbound
      for (int number = lowerbound; number <= upperbound; ++number) {
            // The loop index variable number = 1, 2, 3, ..., 99, 100
         sum += number;     // same as "sum = sum + number"
         cont=cont+1;
      }
*/
//--------------usig while---------------------------------------------   
while (lowerbound <= upperbound) {  // test
         sum += lowerbound;       
         ++lowerbound; 
         cont= cont+1;
      }


//-------------------------------------------------------
//      int number = lowerbound;         // declare and init loop index variable
//      do {
//         sum += number;
//         ++number;                     // update
//      } while (number <= upperbound); 
//---------------------------------------------------------------
      // Compute average in double. Beware that int / int produces int!
      average= (double)sum/cont;
      // Print sum and average
       System.out.println("Sum is : "+ sum + " Average :" + average);
              
   }
}