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
public class HarmonicSum {   // Save as "HarmonicSum.java"
   public static void main (String[] args) {
      // Define variables
      int maxDenominator = 50000;  // Use a more meaningful name instead of n
      double sumL2R = 0.0;         // Sum from left-to-right
      double sumR2L = 0.0;         // Sum from right-to-left
      double absDiff;
      
      // Absolute difference between the two sums
      // for-loop for summing from left-to-right
      double cont=1;
            double cont2=5000;

      for (int denominator = 1; denominator <= maxDenominator; ++denominator) {
          // denominator = 1, 2, 3, 4, 5, ..., maxDenominator
          sumL2R=(double)sumL2R+(1/cont);
                  cont++;
          // Beware that int/int gives int, e.g., 1/2 gives 0.
      }
      for (int denominator = maxDenominator; denominator >= 1; denominator--) {
			sumR2L += (double) 1.0 / denominator;
                        
		}
      
      System.out.println("The sum from left-to-right is: " + sumL2R);
     
          System.out.println("The sum from right-to-left is: " +sumR2L);
           // Find the absolute difference and display
      if (sumL2R > sumR2L) {
          absDiff= sumL2R-sumR2L;
             System.out.println("The absolute dif is"+absDiff);

      }
      else {absDiff= sumR2L- sumL2R;
             System.out.println("The absolute dif is "+absDiff);

      }

   }
}
