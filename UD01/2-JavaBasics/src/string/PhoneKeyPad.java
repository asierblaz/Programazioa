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
public class PhoneKeyPad {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        String palabra;
        int longitud;
        Scanner in = new Scanner(System.in);
        
        
        System.out.print("Enter a String: ");
        palabra= in.next().toLowerCase();
        longitud = palabra.length();
        int i;
        System.out.print("the result is: ");
        for (i = 0; i < longitud; i++){
            
            
        if (palabra.charAt(i)=='a'||palabra.charAt(i)=='b'||palabra.charAt(i)=='c' ){
            System.out.print(2);        
        }
          if (palabra.charAt(i)=='d'||palabra.charAt(i)=='e'||palabra.charAt(i)=='f' ){
            System.out.print(3);        
        }
               if (palabra.charAt(i)=='g'||palabra.charAt(i)=='h'||palabra.charAt(i)=='i' ){
            System.out.print(4);        
        }
          if (palabra.charAt(i)=='j'||palabra.charAt(i)=='k'||palabra.charAt(i)=='l' ){
            System.out.print(5);        
        }
         if (palabra.charAt(i)=='m'||palabra.charAt(i)=='n'||palabra.charAt(i)=='o' ){
            System.out.print(6);        
        }
            if (palabra.charAt(i)=='p'||palabra.charAt(i)=='q'||palabra.charAt(i)=='r'||palabra.charAt(i)=='s' ){
            System.out.print(7);        
        }
        if (palabra.charAt(i)=='t'||palabra.charAt(i)=='u'||palabra.charAt(i)=='v' ){
            System.out.print(8);        
        }
            if (palabra.charAt(i)=='w'||palabra.charAt(i)=='x'||palabra.charAt(i)=='y'||palabra.charAt(i)=='z' ){
            System.out.print(7);        
        }  
        }

        System.out.println(""); System.out.println("");
//USING NESTED IF
System.out.print("Using nested if: ");
 for (i = 0; i < longitud; i++){
 switch (palabra.charAt(i)) {
     case 'a': case 'b': case 'c':  
      System.out.print(2); break;
     case 'd': case 'e': case 'f':
    System.out.print(3); break;
     case 'g': case 'h': case 'i':
     System.out.print(4); break;
    case 'j': case 'k': case 'l':
     System.out.print(5); break;
    case 'm': case 'n': case 'o':
        System.out.print(6); break;
    case 'p': case 'q': case 'r':case 's':
    System.out.print(7); break;
    case 't': case 'u':case 'v':
     System.out.print(8); break;
     case 'w': case 'x': case 'y': case 'z':
    System.out.print(9); break;
      default:
}
 } System.out.println("");

    }
}
