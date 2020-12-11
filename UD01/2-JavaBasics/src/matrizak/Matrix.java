/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrizak;

/**
 *
 * @author blazquez.asier
 */
public class Matrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //Definimos un array de 3 filas x 5 columnas
        int array[][] = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};
        double array2[][] = {{1.89, 2, 3.9, 4, 5}, {6, 7.8, 8.1, 9.2, 10.4}, {11.7, 12.8, 13.9, 14.4, 15}};

        System.out.println("Print matiz de int");
        print(array);
        System.out.println("============================");
        
        System.out.println("Print matiz de double");
        print(array2);
        

    }

    //Print matriz de int
    public static void print(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j]+ " ");
              
            }
                System.out.println();

        }
    }
    //Print matriz de int
    public static void print(double[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j]+ " ");
              
            }
                System.out.println();

        }
    }

//   public static boolean haveSameDimension(int[][] m1, int[][] m2);  // Used in add(), subtract()
//   public static boolean haveSameDimension(double[][] m1, double[][] m2);
//   public static int[][] add(int[][] m1, int[][] m2);
//   public static double[][] add(double[][] m1, double[][] m2);
//   public static int[][] subtract(int[][] m1, int[][] m2);
//   public static double[][] subtract(double[][] m1, double[][] m2);
//   public static int[][] multiply(int[][] m1, int[][] m2);
//   public static double[][] multiply(double[][] m1, double[][] m2);
// 

    

}