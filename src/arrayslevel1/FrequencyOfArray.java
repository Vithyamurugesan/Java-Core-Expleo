package arrayslevel1;

import java.util.Scanner;

public class FrequencyOfArray {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter number of elements:");
	        int n = sc.nextInt();

	        int[] arr = new int[n];
	        boolean[] visited = new boolean[n];

	        System.out.println("Enter the elements:");
	        for(int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	            visited[i] = false;
	        }

	        for(int i = 0; i < n; i++) {
	            if(visited[i] == true)
	                continue;

	            int count = 1;

	            for(int j = i + 1; j < n; j++) {
	                if(arr[i] == arr[j]) {
	                    count++;
	                    visited[j] = true;
	                }
	            }

	            System.out.println(arr[i] + " occurs " + count + " times");
	        }

	        sc.close();
	    }

}
