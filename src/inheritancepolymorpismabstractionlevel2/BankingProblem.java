package inheritancepolymorpismabstractionlevel2;

class Customer {

    String name;
    String city;

    Customer(String name, String city) {
        this.name = name;
        this.city = city;
    }

    void displayCustomer() {
        System.out.println("Customer Name: " + name);
        System.out.println("City: " + city);
    }
}
class Account {

    int accNo;
    double balance;

    Account(int accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }

    void displayAccount() {
        System.out.println("Account Number: " + accNo);
        System.out.println("Balance: " + balance);
    }
}
class RBI {

    Customer c;
    Account a;

    double getInterestRate() {
        return 4.0;
    }

    double getWithdrawalLimit() {
        return 20000;
    }
}
class SBI extends RBI {

    double getInterestRate() {
        return 5.5;
    }

    double getWithdrawalLimit() {
        return 25000;
    }
}
class ICICI extends RBI {

    double getInterestRate() {
        return 6.0;
    }

    double getWithdrawalLimit() {
        return 30000;
    }
}
class PNB extends RBI {

    double getInterestRate() {
        return 5.0;
    }

    double getWithdrawalLimit() {
        return 20000;
    }
}
public class BankingProblem {

    public static void main(String[] args) {

        RBI bank;

        bank = new SBI();
        System.out.println("SBI Interest Rate: " + bank.getInterestRate());
        System.out.println("SBI Withdrawal Limit: " + bank.getWithdrawalLimit());

        bank = new ICICI();
        System.out.println("\nICICI Interest Rate: " + bank.getInterestRate());
        System.out.println("ICICI Withdrawal Limit: " + bank.getWithdrawalLimit());

        bank = new PNB();
        System.out.println("\nPNB Interest Rate: " + bank.getInterestRate());
        System.out.println("PNB Withdrawal Limit: " + bank.getWithdrawalLimit());

    }
}