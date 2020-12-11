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
public class SumProductMinMax3 {

    /**
     * @param args the command line arguments
     */
    

 public static void main (String[] args) {
      // Declare variables
      int number1, number2, min, max, product, sum;
      Scanner in = new Scanner(System.in);  // Scan the keyboard for input
      Scanner n2 = new Scanner(System.in);  // Scan the keyboard for input
      

      // Put up prompting messages and read inputs as "int"
      System.out.print("Enter first integer: ");  // No newline for prompting message
      number1 = in.nextInt();                     // Read next input as "int"
            
      System.out.print("Enter Second integer: ");  

      number2= n2.nextInt();
      // Compute sum
      sum = number1+number2;
      
      //Multiplicación
      product=number1*number2;
      
      //max min
      
      if (number1>number2){
      max= number1;
      min= number2;
 }
      else {
          max= number2;
          min=number1;
      
      }
      System.out.println("The sum is: " + sum);
       System.out.println("The Product is: " + product);
        System.out.println("The min is: " + min);
         System.out.println("The max is: " + max);
      in.close();  // Close Scanner
      n2.close();
   }
}
