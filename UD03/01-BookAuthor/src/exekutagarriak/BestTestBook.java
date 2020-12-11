/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;

import java.util.ArrayList;
import java.util.Arrays;
import model.*;

/**
 *
 * @author blazquez.asier
 */
public class BestTestBook {

    public static void main(String[] args) {

        Author a1 = new Author("Santiago Posteguillo", "sposteguillo@gmail.com", 'm');
        System.out.println(a1);
        Book b1 = new Book("Las Legiones Malditas", a1, 18.5, 7);
        Book b2 = new Book("Las Crónicas de Narnia", new Author("lewis", "lw@gmail.com", 'm'), 7.3, 60);
        System.out.println(b1);
        Author rowling = new Author("Joanne Rowling", "Joannerowling@gmail.com", 'f');
        Book[] nireLiburuGogokoenak = {b1, new Book("Harry Potter y la piedra filosofal", rowling, 20.95, 100095), new Book("Harry Potter y la cámara secreta", rowling, 14.95, 284545)};
        System.out.println("Nire liburu gogoenak");
        System.out.println(Arrays.toString(nireLiburuGogokoenak));

        nireLiburuGogokoenak[2].getAuthor().setEmail("emailaldatuta@gmail.com");

        System.out.println(Arrays.toString(nireLiburuGogokoenak));

        ArrayList<Book> liburuak = new ArrayList<Book>();
        for (int i = 0; i < nireLiburuGogokoenak.length; i++) {
            liburuak.add(nireLiburuGogokoenak[i]);
        }

        System.out.println(liburuak);

        liburuak.add(b1);
        liburuak.add(b2);
        System.out.println(liburuak);

    }
}
