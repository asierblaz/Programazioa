/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;

import model.Date;

/**
 *
 * @author blazg
 */
public class TestDate {

    public static void main(String[] args) {
        // Test constructor and toString()
        Date d1 = new Date(2020, 12, 4);
        System.out.println(d1);  // toString()

        // Test Setters and Getters
        d1.setYear(2020);
        d1.setMonth(12);
        d1.setDay(23);
        System.out.println(d1);  // run toString() to inspect the modified instance
        System.out.println("Year is: " + d1.getYear());
        System.out.println("Month is: " + d1.getMonth());
        System.out.println("Day is: " + d1.getDay());

         //Test setDate()
        d1.setDate(2988, 1, 2);
        System.out.println(d1);  // toString()

        System.out.println("********************************");
        //Test getHilabeteaLetretan
        System.out.println(d1.getHilabeteaLetretan());
        System.out.println(d1.getHilabeteaLetretan("EN"));
    }
}