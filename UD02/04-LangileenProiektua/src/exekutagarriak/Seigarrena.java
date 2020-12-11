/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;

import java.util.Scanner;
import model.Langilea;

/**
 *
 * @author blazquez.asier
 */
public class Seigarrena {

    public static void main(String[] args) {
        Langilea[] langileak = Langilea.nireHamarLagunLangile();
        String izena;
        int id = 0;
        taula(langileak);
        System.out.println("");
        Scanner in = new Scanner(System.in);
        System.out.print("Sartu langile baten izena:");
        izena = in.next();
        if (Langilea.bilatu(izena, langileak) == null) {
            System.out.println("Langilea ez dago listan");

        } else {
            id = Langilea.bilatu(izena, langileak).getId() - 1;
            System.out.println(Langilea.bilatu(izena, langileak));
            System.out.print("Zenbat igo nahi diozu soldata " + izena + "ri?:");
            langileak[id].setSoldata(langileak[id].getSoldata() + Double.valueOf(in.next()));
            taula(langileak);
        }
        System.out.println("");
        System.out.println("Hau da enpresak urte baten zenbat diru ordaindu beharko duen nominetan:  ");
        System.out.print(urteanGastuak(langileak));
        System.out.println("");
        System.out.println("");
        
        System.out.println("Hau da enpresan soldata handien duen langilea:  ");
        System.out.println(soldataHandiena(langileak));

    }

    public static void taula(Langilea[] langileak) {

        System.out.printf("\n\n%8s %15s %15s %15s", "ID", "Izena", "Abizena", "Soldata");
        //  System.out.printf("\n\n%8s %8s %5s %5s %12s %8s ", "Rectangulo", "Ancho", "Alto", "Area", "Perimetro", "Tipo");
        System.out.println("\n==========================================================");

        for (int i = 0; i < langileak.length; i++) {

            System.out.printf("%8s", langileak[i].getId());
            System.out.printf("%15s", langileak[i].getIzena());
            System.out.printf("%15s", langileak[i].getAbizena());
            System.out.printf("%15s", langileak[i].getSoldata());
            System.out.println("");

        }
        System.out.println("");
    }

    public static double urteanGastuak(Langilea[] langileak) {

        double nomina = 0;

        for (int i = 0; i < langileak.length; i++) {

            nomina = nomina + langileak[i].getUrtekoSoldata();
        }
        return nomina;
    }

    public static Langilea soldataHandiena(Langilea[] langileak) {
        int cont = 0;
        double max = 0;
        for (int i = 0; i < langileak.length; i++) {
            if (langileak[i].getSoldata() >= max) {
                max = langileak[i].getSoldata();
                cont = i;
            }
        }
        return langileak[cont];
    }

}
