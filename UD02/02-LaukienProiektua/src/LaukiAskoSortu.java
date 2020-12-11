
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author blazquez.asier
 */
public class LaukiAskoSortu {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        int zenbat = 1;
        Scanner in = new Scanner(System.in);
        int altuera, zabalera;
        System.out.print("Zenbat lauki sortu nahi dituzu? ");

        zenbat = in.nextInt();
        Laukia[] laukiak = new Laukia[zenbat];

        for (int i = 0; i < zenbat; i++) {
            System.out.println((i + 1) + ". LAUKIAREN DATUAK");
            System.out.print("   Zabalera: ");
            zabalera = in.nextInt();
            System.out.print("   Altuera : ");
            altuera = in.nextInt();
            laukiak[i] = new Laukia(zabalera, altuera);

        }
       

        System.out.println("Laukia   Zabalera Altuera Azalera Perimetroa  Mota\n"
                + "==============================================================\n");
        for (int i = 0; i < zenbat; i++) {

            System.out.println(i + 1 + "       " + laukiak[i].getZabalera() + "       " + laukiak[i].getAltuera() + "      " + laukiak[i].getAzalera() + "      " + laukiak[i].getPerimetroa() + "       " + laukiak[i].getMota());

        }
    }
}
