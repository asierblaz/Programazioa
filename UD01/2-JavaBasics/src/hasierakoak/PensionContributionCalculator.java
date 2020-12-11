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
public class PensionContributionCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
             // Declare constants
      final int SALARY_CEILING = 6000;
      final double EMPLOYEE_RATE_55_AND_BELOW = 0.2;
      final double EMPLOYER_RATE_55_AND_BELOW = 0.17;
      final double EMPLOYEE_RATE_55_TO_60 = 0.13;
      final double EMPLOYER_RATE_55_TO_60 = 0.13;
      final double EMPLOYEE_RATE_60_TO_65 = 0.075;
      final double EMPLOYER_RATE_60_TO_65 = 0.09;
      final double EMPLOYEE_RATE_65_ABOVE = 0.05;
      final double EMPLOYER_RATE_65_ABOVE = 0.075;

      // Declare variables
      int salary, age;     // to be input
      int contributableSalary=0;
      double employeeContribution=0, employerContribution=0, totalContribution=0;
     // ......
	Scanner in = new Scanner(System.in);

   	System.out.print("Enter the monthly salary:");
        salary = in.nextInt();
        System.out.print("Enter the age:");
         age = in.nextInt();
      
      // Compute various contributions in "double" using a nested-if to handle 4 cases
   if (age <= 55) { // 
    employeeContribution = (double) (salary * EMPLOYEE_RATE_55_AND_BELOW);
    employerContribution = (double) (salary * EMPLOYER_RATE_55_AND_BELOW);
    totalContribution = (double) (employeeContribution + employerContribution);

    } else if (age <= 60) {
	employeeContribution = (double) (salary * EMPLOYEE_RATE_55_TO_60);
	employerContribution = (double) (salary * EMPLOYER_RATE_55_TO_60);
	totalContribution = (double) (employeeContribution + employerContribution);
	} else if (age <= 65) { 
        employeeContribution = (double) (salary * EMPLOYEE_RATE_60_TO_65);
			employerContribution = (double) (salary * EMPLOYER_RATE_60_TO_65);
			totalContribution = (double) (employeeContribution + employerContribution);

		} else {
			employeeContribution = (double) (salary * EMPLOYEE_RATE_65_ABOVE);
			employerContribution = (double) (salary * EMPLOYER_RATE_65_ABOVE);
			totalContribution = (double) (employeeContribution + employerContribution);
			
		}
   
        
        
        System.out.println("The employee's contribution is:" + employeeContribution);
		System.out.println("The employer's contribution is:" + employerContribution);
		System.out.println("The total contribution is:" + totalContribution);
        in.close();
        
    }
}
