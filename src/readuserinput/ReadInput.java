package readuserinput;

import java.util.Scanner;

public class ReadInput {
	public static void main(String[]args) {
		Scanner console=new Scanner(System.in);
		System.out.println("Enter your Name:");
		String name=console.next();
		System.out.println("Hi,"+name+ " Welcome to the program");
		console.close();
	}
}
