/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author blazquez.asier
 */
public class Laukia {

    private int altuera;
    private int zabalera;

    public Laukia() {

        altuera = 5;
        zabalera = 5;

    }

    public Laukia(int z, int a) {
//        this.zabalera = zabalera;
//        this.altuera = altuera;
        zabalera = z;
        altuera = a;

    }

    public int getAltuera() {
        return altuera;
    }

    public int getZabalera() {
        return zabalera;
    }

    public int getAzalera() {
        return altuera * zabalera;
    }

    public int getPerimetroa() {
        return 2 * altuera + 2 * zabalera;
    }

    public void setAltuera(int altueraBerria) {
        altuera = altueraBerria;
    }

    public void setZabalera(int zabaleraBerria) {
        zabalera = zabaleraBerria;
    }

    public String toString() {
        return "Laukia[" + zabalera + "x" + altuera + "]";
    }

    public String getMota() {
        String mota = null;
        if (altuera > zabalera) {
            mota = "Bertikala";

        }
        if (altuera < zabalera) {
            mota = "Horizontala";
        }

        if (altuera == zabalera) {
            mota = "Karratua";
        }
        return mota;
    }

    public void marraztuBeteta() {

        char pintzela = '*';

        for (int i = 1; i <= altuera; i++) {  // alto
            System.out.println("");
            for (int j = 1; j <= zabalera; j++) {  // Ancho
                System.out.printf("%2c", pintzela);

            }
        }
        System.out.println("");
    }

    public void marraztuHutsik() {
        char pintzela = '*';
        char espacio = ' ';
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

    public boolean isBiggerThan(Laukia l) {
        if (l.getAzalera() > this.getAzalera()) {
            return true;
        } else {
            return false;
        }

    }

    public static Laukia getTheBiggest(Laukia[] lk) {
        int cont = 0;
        int max = 0;
        for (int i = 0; i < lk.length; i++) {
            if (max <= lk[i].getAzalera()) {
                max = lk[i].getAzalera();
                cont = i;

            }

        }
        return lk[cont];
    }
    public static void ordenatu(Laukia[] array) {

        Laukia aux = new Laukia();
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < (array.length - i); j++) {

                if (array[j - 1].isBiggerThan(array[j])) {
                    aux = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = aux;
                }

            }

        }

    }
}
