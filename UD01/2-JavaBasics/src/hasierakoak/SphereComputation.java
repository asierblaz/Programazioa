package hasierakoak;


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
public class SphereComputation {

    /**
     * @param args the command line arguments
     */
public static void main (String[] args) {
      // Declare variables
      double radius, surfaceArea, volume, area;  // inputs and results - all in double
     // ......
      Scanner in = new Scanner(System.in);  // Scan the keyboard for input

      // Prompt and read inputs as "double"
      System.out.print("Enter the radius: ");
      radius = in.nextDouble();  // read input as double

      // Compute in "double"
  
        surfaceArea = 4 * Math.PI * radius * radius;
             volume=4/3*Math.PI*Math.pow(radius, 3);
      // Print results using printf() with the following format specifiers:
      //   %.2f for a double with 2 decimal digits
      //   %n for a newline
          System.out.printf("Surface Area is: %.2f%n", surfaceArea);
          System.out.printf("Volume is: %.2f%n", volume);

    in.close(); 
   }
}