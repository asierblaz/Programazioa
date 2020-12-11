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
public class Search {

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
        System.out.print("Introduce un numero para saber si esta en el array ");
        int key = in.nextInt();
        if (search(items, key) != -1) {
            System.out.println("El numero " + key + " esta en el array ");
            System.out.println(search(items, key));
        } else {
            System.out.println("El numero " + key + " No esta en el array ");
            System.out.println(search(items, key));
        }
    }

    public static int search(int[] array, int key) {
        boolean esta = false;
        int i = 0;
        int cont = 0;
        while (esta == false && i < array.length) {
            if (array[i] == key) {
                esta = true;
                cont = i;
            }
            i++;
        }
        if (esta == true) {
            return cont;
        } else {
            return -1;
        }

    }
}
