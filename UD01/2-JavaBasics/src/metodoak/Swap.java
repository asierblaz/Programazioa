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
public class Swap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[] array2= {8,7,9,5,1};
        int[] array3= {1,8};
        
        
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));
        
        System.out.println(swap(array, array2));
                
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array3));
          System.out.println(swap(array, array3));
        
    }

    public static boolean swap(int[] array1, int[] array2) {

        boolean swaped = false;
        int aux[];
        aux = new int[array1.length];

        if (array1.length == array2.length) {
            for (int i = 0; i < array1.length; i++) {

                aux[i] = array1[i];
                array1[i] = array2[i];
                array2[i] = aux[i];

                swaped = true;

            }

        } else {
            swaped = false;
        }
        return swaped;
    }

}
