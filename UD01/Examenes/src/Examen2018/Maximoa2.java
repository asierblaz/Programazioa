/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen2018;

import java.util.Scanner;

/**
 *
 * @author blazquez.asier
 */
public class Maximoa2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here

        System.out.println("MAXIMOAREN KALKULUA\n"
                + "=============================");
        Scanner in = new Scanner(System.in);
        int zenbakia = 0;
        int max = 0;

        while (zenbakia != -1) {
            System.out.print("Sartu zenbaki positibo bat (Bukatzeko, -1):");
            zenbakia = in.nextInt();
            if (max < zenbakia) {
                max = zenbakia;
                System.out.println(max);
            }

        }
        System.out.println("Sartu dituzun zenbakien artean maximoa "+ max+" da ");

    }
}