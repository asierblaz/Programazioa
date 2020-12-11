/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodoak;

import java.util.Scanner;

/**
 *
 * @author blazquez.asier
 */
public class Exponent {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
  int exp;    // exponent (non-negative integer)
      int base;   // base (integer)
    
                Scanner in = new Scanner(System.in);
                System.out.print("Sartu basea: ");
                base=in.nextInt();
                System.out.print("Sartu Exponentea: ");
                exp=in.nextInt();
      // Prompt and read exponent and base
      
      // Print result
      System.out.println(base + " raises to the power of " + exp + " is: " + exponent(base, exp));
    }
     public static int exponent(int base, int exp) {
      int product = 1;   // resulting product
      
      // Multiply product and base for exp number of times
      for (int i=0;i<=exp-1;i++) {
         product *= base;
      }

      return product;
   }
}

