/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author blazquez.asier
 */
public class Pertsona extends Bezeroa {

    private String izena;
    private String abizena;
    private String emaila;

    public Pertsona(String izena, String abizena, String emaila, int kodea, String helbidea) {
        super(kodea, helbidea);
        this.izena = izena;
        this.abizena = abizena;
        this.emaila = emaila;
    }




    @Override
    public String getIzena() {
        return izena;
    }


    @Override
    public String getEmaila() {

        return emaila;
    }

}
