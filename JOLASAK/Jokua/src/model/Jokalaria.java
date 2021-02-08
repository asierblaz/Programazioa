/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author blazg
 */
public class Jokalaria {
    private String username;
    private int puntuazioa;
    private String asmatutakoak;

    public Jokalaria(String username, int puntuazioa, String asmatutakoak) {
        this.username = username;
        this.puntuazioa = puntuazioa;
        this.asmatutakoak = asmatutakoak;
    }

    public String getUsername() {
        return username;
    }



    public int getPuntuazioa() {
        return puntuazioa;
    }



    public String getAsmatutakoak() {
        return asmatutakoak;
    }




}


