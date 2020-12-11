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
public class Product1ToN {

    /**
     * @param args the command line arguments
     */
   public static void main (String[] args) {
      // Define variables
      long product = 1;          // The accumulated sum, init to 0
      int lowerbound = 1;
      int upperbound = 13;

        for (int number = lowerbound; number <= upperbound; ++number) {
            // The loop index variable number = 1, 2, 3, ..., 99, 100
         product= product*number;
      }

       System.out.println("Product "+ product);
              
   }
}


