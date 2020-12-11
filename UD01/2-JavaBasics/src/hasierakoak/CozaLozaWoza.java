package hasierakoak;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


 // @author blazquez.asier
public class CozaLozaWoza {   // Save as "CozaLozaWoza.java"
   public static void main(String[] args) {
      int lowerbound = 1, upperbound = 110;
      boolean printed;
      for (int number = lowerbound; number <= upperbound; ++number) {
         printed = false;  // init before processing each number
//         // Print "Coza" if number is divisible by 3
         if ((number % 3==0) && printed==false) {
           System.out.print("Coza");
            printed = true;   // processed!
         }
//         // Print "Loza" if number is divisible by 5
              if ((number % 5==0) && printed==false) {
           System.out.print("Loza");
            printed = true;   // processed!
         }
//         // Print "Woza" if number is divisible by 7
            if ((number % 7==0) && printed==false) {
           System.out.print("Woza");
            printed = true;   // processed!
         }
         // Print the number if it has not been processed
         if (!printed) {
            
             System.out.print(number);
         }
//         // After processing the number, print a newline if it is divisible by 11;
             if ((number % 11==0) && printed==false) {
           System.out.println("");
            printed = true;   // processed!
         } else {
                 System.out.print(" ");}
//         // else, print a space
//         ......
      }
      }
   }
