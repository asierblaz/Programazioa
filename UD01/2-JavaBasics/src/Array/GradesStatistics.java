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
public class GradesStatistics {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
          int numItems;
		      int[] items;  // Declare array name, to be allocated after numItems is known
                      double average=0;
                    
                      int sum=0;
		      Scanner in = new Scanner(System.in);

		      System.out.print("Enter number of students:");
		      numItems = in.nextInt();


		      // Allocate the array
		      items = new int[numItems];

		      // Prompt and read the items into the "int" array, if array length > 0
		    
                      for (int i = 0; i < numItems; i++) {
                        System.out.print("Enter grade for student "+(i+1)+":");
			items[i] = in.nextInt();
                      
		}
                  int max=items[0];
                      int min=items[0];      
		for (int i = 0; i < numItems; i++) {
                     sum=sum + items[i];
                    if (max < items[i]) {
				max = items[i];
                    }
                     if (min > items[i]) {
				min = items[i];
			}
		}
                average=(double) sum/(double)(numItems);
                System.out.println("The average is: "+average);
                System.out.println("The minimum is: "+min);
                System.out.println("The maximum is: "+max);
	}
}
