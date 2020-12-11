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
public class ComputePI {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

      double sum = 0.0;
      int maxDenominator = 1000;   // Try 10000, 100000, 1000000
      for (int denominator = 1; denominator <= maxDenominator; denominator += 2) {
            // denominator = 1, 3, 5, 7, ..., maxDenominator
         if (denominator % 4 == 1) {
             System.out.println(denominator);
            sum = sum +(1/denominator);
             System.out.println(sum);
         } else if (denominator % 4 == 3) {
           sum =sum -(1/denominator);
         } else {   // remainder of 0 or 2
            System.out.println("Impossible!!!");
         }
      }
    }
}
