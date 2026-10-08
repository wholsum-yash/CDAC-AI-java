class BankAccount {
    String accountNo;
    String accountHolderName;
    double balance;

    public BankAccount(String accountNo, String accountHolderName, double balance) {
        this.accountNo = accountNo;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ", New Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void displayAccountDetails() {
        System.out.println("Account No: " + accountNo);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    public SavingsAccount(String accountNo, String accountHolderName,
                          double balance, double interestRate) {
        super(accountNo, accountHolderName, balance);
        this.interestRate = interestRate;
    }

    public double calculateInterest() {
        return balance * interestRate / 100;
    }

    public void displaySavingsDetails() {
        displayAccountDetails();
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Interest: " + calculateInterest());
    }
}

class CurrentAccount extends BankAccount {
    double overdraftLimit;

    public CurrentAccount(String accountNo, String accountHolderName,
                          double balance, double overdraftLimit) {
        super(accountNo, accountHolderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public void checkOverdraftLimit() {
        System.out.println("Overdraft Limit: " + overdraftLimit);
        if (balance < 0) {
            System.out.println("Account is overdrawn. Remaining overdraft: "
                               + (overdraftLimit + balance));
        } else {
            System.out.println("Account is not overdrawn.");
        }
    }

    public void displayCurrentAccountDetails() {
        displayAccountDetails();
        checkOverdraftLimit();
    }
}

public class InheritanceDemo3 {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("SA001", "John", 10000, 5);
        sa.displaySavingsDetails();

        System.out.println("-------------------");

        CurrentAccount ca = new CurrentAccount("CA001", "Jane", 5000, 2000);
        ca.displayCurrentAccountDetails();
    }
}
