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
public class TimeTable {

    /**
     * @param args the command line arguments
     */
   public static void main(String args[]) {
              int size;
              int num=1;
              int col,row;
              int res;
                      
                      
       Scanner in = new Scanner(System.in);
       System.out.print("Enter the size: ");
       size = in.nextInt();
      System.out.println("");

       System.out.printf("%2s %s", "*", "|");        
     for (num = 1; num <= size; num++) {
			System.out.print("   "+num);
     }
     System.out.println();
    for (num = 1; num <= size; num++) {
    System.out.print("----");
                        
    }
       System.out.println("");
       
       
       for (col = 1; col <= size; col++) {
        System.out.printf("%n%2d%2s", col, "|");

        for (row = 1; row <= size; row++) {
          res=col*row;
	System.out.printf("%4d",res );
                        }}
       
       System.out.println("");

    }}

