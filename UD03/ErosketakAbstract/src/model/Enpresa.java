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
public class Enpresa extends Bezeroa {

    private String izenJuridikoa;
    private String izenKomertziala;
    private String[] kontaktoenEmailak;

    public Enpresa( String izenJuridikoa, String izenKomertziala, String[] kontaktoenEmailak, int kodea, String helbidea) {
        super(kodea, helbidea);
        this.izenJuridikoa = izenJuridikoa;
        this.izenKomertziala = izenKomertziala;
        this.kontaktoenEmailak = kontaktoenEmailak;
    }


    @Override
    public String getIzena() {
        return izenKomertziala;
    }


    @Override
    public String getEmaila() {
        return kontaktoenEmailak[0];
    }

}
