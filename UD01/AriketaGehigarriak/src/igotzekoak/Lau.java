/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package igotzekoak;

import java.util.Scanner;

/**
 *
 * @author blazquez.asier
 */
//Asier Blazquez 26/10/2020
public class Lau {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        char karakterea;
        int zenbakia;
        char exit = 'b';
        System.out.println("LAU PROGRAMA\n"
                + "=============================");
        Scanner in = new Scanner(System.in);

        while (exit == 'b') {  //exit e balorea duenean bukletik irtengo da
            System.out.print("Aukeratu karaktere bat: ");
            karakterea = in.next().charAt(0);
            System.out.print("Zenbat aldiz imprimatu nahi duzu?: ");
            zenbakia = in.nextInt();
            karakterakImprimatu(karakterea, zenbakia);
            System.out.println("");
            System.out.println("Jarraituko dugu (b/e)? ");
            exit = in.next().charAt(0);
        }
        System.out.println("");
        System.out.println("Agur!!");
    }

    //Karaktereak imprimatzeko metodoa
    public static void karakterakImprimatu(char karakterea, int zenbat) {

        for (int i = 0; i < zenbat; i++) {
            System.out.print(karakterea);
            System.out.print(" ");
        }

    }
}
