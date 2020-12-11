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
public class TestPalindromicWord {

    /**
     * @param args the command line arguments
     */
   
    
      public static void main(String args[]) {
        String palabra;
        int longitud;
        Scanner in = new Scanner(System.in);
        boolean coincide = true;
        System.out.print("Introduce una palabra para ver si es palindromo: ");
        palabra= in.next().toLowerCase();
        longitud = palabra.length();
        int i=0;
       int irevers= longitud-1;
    
       while (i<irevers && coincide){
       if (palabra.charAt(i)== palabra.charAt(irevers)){
       
       i++;
       irevers--;
       } else     coincide = false;
       
       }
        
       if (coincide)
           
           System.out.println(palabra +" es palindromo");
       else 
              System.out.println(palabra+" no es Palindromo");
}
}