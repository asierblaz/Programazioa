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
public class DecipherCaesarCode {

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

        if(palabra.charAt(i)==(char) ('A' + 3)){
            System.out.print('A');
        }
          if(palabra.charAt(i)==(char) ('B' + 3)){
            System.out.print('B');
        }
              if(palabra.charAt(i)==(char) ('C' + 3)){
            System.out.print('C');
        }
          if(palabra.charAt(i)==(char) ('D' + 3)){
            System.out.print('D');
        }
              if(palabra.charAt(i)==(char) ('E' + 3)){
            System.out.print('E');
        }
          if(palabra.charAt(i)==(char) ('F' + 3)){
            System.out.print('F');
        }
              if(palabra.charAt(i)==(char) ('G' + 3)){
            System.out.print('G');
        }
          if(palabra.charAt(i)==(char) ('H' + 3)){
            System.out.print('H');
        }
              if(palabra.charAt(i)==(char) ('I' + 3)){
            System.out.print('I');
        }
          if(palabra.charAt(i)==(char) ('J' + 3)){
            System.out.print('J');
        }
              if(palabra.charAt(i)==(char) ('K' + 3)){
            System.out.print('K');
        }
          if(palabra.charAt(i)==(char) ('L' + 3)){
            System.out.print('L');
        }
              if(palabra.charAt(i)==(char) ('M' + 3)){
            System.out.print('M');
        }
          if(palabra.charAt(i)==(char) ('N' + 3)){
            System.out.print('N');
        }
              if(palabra.charAt(i)==(char) ('O' + 3)){
            System.out.print('O');
        }
          if(palabra.charAt(i)==(char) ('P' + 3)){
            System.out.print('P');
        }
              if(palabra.charAt(i)==(char) ('Q' + 3)){
            System.out.print('Q');
        }
          if(palabra.charAt(i)==(char) ('R' + 3)){
            System.out.print('R');
        }
              if(palabra.charAt(i)==(char) ('S' + 3)){
            System.out.print('S');
        }
          if(palabra.charAt(i)==(char) ('T' + 3)){
            System.out.print('T');
        }
              if(palabra.charAt(i)==(char) ('U' + 3)){
            System.out.print('U');
        }
          if(palabra.charAt(i)==(char) ('V' + 3)){
            System.out.print('V');
        }
              if(palabra.charAt(i)==(char) ('W' +3)){
            System.out.print('W');
        }
          if(palabra.charAt(i)==(char) ('X' -23)){
            System.out.print('X');
        }
              if(palabra.charAt(i)==(char) ('Y' -23)){
            System.out.print('Y');
        }
          if(palabra.charAt(i)==(char) ('Z' -23)){
            System.out.print('Z');
        }
                }
        
        System.out.println("");
          
        }
    }
