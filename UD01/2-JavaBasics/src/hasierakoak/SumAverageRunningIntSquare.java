package hasierakoak;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author blazquez.asier
 */
public class SumAverageRunningIntSquare {
   public static void main (String[] args) {
      // Define variables
      int sum = 0;          // The accumulated sum, init to 0
      double average;       // average in double
      int lowerbound = 1;
      int upperbound = 100;
      int cont= 0;
      int aux;

      
        for (int number = lowerbound; number <= upperbound; ++number) {
            // The loop index variable number = 1, 2, 3, ..., 99, 100
         aux= number*number;
         sum= sum+aux;
         cont=cont+1;
      }

//---------------------------------------------------------------
      // Compute average in double. Beware that int / int produces int!
      average= (double)sum/cont;
      // Print sum and average
       System.out.println("Sum is : "+ sum + " Average :" + average);
              
   }
}
