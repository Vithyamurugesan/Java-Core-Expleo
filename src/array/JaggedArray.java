package array;

import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int [][]jagged=new int[3][];
		jagged[0]=new int[3]; //{1,2,3};  Compile time input 
		jagged[1]=new int[2]; //{4,5};    Compile time input
		jagged[2]=new int[5]; //{6,7,8,9,10}; Compile time input
		
		//Getting the input from the user
		for(int i=0;i<jagged.length;i++) {
			for(int j=0;j<jagged[i].length;j++) {
				jagged[i][j]=sc.nextInt();
			}
		}
		//Printing the Jagged array
		System.out.println("Two Dimensional Jagged Array");
		for(int i=0;i<jagged.length;i++) {
			for(int j=0;j<jagged[i].length;j++) {
				System.out.print(jagged[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}

}
