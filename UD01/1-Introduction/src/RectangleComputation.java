/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author blazquez.asier
 */
public class RectangleComputation {

 public static void main(String[] args) {
     
      double area= 0.0;
      double perimeter= 0.0;
      
      double width=4;
      double length= 6;
      
      perimeter= (2*width)+ (2*length);
      area= width*length;
      
     
            
      System.out.print("The perimeter is ");  // Print description
     System.out.println(perimeter);          
      System.out.print("The area is ");
      System.out.println(area);

}
}