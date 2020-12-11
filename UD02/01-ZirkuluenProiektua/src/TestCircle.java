/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author blazquez.asier
 */
/**
 * A Test Driver for the "Circle" class
 */
public class TestCircle {    // Save as "TestCircle.java"

    public static void main(String[] args) {   // Program entry point
        // Declare and Construct an instance of the Circle class called c1
        Circle c1 = new Circle(2.0, "blue");  // Use 3rd constructor
        System.out.println("The radius is: " + c1.getRadius());  // use dot operator to invoke member methods
        //The radius is: 2.0
        System.out.println("The color is: " + c1.getColor());
        //The color is: blue
        System.out.printf("The area is: %.2f%n", c1.getArea());
        //The area is: 12.57

        // Declare and Construct another instance of the Circle class called c2
        Circle c2 = new Circle(2.0);  // Use 2nd constructor
        System.out.println("The radius is: " + c2.getRadius());
        //The radius is: 2.0
        System.out.println("The color is: " + c2.getColor());
        //The color is: red
        System.out.printf("The area is: %.2f%n", c2.getArea());
        //The area is: 12.57

        // Declare and Construct yet another instance of the Circle class called c3
        Circle c3 = new Circle();  // Use 1st constructor
        System.out.println("The radius is: " + c3.getRadius());
        //The radius is: 1.0
        System.out.println("The color is: " + c3.getColor());
        //The color is: red
        System.out.printf("The area is: %.2f%n", c3.getArea());
        //The area is: 3.14

        // Declare and Construct yet another instance of the Circle class called c3
        Circle c4 = new Circle(5.0, "blue");
        System.out.println("The radius is: " + c4.getRadius());
        //The radius is: 1.0
        System.out.println("The color is: " + c4.getColor());
        //The color is: red
        System.out.printf("The area is: %.2f%n", c4.getArea());
        //The area is: 3.14

        System.out.println("");
        System.out.println("Zirkulua   Erradioa    Kolorea    Azalera\n"
                + "==========================================\n"
                + "     c1     " + c1.getRadius() + "       " + c1.getColor() + "   " + c1.getArea() + "\n"
                + "     c1     " + c2.getRadius() + "       " + c2.getColor() + "    " + c2.getArea() + "\n"
                + "     c1     " + c3.getRadius() + "       " + c3.getColor() + "    " + c3.getArea() + "\n"
                + "     c1     " + c4.getRadius() + "       " + c4.getColor() + "     " + c4.getArea() + "");

        System.out.println("\nto string metodoa erabiliz");
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());
        System.out.println(c4.toString());
        System.out.println("-------------------------------");

        for (int i = 1; i <=10; i++) {
            System.out.println(c1.toString());
            c1.setRadius(c1.getRadius()+1);
            if (i == 6) {
                c1.setColor("magenta");
            }

        }
        

    }

}
