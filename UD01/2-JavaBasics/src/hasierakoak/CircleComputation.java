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
public class CircleComputation {

    /**
     * @param args the command line arguments
     */
//    
//   
//
//
 public static void main (String[] args) {
      // Declare variables
      double radius, diameter, circumference, area;  // inputs and results - all in double
     // ......
      Scanner in = new Scanner(System.in);  // Scan the keyboard for input

      // Prompt and read inputs as "double"
      System.out.print("Enter the radius: ");
      radius = in.nextDouble();  // read input as double

      // Compute in "double"
    diameter = 2.0 * radius;
    area = Math.PI * radius * radius;
     circumference = 2.0 * Math.PI * radius;
      // Print results using printf() with the following format specifiers:
      //   %.2f for a double with 2 decimal digits
      //   %n for a newline
      System.out.printf("Diameter is: %.2f%n", diameter);
          System.out.printf("Circunference is: %.2f%n", area);
      System.out.printf("Area is: %.2f%n", circumference);
           in.close();  // Close Scanner

   }
}
