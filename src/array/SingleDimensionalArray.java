package array;

public class SingleDimensionalArray {
	public static void main(String[]args) {
		int marks[]=new int[3];
		marks[0]=89;
		marks[1]=90;
		System.out.println("Element at index 0: "+marks[0]);
		System.out.println("Element at index 1: "+marks[1]);
		System.out.println("Element at index 2: "+marks[2]);
		
		
		for(int i:marks) { // i-> reference for the marks array.
			System.out.println(i+" ");	
		}
		
		marks[3]=50;
		System.out.println(marks[3]);
		
		
	
		
	}

}
