
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
public class Menua {

    private static int LAUKI_KOP = 10;
    private static int sortutakoak=0;
    private static Laukia[] laukiak = new Laukia[LAUKI_KOP];

    public static void main(String args[]) {
        int n;

        Scanner in = new Scanner(System.in);

        System.out.println("LAUKIAK\n"
                + "====================================\n"
                + "1.- Lauki berria sortu\n"
                + "2.- Laukien taula ikusi\n"
                + "3.- Lauki bat marraztu\n"
                + "4.- Lauki handiena bilatu\n"
                + "5.- Lauki aleatorioak sortu\n"
                + "6.- Irten");

        System.out.print("\nAukeratu zenbaki bat ");

        n = in.nextInt();

        while (n != 6) {

            if (n == 1) {
                sortu();
            }
            if (n == 2) {
                imprimatu();
            }

            if (n == 3) {
                marraztu();
            }

            if (n == 4) {
                handiena();
            }
            if (n == 5) {
                arrayaBete();
            }
            System.out.print("\nAukeratu zenbaki bat ");
            n = in.nextInt();

        }
        System.out.println("Eskerrik asko programa hau erabiltzeagatik.");

    }

    public static void sortu() {
        Scanner in = new Scanner(System.in);
        int altuera = 0;
        int zabalera = 0;
        System.out.println("LAUKI BERRIA SORTZEN...");
        System.out.print("Sartu zabalera: ");
        zabalera = in.nextInt();
        System.out.print("Sartu altuera: ");
        altuera = in.nextInt();
        laukiak[sortutakoak] = new Laukia(zabalera, altuera);
        sortutakoak++;
        if (sortutakoak == 10) {
            System.out.println("Ezin dituzu lauki gehiago sortu.");

        }
    }

    public static void imprimatu() {

        System.out.println("Laukia   Zabalera Altuera Azalera Perimetroa  Mota\n"
                + "==============================================================\n");
        for (int i = 0; i < sortutakoak; i++) {

            System.out.println(i + 1 + "       " + laukiak[i].getZabalera() + "       " + laukiak[i].getAltuera() + "      " + laukiak[i].getAzalera() + "      " + laukiak[i].getPerimetroa() + "       " + laukiak[i].getMota());

        }
    }

    public static void marraztu() {
        int cual = 0;
        Scanner in = new Scanner(System.in);

        char beteta;
        System.out.print("Zenbatgarren laukia nahi duzu marraztu? ");
        cual = in.nextInt();
        System.out.print("Beteta ala hutsik (B/H)?  ");
        beteta = in.next().charAt(0);
        if (beteta == 'B') {
            laukiak[cual - 1].marraztuBeteta();
        }
        if (beteta == 'H') {
            laukiak[cual - 1].marraztuHutsik();

        }

    }

    public static void handiena() {
        System.out.println("Lauki handiena "+Laukia.getTheBiggest(laukiak).toString()+ "da eta azalera " +Laukia.getTheBiggest(laukiak).getAzalera()+"koa da");
    }

    public static void arrayaBete() {

        for (int i = 0; i < laukiak.length; i++) {
            laukiak[i] = new Laukia((int)(Math.random()*10+1), (int)(Math.random()*10+1));
            System.out.print(laukiak[i]+" ");
        }
        sortutakoak = 10;
    }
}
