package stringlevel1;

import java.util.Scanner;

public class EmailValidator {

    public static boolean validateEmail(String email) {

        // must contain @
        if (!email.contains("@"))
            return false;

        String parts[] = email.split("@");

        // must have only two parts
        if (parts.length != 2)
            return false;

        String local = parts[0];
        String domain = parts[1];

        // Local part must start with a letter
        if (!Character.isLetter(local.charAt(0)))
            return false;

        // No consecutive punctuation
        if (local.contains("..") || local.contains("._") || local.contains("-."))
            return false;

        // Local part must not end with punctuation
        char last = local.charAt(local.length() - 1);
        if (last == '.' || last == '_' || last == '-')
            return false;

        // Domain must contain dot
        if (!domain.contains("."))
            return false;

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String email = sc.nextLine();

        if (validateEmail(email))
            System.out.println("Valid corporate email");
        else
            System.out.println("Invalid email");
    }
}









