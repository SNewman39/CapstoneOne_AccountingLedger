package com.ps;

import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 0;
        String ledger = "";
        boolean exit = false;

        while (!exit) {
            System.out.println("\n---Home Screen---");
            System.out.println("1. Deposit");
            System.out.println("2. Make Payment (Debit)");
            System.out.println("3. Ledger");
            System.out.println("4. Exit");
            System.out.println("Choose an option: ");
            int option = scanner.nextInt();

            if (option == 1) {
                // Deposit
                System.out.println("Enter deposit amount: ");
                double depositAmount = scanner.nextDouble();
                if (depositAmount > 0) {
                    balance += depositAmount;
                    ledger += "Deposited: $" + depositAmount + "\n";
                    System.out.println("Deposit successful!");
                } else {
                    System.out.println("Deposit must be positive.");
                }

            } else if (option == 2) {
                // Make Payment (Debit)
                System.out.println("Enter payment amount: ");
                double paymentAmount = scanner.nextDouble();
                if (paymentAmount > 0 && paymentAmount <= balance) {
                    balance -= paymentAmount;
                    ledger += "Payment: $" + paymentAmount + "\n";
                    System.out.println("Payment successful!");
                } else if (paymentAmount > balance) {
                    System.out.println("Insufficient balance.");
                } else {
                    System.out.println("Payment must be positive.");
                }

            } else if (option == 3) {
                // Show Ledger
                System.out.println("\n---Ledger---");
                System.out.println(ledger);
                System.out.println("Current balance: $" + balance);

            } else if (option == 4) {
                // Exit
                exit = true;
                System.out.println("Exiting... Goodbye!");
            } else {
                System.out.println("Invalid option. Please choose a valid one.");
            }
        }
        scanner.close();
    }
    }

