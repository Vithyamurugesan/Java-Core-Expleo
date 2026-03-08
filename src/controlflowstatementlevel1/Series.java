package controlflowstatementlevel1;

import java.util.Scanner;

public class Series {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the value of i: ");
	        int i = sc.nextInt();
	        int sum = 0;
	        int num = 1;
	        do {
	            sum = sum + num;
	            num++;
	        } while (num <= i); 
	        System.out.println("Sum of series = " + sum);
	        sc.close();
	    }
}



