package stringlevel1;

import java.util.Scanner;

public class RemoveDuplicates {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		for(int i=0;i<s1.length();i++) {
			char ch=s1.charAt(i);
			boolean isDuplicate=false;
			for(int j=0;j<i;j++) {
				if(ch==s1.charAt(j)) {
					isDuplicate=true;
					break;			
				}
			}
			if(!isDuplicate) {
				System.out.print(ch);
			}
		}
	}
}






