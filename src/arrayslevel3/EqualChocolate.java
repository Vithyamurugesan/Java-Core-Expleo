package arrayslevel3;

import java.util.Scanner;

public class EqualChocolate{
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        // Input number of friends
	        int N = sc.nextInt();

	        int[] chocolates = new int[N];
	        int total = 0;

	        // Input chocolates
	        for(int i = 0; i < N; i++) {
	            chocolates[i] = sc.nextInt();
	            total += chocolates[i];
	        }

	        // Check if equally divisible
	        if(total % N == 0) {
	            System.out.println("Yes");
	        } else {
	            System.out.println("No");
	        }

	        sc.close();
	    }
}
