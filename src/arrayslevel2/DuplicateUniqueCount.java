package arrayslevel2;

import java.util.Scanner;

public class DuplicateUniqueCount {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter array size: ");
	        int n = sc.nextInt();

	        int[] arr = new int[n];
	        boolean[] visited = new boolean[n];

	        System.out.println("Enter array elements:");
	        for(int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	            visited[i] = false;
	        }

	        int duplicateCount = 0;
	        int uniqueCount = 0;

	        for(int i = 0; i < n; i++) {
	            if(visited[i])
	                continue;

	            int count = 1;

	            for(int j = i + 1; j < n; j++) {
	                if(arr[i] == arr[j]) {
	                    count++;
	                    visited[j] = true;
	                }
	            }

	            if(count > 1)
	                duplicateCount++;   // element repeated
	            else
	                uniqueCount++;      // element appears only once
	        }

	        System.out.println("No of duplicate element: " + duplicateCount);
	        System.out.println("No of unique elements: " + uniqueCount);

	        sc.close();
	    }
}
