/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author blazquez.asier
 */
public class CylinderComputation {

 public static void main(String[] args) {

      double radius= 1, height= 2, surfaceArea = 0, baseArea = 0, volume = 0;
      final double PI = 3.14159265;
      baseArea = radius * radius * PI;
      surfaceArea=(2*PI* radius*height)+ (2*PI*radius*radius);
      volume= PI*radius*radius*height;

      
      // Print results
      System.out.print("The Surface Area is ");// 2π r h + 2π r²
     System.out.println(surfaceArea);          
      System.out.print("The base area is ");// area de un circulo
      System.out.println(baseArea);
    System.out.print("The volume is "); //volumen de un cilindro es π r² h
     System.out.println(volume);
   }
}
