package Examen2018;


import java.util.Arrays;
import java.util.Scanner;

public class Maximoa {

    public static void main(String[] args) {

        //IDATZI HEMEN ZURE KODEA
        System.out.println("MAXIMOAREN KALKULUA\n"
                + "=============================");
        Scanner in = new Scanner(System.in);
        int zenbakia = 0;
        int cont = 0;
        int numeros[];
        numeros = new int[1000];

        while (zenbakia != -1) {
            System.out.print("Sartu zenbaki positibo bat (Bukatzeko, -1):");
            zenbakia = in.nextInt();
            numeros[cont] = zenbakia;
            cont++;

        }
        int max = 0;
        for (int i = 0; i < cont - 1; i++) {
            if (numeros[i] >= max) {
                max = numeros[i];
            }
       }
        System.out.println("Sartu dituzun zenbaki guztien artean handiena " + max + " izan da.");
    }
}
