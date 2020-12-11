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
public class Equals {

    /**
     * @param args the command line arguments
     */
public static void main(String args[]) {
                     int numItems;
                     int numItems2;
                     int[] items2; 
		      int[] items;  // Declare array name, to be allocated after numItems is known
		      Scanner in = new Scanner(System.in);

		      System.out.print("Numero de elementos del primer array:");
		      numItems = in.nextInt();


		      // Allocate the array
		      items = new int[numItems];

		      // Prompt and read the items into the "int" array, if array length > 0
		      System.out.print("Enter the value of all items (separated by space): ");
                   for (int i = 0; i < numItems; i++) {
			items[i] = in.nextInt();
		}
                 System.out.print("Numero de elementos del segundo array:");
		      numItems2 = in.nextInt();
                      
                      
		      // Allocate the array
		      items2 = new int[numItems2];

		      // Prompt and read the items into the "int" array, if array length > 0
		      System.out.print("Enter the value of all items (separated by space): ");
                   for (int i = 0; i < numItems2; i++) {
			items2[i] = in.nextInt();
		}
                   
                   if(equals(items, items2)== true){
                       System.out.println("Los arrays son iguales");
                   }else {
                       System.out.println("Los arrays no son iguales");
                   }
    }
    
    public static boolean equals(int[] array1, int[] array2){
        
        boolean esta = true;
          int i=0;
        if (array1.length==array2.length){
      
         while(esta == true && i<array1.length){ // SI LA LONGITUD ES IGUAL
            if(array1[i]==array2[i]){
              i++;
              esta = true;
             }
            else {
                 esta=false;    // SI SON DISTINTOS SALE DEL BUCLE
                 }
         }
            
          if(esta==false ){
                return false;       //SI ESTA ES IGUAL A FALSE FALSE
            } 
            else{
                return true;
         }
        
        
      }else{ // si la longitud es diferente
            return false;
        }
    }
}
