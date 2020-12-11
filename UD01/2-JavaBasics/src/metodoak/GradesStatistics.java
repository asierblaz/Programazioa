/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodoak;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author blazquez.asier
 */
public class GradesStatistics {

    public static int[] grades;  // Declare an int[], to be allocated later.
    // This array is accessible by all the methods.

    public static void main(String[] args) {
        readGrades();  // Read and save the inputs in global int[] grades
        System.out.println("The grades are: ");
        print(grades);
        System.out.println("The average is " + average(grades));
        System.out.println("The median is " + median(grades));
        System.out.println("The minimum is " + min(grades));
        System.out.println("The maximum is " + max(grades));
        System.out.println("The standard deviation is " + stdDev(grades));
    }

    // Prompt user for the number of students and allocate the global "grades" array.
    // Then, prompt user for grade, check for valid grade, and store in "grades".
    public static void readGrades() {
        int numItems;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of students:");
        numItems = in.nextInt();

        // Allocate the array
        grades = new int[numItems];

        // Prompt and read the items into the "int" array, if array length > 0
        for (int i = 0; i < numItems; i++) {
            System.out.print("Enter grade for student " + (i + 1) + ":");
            grades[i] = in.nextInt();

        }

    }

    // Print the given int array in the form of [x1, x2, x3,..., xn].
    public static void print(int[] array) {

        System.out.println(Arrays.toString(array));

    }

    // Return the average value of the given int[]
    public static double average(int[] array) {
        double average = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }

        average = (double) sum / (double) (array.length);

        return average;
    }

    // Return the median value of the given int[]
    // Median is the center element for odd-number array, 
    // or average of the two center elements for even-number array.
    // Use Arrays.sort(anArray) to sort anArray in place.
    public static double median(int[] array) {
        if (array.length %2 ==0){
            return 0;
        }else{
        
       int pos;
       pos = (array.length-1)/2;
       return array[pos];
        
        
        }
        
    }

    // Return the maximum value of the given int[]
    public static int max(int[] array) {
        int max = array[0];   // Assume that max is the first element
        //From second element, if the element is more than max, set the max to this element.

        max = array[0];

        for (int i = 0; i < array.length; i++) {

            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    // Return the minimum value of the given int[]
    public static int min(int[] array) {
        int min = array[0];   // Assume that max is the first element
        //From second element, if the element is more than max, set the max to this element.

        min = array[0];

        for (int i = 0; i < array.length; i++) {

            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    // Return the standard deviation of the given int[]
    public static double stdDev(int[] array) {
        double deviation;
        int sum = 0;

        for (int i = 0; i < array.length; ++i) {
            sum = sum + array[i];
        }
        deviation = sum / array.length;
        return deviation;

    }
}
