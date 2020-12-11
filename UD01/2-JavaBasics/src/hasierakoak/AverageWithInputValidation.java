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
public class AverageWithInputValidation {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      // Declare variables
       int numberIn;
      boolean isValid;   // boolean flag to control the input validation loop
      int sum = 0;
      double average;
      final int NUM_STUDENTS = 3;
      
     
      Scanner in = new Scanner(System.in);
      
      // Use a do-while loop controlled by a boolean flag 
      // to repeatably read the input until a valid input is entered
       for (int studentNo = 1; studentNo <= NUM_STUDENTS; ++studentNo) {
         System.out.print("Enter the mark (0-100) for student" +studentNo+" : ");
         numberIn=in.nextInt();
           
        isValid = false;  
     do {
           if(numberIn>=0 && numberIn<=100){
             isValid=true;
           }else{
           isValid=false;
               System.out.println("Invalid input, try again...");
         System.out.print("Enter the mark (0-100) for student" +studentNo+" : ");
         numberIn=in.nextInt();
           break;
           }
      
         
         // Validate input by setting the boolean flag accordingly
         
      } while (!isValid);
             sum=sum+numberIn;

  }
           average= (double)sum/NUM_STUDENTS;
        System.out.println("The average is : "+ average);
        in.close();
        
    }
}

