package Examen2019;

import java.util.Scanner;

public class Marrazkia {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int altuera =0;
        int zabalera=0  ;
        int n = 1;

        while (altuera <= 0) {
            System.out.print("Altuera: ");
            altuera = in.nextInt();

        }
        while (zabalera <=0) {
            System.out.print("Zabalera: ");
            zabalera = in.nextInt();

        }

        for (int i = 1; i <= altuera; i++) {  // alto
            System.out.println("");
            for (int j = 1; j <= zabalera; j++) {  // Ancho
                System.out.printf(" %2d ",n);
                n++;
            }

        }
    }

}
