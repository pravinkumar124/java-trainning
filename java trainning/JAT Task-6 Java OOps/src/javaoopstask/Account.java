package javaoopstask;

public class Account {
   
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public Account() {
        this.accountNumber = "Unknown";
        this.accountHolderName = "Unknown";
        this.balance = 0.0;
    }

    public Account(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

   
    public double getBalance() {
        return balance;
    }

  
    @Override
    public String toString() {
        return "Account [Account Number=" + accountNumber + ", Account Holder=" + accountHolderName + ", Balance=$" + balance + "]";
    }

    public static void main(String[] args) {
       
        Account acc1 = new Account(); 
        Account acc2 = new Account("123456789", "Arun", 8000.0); 
   
        System.out.println("Account 1:");
        System.out.println(acc1.toString());

        System.out.println("Account 2:");
        System.out.println(acc2.toString());

        acc2.deposit(5000.0);
        acc2.withdraw(500.0);
        acc2.withdraw(500.0); 
      
        System.out.println("Updated Account 2:");
        System.out.println(acc2.toString());
    }
}