package exceptionhandlinglevel1;

//User defined exception
class PayOutOfBoundsException extends Exception {
 PayOutOfBoundsException(String msg) {
     super(msg);
 }
}

class AccountManagement {

 int balance = 80000;
 int maxLimit = 30000;

 // Check transaction conditions
 void checkForDebit(int amount) throws PayOutOfBoundsException {

     if (amount > maxLimit) {
         throw new PayOutOfBoundsException("Transaction exceeds maximum limit (30000)");
     }

     if (amount > balance) {
         throw new PayOutOfBoundsException("Insufficient balance");
     }
 }

 // Withdraw method
 void withdrawAmount(int amount) {

     try {
         checkForDebit(amount);
         balance = balance - amount;
         System.out.println("Withdrawal successful");
         System.out.println("Remaining Balance: " + balance);

     } catch (PayOutOfBoundsException e) {
         System.out.println(e.getMessage());
     }
 }
}

public class TestAccount {
 public static void main(String[] args) {

     AccountManagement acc = new AccountManagement();

     acc.withdrawAmount(20000);  // valid
     acc.withdrawAmount(35000);  // exceeds limit
     acc.withdrawAmount(90000);  // insufficient balance
 }
}