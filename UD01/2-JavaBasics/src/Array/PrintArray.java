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
public class PrintArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    // Declare variables
      int numItems;
      int[] items;  // Declare array name, to be allocated after numItems is known
        Scanner in = new Scanner(System.in);
    System.out.print("Enter number of items:");
    numItems = in.nextInt();
      // Prompt for for the number of items and read the input as "int"
   

      // Allocate the array
      items = new int[numItems];

      // Prompt and read the items into the "int" array, if array length > 0
          if (items.length > 0) {
          System.out.println("");
           System.out.print("Enter " + (numItems) + " Items: ");
             for (int i = 0; i < items.length; ++i) {  // Read all items
       
         items[i] = in.nextInt();
        
         }
      }

      // Print array contents, need to handle first item and subsequent items differently
  System.out.print(" The values are: ");
      for (int i = 0; i < items.length; ++i) {
         if (i == 0) {
            // Print the first item without a leading commas
             System.out.print("["+items[0]);
         } else {
            // Print the subsequent items with a leading commas
                       System.out.print(","+items[i]);

         }

      }
             		         System.out.print("]");

    }}