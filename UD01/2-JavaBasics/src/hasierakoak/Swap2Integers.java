package hasierakoak;


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
public class Swap2Integers {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
  
        int numero1 , numero2, aux;
        
        Scanner n1 = new Scanner(System.in); 
        Scanner n2 = new Scanner(System.in);
    
        System.out.print("Enter frist number: ");
        numero1 = n1.nextInt();
 System.out.print("Enter Second number: ");

        numero2 = n2.nextInt();
        aux= numero1;
        numero1= numero2;
        numero2= aux;
        System.out.println("After the swap, first integer is: "+numero1+", second integer is: " +numero2);
        
        n1.close();
        n2.close();
    
    }
}
