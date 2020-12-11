/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UD02;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author blazquez.asier
 */
public class BubleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        int[] zenbakiak = new int[10];
        Scanner in = new Scanner(System.in);

        System.out.print("Sartu 10 balio espazio batez separatuta: ");
        for (int i = 0; i < zenbakiak.length; i++) {
            zenbakiak[i] = in.nextInt();
        }

        System.out.print("Arraya ordenatu gabe: ");
        System.out.println(Arrays.toString(zenbakiak));
        System.out.print("Arraya bubble sort eta gero: ");
        bubbleSort(zenbakiak);
        System.out.println(Arrays.toString(zenbakiak));
    }

    public static void bubbleSort(int[] array) {

        int aux = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < (array.length - i); j++) {
                if (array[j - 1] > array[j]) {
                    aux = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = aux;
                }

            }

        }
    }
}
