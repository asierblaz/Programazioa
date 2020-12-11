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
public class TriangularPatternC {

    public static void main(String args[]) {

        int size;
              Scanner in = new Scanner(System.in);
              System.out.print("Enter the size: ");
              size = in.nextInt();
            
 {     
      	for (int col = 1; col <= size; col++)  {
	for (int row = 1; row <= size; row++) {

				if (row >= col)

					System.out.print("  #");
                                else System.out.print("   ");

		}
		System.out.println();
		}
     }
    }
    }


