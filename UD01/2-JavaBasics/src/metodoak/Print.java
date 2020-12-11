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
public class Print {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        int numeros[] = {1, 7, 8, 3, 7};
        int numeros2[] = {};

        double p[] = {2.2, 6.8, 7, 5};

        System.out.println("Print array int {1, 7, 8, 3, 7}; ");
        print(numeros);
        System.out.println("Print array int {}; ");
        print(numeros2);
        System.out.println("");
        System.out.println("Print array double {2.2,6.8,7,5}; ");
        print(p);

    }

    // int imprimir
    public static void print(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {

            if (i == array.length - 1) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ",");
            }

        }
        System.out.print("]");
         System.out.println("");
    }
    // double imprimir  

    public static void print(double[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {

            if (i == array.length - 1) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ",");
            }

        }
        System.out.print("]");
                 System.out.println("");

    }
       public static void print(float[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {

            if (i == array.length - 1) {
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ",");
            }

        }
        System.out.print("]");
                 System.out.println("");

    }
}
