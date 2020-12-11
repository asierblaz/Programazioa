package string;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author blazquez.asier
 */
public class CaesarCode {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        String palabra;
        int longitud;
        Scanner in = new Scanner(System.in);
        
   
        System.out.print("Enter a plaintext String: ");
        palabra= in.next().toUpperCase();
        longitud = palabra.length();
        int i;
        System.out.print("The ciphertext string is: ");
        for (i = 0; i < longitud; i++){

        if(palabra.charAt(i)=='A'){
            System.out.print((char) ('A' + 3));
        }
          if(palabra.charAt(i)=='B'){
            System.out.print((char) ('B' + 3));
        }
              if(palabra.charAt(i)=='C'){
            System.out.print((char) ('C' + 3));
        }
          if(palabra.charAt(i)=='D'){
            System.out.print((char) ('D' + 3));
        }
              if(palabra.charAt(i)=='E'){
            System.out.print((char) ('E' + 3));
        }
          if(palabra.charAt(i)=='F'){
            System.out.print((char) ('F' + 3));
        }
              if(palabra.charAt(i)=='G'){
            System.out.print((char) ('G' + 3));
        }
          if(palabra.charAt(i)=='H'){
            System.out.print((char) ('H' + 3));
        }
              if(palabra.charAt(i)=='I'){
            System.out.print((char) ('I' + 3));
        }
          if(palabra.charAt(i)=='J'){
            System.out.print((char) ('J' + 3));
        }
              if(palabra.charAt(i)=='K'){
            System.out.print((char) ('K' + 3));
        }
          if(palabra.charAt(i)=='L'){
            System.out.print((char) ('L' + 3));
        }
              if(palabra.charAt(i)=='M'){
            System.out.print((char) ('M' + 3));
        }
          if(palabra.charAt(i)=='N'){
            System.out.print((char) ('N' + 3));
        }
              if(palabra.charAt(i)=='O'){
            System.out.print((char) ('O' + 3));
        }
          if(palabra.charAt(i)=='P'){
            System.out.print((char) ('P' + 3));
        }
              if(palabra.charAt(i)=='Q'){
            System.out.print((char) ('Q' + 3));
        }
          if(palabra.charAt(i)=='R'){
            System.out.print((char) ('R' + 3));
        }
              if(palabra.charAt(i)=='S'){
            System.out.print((char) ('S' + 3));
        }
          if(palabra.charAt(i)=='T'){
            System.out.print((char) ('T' + 3));
        }
              if(palabra.charAt(i)=='U'){
            System.out.print((char) ('U' + 3));
        }
          if(palabra.charAt(i)=='V'){
            System.out.print((char) ('V' + 3));
        }
              if(palabra.charAt(i)=='W'){
            System.out.print((char) ('W' +3));
        }
          if(palabra.charAt(i)=='X'){
            System.out.print((char) ('X' -23));
        }
              if(palabra.charAt(i)=='Y'){
            System.out.print((char) ('Y' -23));
        }
          if(palabra.charAt(i)=='Z'){
            System.out.print((char) ('Z' -23));
        }
                }
        
        System.out.println("");
          
        }
    }
