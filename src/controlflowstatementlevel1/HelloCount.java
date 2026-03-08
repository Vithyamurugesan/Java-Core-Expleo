package controlflowstatementlevel1;

import java.util.Scanner;

public class HelloCount {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int num;
	        int totalHello = 0;
	        while (true) {
	            System.out.print("Enter an integer: ");
	            num = sc.nextInt();
	            if (num < 0) {
	                break;
	            }
	            for (int i = 1; i <= num; i++) {
	                System.out.println("Hello");
	                totalHello++;
	            }
	        }
	        System.out.println("Total number of Hello printed: " + totalHello);
	        sc.close();
	    }
}


