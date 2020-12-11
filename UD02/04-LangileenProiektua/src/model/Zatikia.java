package model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author blazquez.asier
 */
public class Zatikia {

    /**
     * @param args the command line arguments
     */
    private int zenbakitzailea; //arriba
    private int izendatzailea; //abajo

    public Zatikia(int zenbakitzailea, int izendatzailea) {
        this.zenbakitzailea = zenbakitzailea;
        this.izendatzailea = izendatzailea;
    }

    public Zatikia() {
    }

    public int getZenbakitzailea() {
        return zenbakitzailea;
    }

    public void setZenbakitzailea(int zenbakitzailea) {
        this.zenbakitzailea = zenbakitzailea;
    }

    public int getIzendatzailea() {
        return izendatzailea;
    }

    public void setIzendatzailea(int izendatzailea) {
        this.izendatzailea = izendatzailea;
    }

    @Override
    public String toString() {
        return "(" + zenbakitzailea + "/" + izendatzailea + ')';

    }

    public static Zatikia biderkatu(Zatikia zat1, Zatikia zat2) {
        return new Zatikia(zat1.zenbakitzailea * zat2.zenbakitzailea, zat1.izendatzailea * zat2.izendatzailea);

    }

    public static Zatikia batu(Zatikia zat1, Zatikia zat2) {
        Zatikia zat = new Zatikia();
        zat.zenbakitzailea = zat1.zenbakitzailea * zat2.izendatzailea + zat2.zenbakitzailea * zat1.izendatzailea;
        zat.izendatzailea = zat1.izendatzailea * zat2.izendatzailea;
        return zat;
    }

    public void batu(Zatikia besteZatBat) {
        int auxZenbakitzaile = zenbakitzailea;
        int auxIzendatzaile = izendatzailea;

        zenbakitzailea = auxZenbakitzaile * besteZatBat.izendatzailea + besteZatBat.zenbakitzailea * auxIzendatzaile;
        System.out.println(zenbakitzailea);
        izendatzailea = auxIzendatzaile * besteZatBat.izendatzailea;
        System.out.println(izendatzailea);

    }

    public double hamartarBaliokidea() {

        return (double) zenbakitzailea / izendatzailea;
    }

    public boolean isBiggerThan(Zatikia besteZatikiBat) {
        double zatikiHau = (double) zenbakitzailea / izendatzailea;
        double besteZatiki = (double) besteZatikiBat.getZenbakitzailea() / besteZatikiBat.getIzendatzailea();
        return zatikiHau > besteZatiki;

    }

    public void sinplifikatu() {
        int i = 2;

        while (i <= (izendatzailea | zenbakitzailea)) {
            if (izendatzailea % i == 0 && zenbakitzailea % i == 0) {
                izendatzailea = izendatzailea /i;
                zenbakitzailea=zenbakitzailea/i;
                
            } else{
            i++;
            }

        }
    }


    public Zatikia(String zatIdatzita) {
        zenbakitzailea = Integer.parseInt("" + zatIdatzita.charAt(0));
        izendatzailea = Integer.parseInt("" + zatIdatzita.charAt(2));

    }

    public void zatikiakOrdenatu(Zatikia[] array) {

        Zatikia aux = new Zatikia();
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

    public boolean isBaliokidea(Zatikia besteZatikiBat) {

        return this.hamartarBaliokidea() == besteZatikiBat.hamartarBaliokidea();
    }

    public static void zatikiakRandom(Zatikia[] zat) {

        for (int i = 0; i < zat.length; i++) {
            zat[i] = new Zatikia((int) (Math.random() * 9 + 1), (int) (Math.random() * 9 + 1));
            System.out.print(zat[i] + " ");
        }

    }
}
