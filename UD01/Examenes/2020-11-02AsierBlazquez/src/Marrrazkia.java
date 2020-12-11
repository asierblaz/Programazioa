/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author blazquez.asier
 */
//Sartutako balioen arabera karratu bat marraztuko du, tente true bada tente marraztuko du eta betea false bada bakarrik aldeak marraztuko ditu.
public class Marrrazkia {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        marraztu(5, 5, '1', true, true);
        marraztu(6, 3, '2', true, true);
        marraztu(3, 5, '3', true, true);
        marraztu(4, 6, '4', true, true);
        marraztu(7, 3, '5', false, true);
        marraztu(8, 3, '6', true, false);
        marraztu(3, 5, '7', false, false);
        marraztu(6, 3, '8', true, false);
        marraztu(3, 4, '9', false, false);

    }

    public static void marraztu(int alde1, int alde2, char pintzela, boolean tente, boolean betea) {

        int altuera = 0;
        int zabalera = 0;
        int max = 0;
        int min = 0;
        char espacio = ' ';

        if (alde1 >= alde2) {
            max = alde1;
            min = alde2;
        } else {
            max = alde2;
            min = alde1;
        }

        if (tente == true) { //altura mayor que zabalera
            altuera = max;
            zabalera = min;
        } else {            //zabalera mayor que altuera
            altuera = min;
            zabalera = max;

        }

        if (betea == true) {
            for (int i = 1; i <= altuera; i++) {  // alto
                System.out.println("");
                for (int j = 1; j <= zabalera; j++) {  // Ancho
                    //System.out.printf(" %2d ", pintzela);
                    System.out.printf("%2c", pintzela);

                }

            }

            System.out.println("");

        } else {  // cuadrado vacio 

            int i, j;
            for (i = 1; i <= altuera; i++) {  // alto
                System.out.println("");
                for (j = 1; j <= zabalera; j++) {  // Ancho
                    if (i == 1 || i == altuera || j == 1 || j == zabalera) {  //si son la altura 1 y la altuera ultima y zabalera 1 y zabalera ultima
                        System.out.printf("%2c", pintzela);
                    } else {
                        System.out.printf("%2c", espacio);

                    }
                }

            }
            System.out.println("");

        }

    }

}
