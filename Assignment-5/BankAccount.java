import java.util.Scanner;

class BankAccount {
    private String accountNumber;
    private String customerName;
    private double balance;

    private static String bankName = "Central Bank";
    private static int accountCount = 0;

    public BankAccount(Scanner sc) {
        read(sc);
        accountCount++;
    }

    public void read(Scanner sc) {
        System.out.print("Account Number: ");
        accountNumber = sc.next();
        sc.nextLine();

        System.out.print("Customer Name: ");
        customerName = sc.nextLine();

        System.out.print("Initial Balance: ");
        balance = sc.nextDouble();
        sc.nextLine();
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("Deposited %.2f successfully.%n", amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount <= balance) {
            balance -= amount;
            System.out.printf("Withdrawn %.2f successfully.%n", amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void display() {
        System.out.println("Bank: " + bankName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Customer Name: " + customerName);
        System.out.printf("Current Balance: %.2f%n", balance);
        System.out.println("-----------------------------");
    }

    public static void changeBankName(String newName) {
        bankName = newName;
    }

    public static void displayAccountCount() {
        System.out.println("Total bank accounts: " + accountCount);
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount.changeBankName("Global Bank");

        System.out.print("Enter number of accounts: ");
        int n = sc.nextInt();
        sc.nextLine();

        BankAccount[] accounts = new BankAccount[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Account " + (i + 1) + ":");
            accounts[i] = new BankAccount(sc);
        }

        if (n > 0) {
            System.out.print("\nEnter amount to deposit into first account: ");
            double depositAmount = sc.nextDouble();
            accounts[0].deposit(depositAmount);

            System.out.print("Enter amount to withdraw from first account: ");
            double withdrawAmount = sc.nextDouble();
            accounts[0].withdraw(withdrawAmount);
        }

        System.out.println("\n----- Bank Account Details -----");
        for (BankAccount account : accounts) {
            account.display();
        }

        BankAccount.displayAccountCount();
        sc.close();
    }
}
