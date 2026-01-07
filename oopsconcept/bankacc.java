package oopsconcept;

import java.util.Scanner;

public class bankacc {

    static class BankAccount {
        int accNo;
        double balance;

        BankAccount(int a, double b) {
            accNo = a;
            balance = b;
        }

        void deposit(double amt) {
            balance += amt;
        }

        void display() {
            System.out.println(accNo + " " + balance);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Account no: ");
        int a = sc.nextInt();

        System.out.print("Initial balance: ");
        double b = sc.nextDouble();

        BankAccount acc = new BankAccount(a, b);

        System.out.print("Deposit amount: ");
        acc.deposit(sc.nextDouble());

        acc.display();

        sc.close();
    }
}
