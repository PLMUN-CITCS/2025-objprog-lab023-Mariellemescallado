// BankAccount.java - Define the BankAccount class with attributes and methods
class BankAccount {
    // Attributes with different access modifiers
    public String accountHolder;
    private double balance;
    protected String accountType;

    // Constructor to initialize the attributes
    public BankAccount(String accountHolder, double balance, String accountType) {
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.accountType = accountType;
    }

    // Deposit method to add money to the balance
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Withdraw method to subtract money from the balance
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    // Method to get the current balance (since balance is private)
    public double getBalance() {
        return balance;
    }
}

// BankAccountDemo.java - Main class to demonstrate the BankAccount class
public class BankAccountDemo {
    public static void main(String[] args) {
        // Create a BankAccount object and initialize it with account details
        BankAccount myAccount = new BankAccount("Alice", 1000.0, "Checking");

        // Deposit and withdraw some money
        myAccount.deposit(250.0);
        myAccount.withdraw(100.0);

        // Print account information
        System.out.println("Account Holder: " + myAccount.accountHolder);
        System.out.println("Account Type: " + myAccount.accountType);
        System.out.println("Current Balance: $" + myAccount.getBalance());
    }
}
