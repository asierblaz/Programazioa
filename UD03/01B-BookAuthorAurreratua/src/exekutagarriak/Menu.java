/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;

import java.util.ArrayList;
import java.util.Scanner;
import model.Author;
import model.Book;

/**
 *
 * @author blazquez.asier
 */
public class Menu {

    private static ArrayList<Book> liburuak = new ArrayList<Book>();

    public static void main(String[] args) {

        int n;

        Scanner in = new Scanner(System.in);

        System.out.println("LIBURUAK\n"
                + "====================================\n"
                + "1.- Liburu berria sortu\n"
                + "2.- Liburu bat ezabatu\n"
                + "3.- Liburu bat editatu\n"
                + "4.- Liburu bat ikusi\n"
                + "5.- Liburu guztiak ikusi\n"
                + "6.- Irten");

        System.out.print("\nAukeratu zenbaki bat ");

        n = in.nextInt();

        while (n != 5) {

            if (n == 1) {
                create();
            }
            if (n == 2) {
                remove();
            }

            if (n == 3) {

            }

            if (n == 4) {

            }
            
             System.out.println("LIBURUAK\n"
                + "====================================\n"
                + "1.- Liburu berria sortu\n"
                + "2.- Liburu bat ezabatu\n"
                + "3.- Liburu bat editatu\n"
                + "4.- Liburu bat ikusi\n"
                + "5.- Irten");

            System.out.print("\nAukeratu zenbaki bat ");
            n = in.nextInt();

        }
        System.out.println("Eskerrik asko programa hau erabiltzeagatik.");

    }

    public static void create() {
        System.out.println("---------------Librua Sortu------------\n");
        System.out.print("Sartu liburuaren izena: ");
        Scanner in = new Scanner(System.in);
        String izena = in.next();
        System.out.print("Sartu liburuaren prezioa: ");
        double prize = in.nextDouble();
        System.out.print("Sartu liburuen kantitatea: ");
        int qty = in.nextInt();
        System.out.print("Zenbat autore ditu liburuak?(1 gutxienez): ");
        int n = in.nextInt();

        Author[] autoreak = new Author[n];

        for (int i = 0; i < autoreak.length; i++) {
            System.out.print("Sartu " + (i + 1 )+ "autorearen izena: ");
            String name = in.next();
            System.out.print("Sartu autorearen abizena: ");
            String abizena = in.next();
            System.out.print("Sartu autorearen generoa (m edo f): ");
            char generoa = in.next().charAt(0);
            autoreak[i] = new Author(name, abizena, generoa);

        }

        liburuak.add(new Book(izena, autoreak, prize, qty));

        System.out.println(liburuak);
        System.out.println("");

    }

    public static void remove() {
        System.out.println("---------------Librua Ezabatu------------\n");
        System.out.println("Zein liburu ezabatu nahi duzu?: ");
        int i = 1;
        for (Book b : liburuak) {

            System.out.println(i + ". " + b.getName());

        }

        Scanner in = new Scanner(System.in);
        liburuak.remove(in.nextInt()-1);
        System.out.println("Liburua ezabatu da\n");

    }

    public static void update() {
        System.out.println("---------------Librua Editatu------------\n");
        System.out.println("Zein liburu editatu nahi duzu?: ");
        Scanner in = new Scanner(System.in);
        int i=0;
            for (Book b : liburuak) {

            System.out.println(i + ". " + b.getName());
        }
    }
}
