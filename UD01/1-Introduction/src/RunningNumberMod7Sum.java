/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author blazquez.asier
 */
public class RunningNumberMod7Sum {
  public static void main(String[] args) {
      int lowerbound = 7;      // Store the lowerbound
      int upperbound = 1000;   // Store the upperbound
      int sum = 0;   // Declare an int variable "sum" to accumulate the numbers
                     // Set the initial sum to 0
      // Use a while-loop to repeatedly sum from the lowerbound to the upperbound
      int number = lowerbound;
      while (number <= upperbound) {
            // number = lowerbound, lowerbound+1, lowerbound+2, ..., upperbound for each iteration
         sum = sum + number;  // Accumulate number into sum
         number=number+7;            // increment number
      }
      // Print the result
      System.out.println("The sum from " + lowerbound + " to " + upperbound + " is " + sum);
   }

}
