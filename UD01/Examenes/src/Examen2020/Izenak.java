
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

/*
Izen bat eskatzen du eta zerrendan badago zerrendan dagoela bueltatuko du eta zer posizioan dago, izena ez badago zerrendan ez dagoela bueltatuko du.

 */
public class Izenak {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        boolean encontrado = false;

        String zerrenda[] = {"Jon", "Jone", "June", "Julian", "Julen"}; //zerrendaren deklarazioa

        Scanner in = new Scanner(System.in);
        String izena;

        System.out.print("Noren bila zabiltza? ");
        izena = in.next();
        int i = 0;
        while (i < zerrenda.length && encontrado == false) {

            if (zerrenda[i].equals(izena)) {

                encontrado = true;

            } else {
                i++;
            }

        }

        if (encontrado == true) {
            System.out.println(izena + " zerrendako " + (i + 1) + "a da.");

        } else {

            System.out.println(izena + " ez dago zerrendan.");

        }

    }
}
