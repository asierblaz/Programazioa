/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author blazquez.asier
 */
public class ThreeFiveSevenSum {
    
public static void main(String[] args) {
      int lowerbound = 1, upperbound = 1000;  // lowerbound and upperbound
      int sum  = 0;    
      int number = lowerbound;
      while (number <= upperbound) {
         if (((number % 3 == 0)||(number % 5 ==0)||(number % 7 ==0))&&((number % 15 !=0)||(number % 21 !=0)||(number % 35 !=0)||(number % 105 !=0))){  // Even
            sum += number;   // Same as sumEven = sumEven + number
         } 
         ++number;  // Next number
      } 
      // Print the result
      System.out.println("The sum all the running integers from  " + lowerbound + " to " + upperbound +" that are divisible by 3, 5 or 7, but NOT by 15, 21, 35 or 105"+ " is " + sum);
   }
}

