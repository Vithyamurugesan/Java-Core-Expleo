package functionlevel1;


import java.util.Scanner;

public class SalaryHike {
	public static void salaryCalculation(double salary,int hike) {
		double salaryhike=salary+(salary*hike/100);
		System.out.println("The new salary with hike : "+salaryhike);
	}
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the current salary : ");
		double salary=sc.nextDouble();
		System.out.println("Enter the hike : ");
		int hike=sc.nextInt();
		SalaryHike.salaryCalculation(salary, hike);  //calling the method
		sc.close();
	}

}

