package stringlevel1;

import java.util.Scanner;
public class TrimWithoutUsingTrim {
	public static String myTrim(String s) {
		int start = 0;
		int end = s.length() - 1;
		// remove leading spaces(Starting Space)
		while (start <= end && s.charAt(start) == ' ') {
			start++;
		}
		//Remove trailing space(Ending space)
		while (end >= start && s.charAt(end) == ' ') {
			end--;
		}
		String result = "";
		for (int i = start; i <= end; i++) {
			result = result + s.charAt(i);
		}

		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s = sc.nextLine();
        
		System.out.println(myTrim(s));
	}
}




