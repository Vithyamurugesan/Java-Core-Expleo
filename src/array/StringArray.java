package array;

public class StringArray {

	public static void main(String[] args) {
		String custname[]=new String[5];
		custname[0]="Aaron";
		custname[1]="John";
		custname[2]="James";
		custname[3]="Vinoth";
		custname[4]="kavin";
		
		for(String name:custname) {
			System.out.println(name+" ");
		}
	}
}
