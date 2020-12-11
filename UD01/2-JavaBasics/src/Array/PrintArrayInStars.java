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
public class PrintArrayInStars {

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


		      // Allocate the array
		      items = new int[numItems];

		      // Prompt and read the items into the "int" array, if array length > 0
		      System.out.print("Enter the value of all items (separated by space): ");
                   for (int i = 0; i < numItems; i++) {
			items[i] = in.nextInt();
		}

		for (int row = 0; row < items.length; ++row) { // row
			System.out.print(row + ": ");

			for (int stars = 1; stars <= items[row]; ++stars) { // column
				System.out.print("*");
			}
			System.out.print("(" + items[row] + ")");
			System.out.println();
		}
	}
}





