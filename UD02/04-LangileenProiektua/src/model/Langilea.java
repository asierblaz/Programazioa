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
public class Langilea {

    private int id;
    private String izena;
    private String abizena;
    private double soldata;
    private Zatikia lanaldia;

    public Langilea(int id, String izena, String abizena, double soldata) {
        this.id = id;
        this.izena = izena;
        this.abizena = abizena;
        this.soldata = soldata;
        lanaldia = new Zatikia(1, 1);

    }

    public Langilea() {
       
    }

    public int getId() {
        return id;
    }

    public String getIzena() {
        return izena;
    }

    public String getAbizena() {
        return abizena;
    }

    public double getSoldata() {
        return soldata;
    }

    public String getIzenOsoa() {
        return izena + " " + abizena;
    }

    public double getUrtekoSoldata() {
        return soldata * 12;
    }

    public void setSoldata(double soldata) {
        this.soldata = soldata;
    }

    @Override
    public String toString() {
        String lan = "\nID: " + id
                + "\nIZENA: " + izena
                + "\nABIZENA: " + abizena
                + "\nSOLDATA: " + soldata 
                + "\nLANALDIA: "+ lanaldia+
                
                "\n";
        return lan;
    }

    public double soldataIgo(int portzentaia) {

        soldata = soldata * (portzentaia + 100) / 100;
        return soldata;
    }

    public static Langilea[] nireHamarLagunLangile() {

        Langilea[] hamarLangile = {new Langilea(1, "Pablo", "Perez", 580), new Langilea(2, "Jon", "Lopez", 890), new Langilea(3, "Nerea", "Agirre", 1500), new Langilea(4, "Nora", "Osua", 3580), new Langilea(5, "Raul", "Parra", 120), new Langilea(6, "Hodei", "Monasterio", 900), new Langilea(7, "Abderrafia", "Hayar", 690), new Langilea(8, "Julen", "Mochales", 879), new Langilea(9, "Leo", "Messi", 555580), new Langilea(10, "Cristiano", "Ronaldo", 9000)};

        return hamarLangile;
    }

    public static Langilea bilatu(String izena, Langilea[] langileakArray) {

        boolean encontrado = false;
        int i = 0;
        int cont =0;
        while (!encontrado && i < langileakArray.length) {
            if (langileakArray[i].getIzena().equals(izena)) {
                encontrado = true;
                cont =i;
            }
            i++;

        }
        if (encontrado == true) {
            return langileakArray[cont];
        } else {
            return null;
        }
    }

    public static Langilea bilatu(String aurkitu, String eremua, Langilea[] langileakArray) {
        eremua = eremua.toUpperCase();
        String dato;
        boolean encontrado = false;
        int i = 0;
        int cont =0;
        while (!encontrado && i < langileakArray.length) {

            if (eremua.equals("ID")) {

                if (langileakArray[i].getId() == Integer.parseInt(aurkitu)) {
                    encontrado = true;
                    cont=i;
                }
            }

            if (eremua.equals("IZENA")) {
                if (langileakArray[i].getIzena().equals(aurkitu)) {
                    encontrado = true;
                    cont=i;
                }
            }

            if (eremua.equals("ABIZENA")) {
                if (langileakArray[i].getAbizena().equals(aurkitu)) {
                    encontrado = true;
                    cont=i;
                }
            }
            if (eremua.equals("SOLDATA")) {
                if (langileakArray[i].getSoldata() == Double.parseDouble(aurkitu)) {
                    encontrado = true;
                    cont=i;
                }
            }

            i++;

        }

        if (encontrado == true) {
            return langileakArray[cont];
        } else {
            return null;
        }

    }

    public Zatikia getLanaldia() {
        return lanaldia;
    }

    public void setLanaldia(Zatikia lanaldia) {
        if (lanaldia.hamartarBaliokidea()<1 && lanaldia.hamartarBaliokidea()>0) {
            this.lanaldia = lanaldia;
        }
            }

}
