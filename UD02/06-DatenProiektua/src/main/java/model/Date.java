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
public class Date {

    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    public void setDate(int day, int month, int year){
        this.day=day;
        this.month= month;
        this.year= year;
    }

    @Override
    public String toString() {
      return  String.format("%4d/%02d/%02d",year,month,day);
        //return "Date{" + "day=" + day + ", month=" + month + ", year=" + year + '}';
    }

    public String getHilabeteaLetretan() {
        String[] hilabeteak = {"Urtarrila", "Otsaila", "Martxoa", "Apirila", "Maiatza", "Ekaina", "Uztaila", "Abuztua", "Iraila", "Urria", "Azaroa", "Abendua"};

        return hilabeteak[month - 1];
    }

    public String getHilabeteaLetretan(String hizkuntza) {
        hizkuntza = hizkuntza.toUpperCase();
        String[][] hilabeteak = {{"Urtarrila", "Otsaila", "Martxoa", "Apirila", "Maiatza", "Ekaina", "Uztaila", "Abuztua", "Iraila", "Urria", "Azaroa", "Abendua"},
        {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"},
        {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}};

        String hilabetea = "";
        if (hizkuntza.equals("EU")) {

            hilabetea = hilabeteak[0][month - 1];
        }
        if (hizkuntza.equals("ES")) {

            hilabetea = hilabeteak[1][month - 1];
        }
        if (hizkuntza.equals("EN")) {

            hilabetea = hilabeteak[2][month - 1];
        }

        return hilabetea;

    }
}
