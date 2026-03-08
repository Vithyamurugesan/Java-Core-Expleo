package controlflowstatementlevel2;

import java.util.Scanner;

public class CountCharacters {

	    public static void main(String[] args) {
	        
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter String: ");
	        String str = sc.nextLine();
	        
	        int letters = 0;
	        int digits = 0;
	        int others = 0;
	        
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            
	            if (Character.isLetter(ch)) {
	                letters++;
	            }
	            else if (Character.isDigit(ch)) {
	                digits++;
	            }
	            else {
	                others++;
	            }
	        }
	        
	        System.out.println("Letters: " + letters + ", Digits: " + digits + ", Other Symbols: " + others);
	        
	        sc.close();
	    }
	}
