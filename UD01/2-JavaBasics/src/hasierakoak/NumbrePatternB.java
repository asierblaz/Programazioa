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
public class NumbrePatternB {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
        Scanner input = new Scanner(System.in);
		
		int size = input.nextInt();
		int number = 0;
		
		for (int row = 1; row <= size; row++) {
			for (int col = 1; col <= size; col++) {
				
				if (row <= col) {
				System.out.print("  "+ col);
				}
			}
			System.out.println();
		}

    }
}



