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
public class CountVowelsDigits {

    /**
     * @param args the command line arguments
     */
 public static void main(String args[]) {
            // Define variables
      String palabra, imprime;      // input String
      int inStrLen;  
      char a= 'a';
      char e= 'a';
      char i= 'a';
      char o= 'a';
      char u= 'a';
      int vowels=0;
      int digits=0;
      double pVowels=0;
      double pDigits=0;
      
        Scanner in = new Scanner(System.in);
        
        
      // Prompt and read input as "String"
      System.out.print("Enter a String: ");
      palabra = in.next().toLowerCase();   // use next() to read a String
      inStrLen = palabra.length();

    for (int charIdx = inStrLen - 1; charIdx >= 0; --charIdx) {  
     // for (int charIdx = 1; charIdx <=inStrLen; charIdx++) {  
         
           if(palabra.charAt(vowels)=='a'||palabra.charAt(charIdx)== 'e'||palabra.charAt(charIdx)=='i'||palabra.charAt(charIdx)== 'o'
                   ||palabra.charAt(charIdx)=='u'){
               vowels= vowels+1;
           }
          if(Character.isDigit(palabra.charAt(charIdx))){
              digits++;
          }
           
      }

pVowels = (((double)vowels / (double)inStrLen) * 100); 
pDigits = (((double)digits / (double)inStrLen) * 100);     


System.out.println("Number of vowels: "+vowels+" "+pVowels+"%");
      System.out.println("Number of digits: "+digits+" "+pDigits+"%");
      
      System.out.println("");
        in.close();
 
    }
}
