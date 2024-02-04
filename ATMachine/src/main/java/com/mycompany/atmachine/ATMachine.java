package com.mycompany.atmachine;
import java.util.Scanner;

public class ATMachine {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("BDO ATM System. \"We find Ways\"");
       
        Savings savings1 = new Savings(1, 1000, 1234);
        Savings savings2 = new Savings(2, 2000, 5678);
        Savings savings3 = new Savings(3, 3000, 9012);

        Checkings checkings1 = new Checkings(1, 1500, 4321);
        Checkings checkings2 = new Checkings(2, 2500, 8765);
        Checkings checkings3 = new Checkings(3, 3500, 2109);

        while (true) {
            System.out.println("1: Savings\n2: Checkings");
            System.out.print("Choose an Account type (1 or 2): ");
            int accountType = sc.nextInt();

            System.out.print("Enter Account Number (1-3): ");
            int accountNumber = sc.nextInt();

            System.out.print("Enter PIN: ");
            int enteredPin = sc.nextInt();

            BankAccount selectedAccount = null;

            if (accountType == 1) {
                switch (accountNumber) {
                    case 1:
                        selectedAccount = savings1;
                        break;
                    case 2:
                        selectedAccount = savings2;
                        break;
                    case 3:
                        selectedAccount = savings3;
                        break;
                    default:
                        System.out.println("Invalid account number.");
                        continue;
                }
            } else if (accountType == 2) {
                switch (accountNumber) {
                    case 1:
                        selectedAccount = checkings1;
                        break;
                    case 2:
                        selectedAccount = checkings2;
                        break;
                    case 3:
                        selectedAccount = checkings3;
                        break;
                    default:
                        System.out.println("Invalid account number.");
                        continue;
                }
            } else {
                System.out.println("Invalid account type.");
                continue;
            }

            if (selectedAccount.pin != enteredPin) {
                System.out.println("Incorrect PIN. Please try again.");
                continue;
            }

            // Perform transactions
            while (true) {
                System.out.println("\n1: Inquire Balance\n2: Withdraw\n3: Deposit\n4: Change PIN\n5: Exit");
                System.out.print("Choose a transaction (1-5): ");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Balance: $" + selectedAccount.getBalance());
                        break;
                    case 2:
                         System.out.print("Enter withdrawal amount: $");
                        double withdrawalAmount = getValidAmount(sc);
                        selectedAccount.withdraw(withdrawalAmount);
                        System.out.println("Withdrawal successful. New Balance: $" + selectedAccount.getBalance());
                        break;
                    case 3:
                        System.out.print("Enter deposit amount: $");
                        double depositAmount = getValidAmount(sc);
                        selectedAccount.deposit(depositAmount);
                        System.out.println("Deposit successful. New Balance: $" + selectedAccount.getBalance());
                        break;
                    case 4:
                        System.out.print("Enter new PIN: ");
                        int newPin = sc.nextInt();
                        selectedAccount.changePin(newPin);
                        System.out.println("PIN changed successfully.");
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice.");
                        break;
                }

                if (choice == 5) {
                    break;
                }
            }

            System.out.print("Do you want to perform another transaction? (yes/no): ");
            String anotherTransaction = sc.next().toLowerCase();

            if (!anotherTransaction.equals("yes")) {
                System.out.println("Thank you for using the ATM. Goodbye!");
                break;
            }
        }
        
    }
     private static double getValidAmount(Scanner scanner) {
        while (true) {
            if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            } else {
                System.out.print("Invalid input. Please enter a numeric value: ");
                scanner.next(); // Consume the invalid input
            }
}
     }
}
