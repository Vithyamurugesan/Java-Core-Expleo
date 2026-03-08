package controlflowstatementlevel1;

import java.util.Scanner;

public class EmployeeDetails {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the employee ID: ");
		int empid=sc.nextInt();
		System.out.println("Enter the employee name: ");
		String empname=sc.nextLine();
		sc.next();
		System.out.println("Enter the wage: ");
		int wage=sc.nextInt();
		System.out.println("Enter the days worked: ");
		int days=sc.nextInt();
		 if (wage<= 0) {
	            System.out.println("Invalid wage");
	        } 
	        else if (days <= 0) {
	            System.out.println("Invalid days");
	        } 
	        else {
	            double totalSalary = wage* days;
	            System.out.println("\nEmployee Details");
	            System.out.println("Employee ID: " + empid);
	            System.out.println("Employee Name: " + empname);
	            System.out.println("Wage per Day: " + wage);
	            System.out.println("Days Worked: " + days);
	            System.out.println("Total Salary: " + totalSalary);
	        }
	        
	        sc.close();
	}
}
