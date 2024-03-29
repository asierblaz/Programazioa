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
public class Enpresa implements Bezeroa {

    private int kodea;
    private String izenJuridikoa;
    private String izenKomertziala;
    private String helbidea;
    private String[] kontaktoenEmailak;

    public Enpresa(int kodea, String izenJuridikoa, String izenKomertziala, String helbidea, String[] kontaktoenEmailak) {
        this.kodea = kodea;
        this.izenJuridikoa = izenJuridikoa;
        this.izenKomertziala = izenKomertziala;
        this.helbidea = helbidea;
        this.kontaktoenEmailak = kontaktoenEmailak;
    }

    
    @Override
    public int getKodea() {
        return kodea;
    }

    @Override
    public String getIzena() {
        return izenKomertziala;
    }

    @Override
    public String getHelbidea() {
        return helbidea;
    }

    @Override
    public String getEmaila() {
        return kontaktoenEmailak[0];
    }

}
