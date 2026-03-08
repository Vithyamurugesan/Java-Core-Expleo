package array;

public class MultiDimentionalArray {

	public static void main(String[] args) {
		int [][] x = new int[][] {{1,2},{3,4},{5,6}}; //initialize values
		for(int i=0;i< x.length;i++) { //row 3->x.length
			for(int j=0;j< x[i].length;j++) { //2->x[i].length
				//Print array elements 
				System.out.print(x[i][j]+" ");	
			}
			System.out.println();
		}
	}
}
