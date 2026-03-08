package arrayslevel3;

import java.util.Arrays;
import java.util.Scanner;

public class MergeAndSort {
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        // First array
	        int M = sc.nextInt();
	        int[] X = new int[M];
	        for(int i = 0; i < M; i++) {
	            X[i] = sc.nextInt();
	        }

	        // Second array
	        int N = sc.nextInt();
	        int[] Y = new int[N];
	        for(int i = 0; i < N; i++) {
	            Y[i] = sc.nextInt();
	        }

	        // Third array
	        int O = sc.nextInt();
	        int[] Z = new int[O];
	        for(int i = 0; i < O; i++) {
	            Z[i] = sc.nextInt();
	        }

	        // Merge into one array
	        int[] merged = new int[M + N + O];
	        int index = 0;

	        for(int i = 0; i < M; i++)
	            merged[index++] = X[i];

	        for(int i = 0; i < N; i++)
	            merged[index++] = Y[i];

	        for(int i = 0; i < O; i++)
	            merged[index++] = Z[i];

	        // Sort the merged array
	        Arrays.sort(merged);

	        // Print sorted array
	        for(int i = 0; i < merged.length; i++) {
	            System.out.print(merged[i] + " ");
	        }

	        sc.close();
	    }
}
