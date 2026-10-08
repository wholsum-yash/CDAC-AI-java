class BankAccount {
    String accountNo;
    String accountHolderName;
    double balance;

    public BankAccount(String accountNo, String accountHolderName, double balance) {
        this.accountNo = accountNo;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public double calculateInterest() {
        return balance * 0.03; // general 3% interest
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    public SavingsAccount(String accountNo, String accountHolderName, double balance, double interestRate) {
        super(accountNo, accountHolderName, balance);
        this.interestRate = interestRate;
    }

    public double calculateInterest() {
        return balance * interestRate / 100;
    }
}

class CurrentAccount extends BankAccount {
    double interestRate;

    public CurrentAccount(String accountNo, String accountHolderName, double balance, double interestRate) {
        super(accountNo, accountHolderName, balance);
        this.interestRate = interestRate;
    }

    public double calculateInterest() {
        // Current account rule: no interest if balance is below 5000
        if (balance < 5000) {
            return 0;
        }
        return balance * interestRate / 100;
    }
}

public class BankAccountPoly {
    public static void main(String[] args) {
        SavingsAccount obj1 = new SavingsAccount("100001", "John", 20000, 5);
        CurrentAccount obj2 = new CurrentAccount("100001", "Jane", 4000, 2);

        System.out.println("Savings Account Interest: " + obj1.calculateInterest());
        System.out.println("Current Account Interest: " + obj2.calculateInterest());
    }
}
