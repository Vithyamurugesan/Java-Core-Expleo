package classobjectencapsulation;

class Account1 {

    // Private Data Members (Encapsulation)
    private String id;
    private String name;
    private int balance;

    // Constructor 1 – Default balance = 0
    public Account1(String id, String name) {
        this.id = id;
        this.name = name;
        this.balance = 0;
    }

    // Constructor 2 – With initial balance
    public Account1(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    // Getter Methods
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    // Credit Method (Add money)
    public int credit(int amount) {
        balance = balance + amount;
        return balance;
    }

    // Debit Method (Withdraw money)
    public int debit(int amount) {
        if (amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    // Transfer money to another account
    public int transferTo(Account1 another, int amount) {
        if (amount <= balance) {
            this.balance = this.balance - amount;
            another.balance = another.balance + amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    // toString Method
    public String toString() {
        return "Account[id=" + id + ", name=" + name + ", balance=" + balance + "]";
    }
}

// Main Class to Test the Program
public class Account {
    public static void main(String[] args) {

        // Creating accounts
        Account1 acc1 = new Account1("A101", "Vithya", 5000);
        Account1 acc2 = new Account1("A102", "Ravi", 2000);

        // Display accounts
        System.out.println(acc1);
        System.out.println(acc2);

        // Credit operation
        acc1.credit(1000);
        System.out.println("After credit: " + acc1);

        // Debit operation
        acc1.debit(2000);
        System.out.println("After debit: " + acc1);

        // Transfer operation
        acc1.transferTo(acc2, 1000);

        System.out.println("After transfer:");
        System.out.println(acc1);
        System.out.println(acc2);
    }
}