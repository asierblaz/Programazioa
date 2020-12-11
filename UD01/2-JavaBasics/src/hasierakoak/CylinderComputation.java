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
public class CylinderComputation {

    /**
     * @param args the command line arguments
     */
//    
//   
//
//
 public static void main (String[] args) {
      // Declare variables
      double radius,baseArea,volume,height,surfaceArea;  
     
      Scanner in = new Scanner(System.in);  // Scan the keyboard for input
      Scanner n = new Scanner(System.in);  // Scan the keyboard for input

      // Prompt and read inputs as "double"
      System.out.print("Enter the radius: ");
      radius = in.nextDouble(); 
      
      System.out.print("Enter the height: ");
    height = n.nextDouble(); // read input as double
    
    
      // Compute in "double"
        baseArea = Math.PI * radius * radius;
        surfaceArea = 2.0 * Math.PI * radius + 2.0 * baseArea;
        volume = baseArea * height;
  


      System.out.printf("Base Area is: %.2f%n", baseArea);
          System.out.printf("Surface Area is: %.2f%n", surfaceArea);
      System.out.printf("Volume is: %.2f%n", volume);
        in.close();
        n.close();

   }
}
