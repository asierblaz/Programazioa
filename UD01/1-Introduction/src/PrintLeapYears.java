/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author blazquez.asier
 */
public class PrintLeapYears {

     
    public static void main(String[] args) {
      int lowerbound = 999;      
      int upperbound = 2010;   
      int cont = 0;   
      
      int number = lowerbound;
      while (number <= upperbound) {

        //  if ((number % 4==0)&&(number % 100!=0)||(number % 400==0)){
        if ((number % 4 == 0 && number % 100 != 0) || (number % 100 == 0 && number % 400 == 0)) {
        cont= cont+1;
          System.out.println(number);
          
          }
            
         ++number;            // increment number
      }
                System.out.println("There are "+ cont+ " lap years since "+lowerbound+ " and "+ upperbound);

   }}
