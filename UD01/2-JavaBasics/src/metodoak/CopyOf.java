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
public class CopyOf {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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

        System.out.println("The copy of the array is:");

        int[] items2 = copyOf(items);
        System.out.println(Arrays.toString(items2));

        int newlength;

        System.out.println("Introduce la nueva longitud del array");
        newlength = in.nextInt();
        System.out.println(Arrays.toString(copyOf2(items, newlength)));

    }

    public static int[] copyOf(int[] array) {
        int n[];
        n = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            n[i] = array[i];
        }
        return n;
    }

    public static int[] copyOf2(int[] array, int newLength) {
        int n[];
        n = new int[newLength];

        if (n.length < array.length) {
            for (int i = 0; i < n.length; i++) {
                n[i] = array[i];
            }
        } else {

            for (int i = 0; i < array.length; i++) {
                n[i] = array[i];
            }

        }
        return n;
    }

}
