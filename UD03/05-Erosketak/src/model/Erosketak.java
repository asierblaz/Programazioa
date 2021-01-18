/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author blazquez.asier
 */
public class Erosketak {

    protected char[] kodea;
    protected LocalDate data;
    protected Bezeroa bezeroa;
    protected ArrayList<Produktua> produktuak = new ArrayList<>();
    protected ArrayList<Integer> unitateak = new ArrayList<>();
    protected double guztira;

    public Erosketak(String kodea, Bezeroa eroslea, double guztira) {
      //  this.kodea = kodea.charAt[0];
        this.bezeroa = eroslea;
        this.guztira = guztira;
    }

    public Erosketak(char[] kodea, String data, Bezeroa eroslea, ArrayList<Produktua> produktuak, ArrayList<Integer> unitateak, double guztira) {

       // this.kodea = kodea;
        this.data = LocalDate.parse(data);
        this.bezeroa = eroslea;
        this.produktuak = produktuak;
        this.unitateak = unitateak;
        this.guztira = guztira;

    }

}
