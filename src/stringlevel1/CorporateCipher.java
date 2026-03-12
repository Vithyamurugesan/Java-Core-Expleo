package stringlevel1;

import java.util.Scanner;

public class CorporateCipher {

    public static String encrypt(String s) {

        String result = "";

        for(int i=0;i<s.length();i++) {

            char ch = s.charAt(i);

            // Uppercase letters
            if(ch >= 'A' && ch <= 'Z') {
                ch = (char)((ch - 'A' + 3) % 26 + 'A');
                result = result + ch;
            }

            // Lowercase letters
            else if(ch >= 'a' && ch <= 'z') {
                ch = (char)((ch - 'a' + 3) % 26 + 'a');
                result = result + ch;
            }

            // Space
            else if(ch == ' ') {
                result = result + "_";
            }

            // Digits
            else if(ch >= '0' && ch <= '9') {
                result = result + ch;
            }

            // Other characters
            else {
                result = result + ch;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        System.out.println(encrypt(input));
    }
}
