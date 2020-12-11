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
Bi zenbaki eskatzen dira, zatigarria bada metodoak true imprimatuko du eta orduan zenbakia zatigarria dela esango du , zatigarria ez bada false imprimatuko du eta zatigarria ez dela esango du.

 */
public class Zatigarria {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here

        int zatikizuna, zatitzailea;
        Scanner in = new Scanner(System.in);
        System.out.print("Sartu Zatikizuna (zenbaki handia): ");
        zatikizuna = in.nextInt();
        System.out.print("Sartu Zatitzailea (zenbaki txikia): ");
        zatitzailea = in.nextInt();

        if (zatigarriaDa(zatikizuna, zatitzailea)) {

            System.out.println(zatikizuna + " zenbakia zatigarria da " + zatitzailea + " zenbakiarekin");

        } else {
            System.out.println(zatikizuna + " zenbakia ez da zatigarria " + zatitzailea + " zenbakiarekin");

        }
    }

    public static boolean zatigarriaDa(int zatikizuna, int zatitzailea) {
        boolean posible = false;

        if (zatikizuna % zatitzailea == 0) {
            posible = true;
        } else {
            posible = false;
        }
        return posible;

    }

}
