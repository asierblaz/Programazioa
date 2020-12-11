/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodoak;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author blazquez.asier
 */
public class Reverse {

    /**
     * @param args the command line arguments
     */
  public static void main(String args[]) {
                     int numItems;
                     int[] items;  // Declare array name, to be allocated after numItems is known
		      Scanner in = new Scanner(System.in);

		      System.out.print("Numero de elementos del primer array:");
		      numItems = in.nextInt();


		      // Allocate the array
		      items = new int[numItems];

		      // Prompt and read the items into the "int" array, if array length > 0
		      System.out.print("Enter the value of all items (separated by space): ");
                   for (int i = 0; i < numItems; i++) {
			items[i] = in.nextInt();
		}
               
                        System.out.println( Arrays.toString(items)); 
                       reverse(items);
                       System.out.println( Arrays.toString(items));  
                    
                  
    }
/*
    public static void reverse(int[] array) {
      	int temp;
		int i; 
		int j; 
		
		for (i = 0, j = array.length - 1; i < j ;++i, --j) {
			temp = array[i];
			array[i] = array[j];
			array[i] = temp;
		}
	}*/
    
       public static void reverse(int[] array) {

        int aux[];
        aux = new int[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {

            aux[j] = array[i];
            j++;
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = aux[i];
        }
    }

}