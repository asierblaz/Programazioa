/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Scanner;

/**
 *
 * @author blazquez.asier
 */
public class Dec2Hex {

    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) {
      // Declare variables
      int dec;  //el numero que introducimos             
      String hexadecimalfinal = "";   // lo que se imprime
      int base = 16;       // la base
      char[] hexChars =     // Use this array as lookup table for converting 0-15 to 0-9A-F
         {'0','1','2','3', '4','5','6','7', '8','9','A','B', 'C','D','E','F'};
      Scanner in = new Scanner(System.in);
   
      // Prompt and read input as "int"
      System.out.print("Enter a decimal number: ");
      dec = in.nextInt();
   
      // Repeated modulus/division and get the hex digits (0-15) in reverse order
      while (dec > 0) {
         int i = dec % base;   // 0-15
         hexadecimalfinal = hexChars[i] + hexadecimalfinal;  // Append in front of the hex string corresponds to reverse order
         dec = dec / base;
      }
      System.out.println("The equivalent hexadecimal number is " + hexadecimalfinal);
      in.close();
   }
}