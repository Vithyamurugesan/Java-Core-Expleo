package exceptionhandlinglevel1;

import java.util.Scanner;

//User defined exception for Username
class InvalidUsernameException extends Exception {
 InvalidUsernameException(String msg) {
     super(msg);
 }
}

//User defined exception for Password
class InvalidPasswordException extends Exception {
 InvalidPasswordException(String msg) {
     super(msg);
 }
}

public class UserLogin {

 // stored credentials
 static String storedUsername = "Richard_01";
 static String storedPassword = "Ric@1234";

 // username validation
 public static void validateUsername(String username) throws InvalidUsernameException {

     if(!username.matches("^[A-Za-z][A-Za-z0-9_]{5,29}$")) {
         throw new InvalidUsernameException("Invalid Username");
     }
 }

 // password validation
 public static void validatePassword(String password) throws InvalidPasswordException {

     if(!password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*()\\-+]).{8,}$")) {
         throw new InvalidPasswordException("Invalid Password");
     }
 }

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     System.out.print("Enter Username: ");
     String username = sc.nextLine();

     System.out.print("Enter Password: ");
     String password = sc.nextLine();

     try {

         validateUsername(username);
         validatePassword(password);

         if(username.equals(storedUsername) && password.equals(storedPassword)) {
             System.out.println("Welcome " + username);
         } 
         else {
             System.out.println("Invalid username or password");
         }

     } catch (InvalidUsernameException e) {
         System.out.println(e.getMessage());
     } 
     catch (InvalidPasswordException e) {
         System.out.println(e.getMessage());
     }

     sc.close();
 }
}