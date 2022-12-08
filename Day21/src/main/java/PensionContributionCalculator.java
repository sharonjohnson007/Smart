package main.java;

import java.util.Scanner;

/**
 * To calculate PensionContribution by employee and employer.
 */
public class PensionContributionCalculator {
    final int SALARY_CEILING = 6000;
    final double EMPLOYEE_RATE_55_AND_BELOW = 0.2;
    final double EMPLOYER_RATE_55_AND_BELOW = 0.17;
    final double EMPLOYEE_RATE_55_TO_60 = 0.13;
    final double EMPLOYER_RATE_55_TO_60 = 0.13;
    final double EMPLOYEE_RATE_60_TO_65 = 0.075;
    final double EMPLOYER_RATE_60_TO_65 = 0.09;
    final double EMPLOYEE_RATE_65_ABOVE = 0.05;
    final double EMPLOYER_RATE_65_ABOVE = 0.075;

    public static void main(String[] args) {
        PensionContributionCalculator contribute = new PensionContributionCalculator();
        int salary, age;
        int contributableSalary;
        double employeeContribution, employerContribution, totalContribution;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the monthly salary: $");
        salary = in.nextInt();
        if (salary > 6000) {
            contributableSalary = contribute.SALARY_CEILING;
        } else {
            contributableSalary = salary;
        }
        System.out.print("Enter your age: ");
        age = in.nextInt();
        if (age <= 55) {                //Contribution of Employee =0.2,Employer =0.17.
            employeeContribution = contributableSalary * contribute.EMPLOYEE_RATE_55_AND_BELOW;
            employerContribution = contributableSalary * contribute.EMPLOYER_RATE_55_AND_BELOW;
            totalContribution = employeeContribution + employerContribution;
        } else if (age <= 60) {        //Contribution of Employee =0.13,Employer =0.13.
            employeeContribution = contributableSalary * contribute.EMPLOYEE_RATE_55_TO_60;
            employerContribution = contributableSalary * contribute.EMPLOYER_RATE_55_TO_60;
            totalContribution = employeeContribution + employerContribution;
        } else if (age <= 65) {        //Contribution of Employee =0.075,Employer =0.09.
            employeeContribution = contributableSalary * contribute.EMPLOYEE_RATE_60_TO_65;
            employerContribution = contributableSalary * contribute.EMPLOYER_RATE_60_TO_65;
            totalContribution = employeeContribution + employerContribution;
        } else {                        //Contribution of Employee =0.05,Employer =0.075.
            employeeContribution = contributableSalary * contribute.EMPLOYEE_RATE_65_ABOVE;
            employerContribution = contributableSalary * contribute.EMPLOYER_RATE_65_ABOVE;
            totalContribution = employeeContribution + employerContribution;
        }
        System.out.printf("The employee's contribution is: $%.2f%n", employeeContribution);
        System.out.printf("The employer's contribution is: $%.2f%n", employerContribution);
        System.out.printf("The total contribution is: $%.2f%n", totalContribution);
    }
}
