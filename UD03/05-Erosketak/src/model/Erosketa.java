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
public class Erosketa {

    protected char[] kodea;
    protected LocalDate data;
    protected Bezeroa bezeroa;
    protected ArrayList<Produktua> produktuak = new ArrayList<>();
    protected ArrayList<Integer> unitateak = new ArrayList<>();
    protected double guztira;

    public Erosketa(String kodea, Bezeroa bezeroa, double guztira) {
        this.kodea = kodea.toCharArray();
        this.bezeroa = bezeroa;
        this.guztira = guztira;
        this.data= LocalDate.now();
    }

    public Erosketa(String kodea, String data, Bezeroa eroslea, ArrayList<Produktua> produktuak, ArrayList<Integer> unitateak, double guztira) {

        this.kodea = kodea.toCharArray();
        this.data = LocalDate.parse(data);
        this.bezeroa = eroslea;
        this.produktuak = produktuak;
        this.unitateak = unitateak;
        this.guztira = guztira;

    }

    @Override
    public String toString() {
        return "Erosketa{" + "kodea=" + kodea + ", data=" + data + ", bezeroa=" + bezeroa + ", produktuak=" + produktuak + ", unitateak=" + unitateak + ", guztira=" + guztira + '}';
    }
  
    public String toStringLuzea() {
        return "Erosketa{" + "kodea=" + kodea + ", data=" + data + ", bezeroa=" + bezeroa + ", produktuak=" + produktuak + ", unitateak=" + unitateak + ", guztira=" + guztira + '}';
    }

    public boolean guztiraEgiaztatu(){ //
    
    return true;
    }
}
