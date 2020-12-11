/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author blazquez.asier
 */
public class RunningNumberProduct {

   public static void main(String[] args) {
      int lowerbound = 1;      // Store the lowerbound
      int upperbound = 10;   // Store the upperbound
      int product = 1;   // Declare an int variable "sum" to accumulate the numbers
                     // Set the initial sum to 0
      // Use a while-loop to repeatedly sum from the lowerbound to the upperbound
      int number = lowerbound;
      while (number <= upperbound) {
            // number = lowerbound, lowerbound+1, lowerbound+2, ..., upperbound for each iteration
         product = product * number;  // Accumulate number into sum
         ++number;            // increment number
      }
      // Print the result
      System.out.println("The product from " + lowerbound + " to " + upperbound + " is " + product);
   }

}
