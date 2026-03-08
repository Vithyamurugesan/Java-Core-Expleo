package controlflowstatementlevel1;

public class PrintAlphabet {
	public static void main(String[]args) {
		 char ch1 = 'a';
	     char ch2 = 'z';
	        for (int i = 0; i < 26; i++) {
	            System.out.print(""+ch1 + ch2 + " ");
	            ch1++;
	            ch2--;
	        }
	}
}
		
