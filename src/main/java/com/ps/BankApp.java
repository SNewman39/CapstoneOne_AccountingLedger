package com.ps;
import java.sql.SQLOutput;
import java.util.Scanner;
public class BankApp {
    Scanner scanner = new Scanner(System.in);
    double balance = 0;
    String ledger = "";
    boolean exit = false;

    while (!exit){
        System.out.println("\n---Home Screen---");
        System.out.println("1. Deposit");
        System.out.println("2. Make Payment (Debit)");
        System.out.println("3. Legder");
        System.out.println("Choose an option: ");
        int option = scanner.nextInt();

        if (option == 1){
            // Deposit
            System.out.println("Enter deposit amount: ");
            double depositAmount = scanner.nextDouble();
            if (depositAmount > 0){
                balance += depositAmount;
                ledger += "Deposited: $" + depositAmount + "\n";
                System.out.println("Deposit successful!");
            } else{
                System.out.println("Deposit must be positive.");
            }
            else if (option == 2){
               // Make Payment (Debit)
                System.out.println("Enter payment amount: ");
                double paymentAmount = scanner.nextDouble();
                if (paymentAmount > 0 && paymentAmount <= balance){
                    balance -= paymentAmount;
                    ledger += "Payment: $" + paymentAmount + "\n";
                    System.out.println("Payment successful!");
                } else if (paymentAmount > balance){
                    System.out.println("Insufficient balance.");
                } else {
                    System.out.println("Payment must be positive.");
                }


            }

        }
    }
}
