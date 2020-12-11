/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodoak;

import java.util.Scanner;

/**
 *
 * @author blazquez.asier
 */
public class HasEight {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        final int SENTINEL = -1;  // Terminating input
        int number;
        int magicsum = 0;
        Scanner in = new Scanner(System.in);

// Read first input to "seed" the while loop
        System.out.print("Enter a positive integer (or -1 to end): ");
        number = in.nextInt();

        while (number != SENTINEL) {  // Repeat until input is -1

            if (hasEight(number)) {
                magicsum = magicsum + number;
            }

            System.out.print("Enter a positive integer (or -1 to end): ");
            number = in.nextInt();
        }
        System.out.println("The magic sum is: " + magicsum);
    }

    public static boolean hasEight(int number) {
        boolean encontrado = false;
        while (number > 0 && encontrado == false) {
            if (number == 8) {

                encontrado = true;
            }

            if (number % 10 == 8) {
                encontrado = true;
            } else {
                encontrado = false;
            }
            number = number / 10;
        }
        return encontrado;
    }

    public static boolean hasEight2(int number) {
        String s = Integer.toString(number);
        boolean encontrado = false;
     
        int i = 0;
        while (i < s.length() && encontrado == false) {
            if (s.charAt(i) == '8') {
                encontrado = true;
            } else {
                encontrado = false;
            }
            i++;
        }
        return encontrado;
    }

}
