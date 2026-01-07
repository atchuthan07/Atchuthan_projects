package oopsconcept;

import java.util.Scanner;

public class BankACCsystem {

    static class BankAccount {
        private int accountNumber;
        private double balance;

        BankAccount(int accNo) {
            accountNumber = accNo;
            balance = 0;
        }

        void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
            }
        }

        void withdraw(double amount) {
            if (amount <= balance) {
                balance -= amount;
            } else {
                System.out.println("Insufficient balance");
            }
        }

        // ✅ accountNumber is USED here
        void displayAccount() {
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: " + balance);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int accNo = sc.nextInt();

        BankAccount acc = new BankAccount(accNo);

        System.out.print("Enter deposit amount: ");
        acc.deposit(sc.nextDouble());

        System.out.print("Enter withdraw amount: ");
        acc.withdraw(sc.nextDouble());

        // ✅ using accountNumber through method
        acc.displayAccount();

        sc.close();
    }
}
