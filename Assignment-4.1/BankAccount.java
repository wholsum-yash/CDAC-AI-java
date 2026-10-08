import java.util.Scanner;

public class BankAccount {
    String accountNumber;
    String customerName;
    double balance;

    void read() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        accountNumber = sc.nextLine();

        System.out.print("Enter Customer Name: ");
        customerName = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        balance = sc.nextDouble();
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    void display() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Customer Name  : " + customerName);
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount();

        acc.read();
        acc.deposit(5000);
        acc.withdraw(2000);
        acc.display();
    }
}
