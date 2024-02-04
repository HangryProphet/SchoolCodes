package com.mycompany.atmachine;

class BankAccount {
    protected int accountNumber;
    protected int balance;
    protected int pin;

    public BankAccount(int accountNumber, int initialBalance, int pin) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.pin = pin;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    public void changePin(int newPin) {
        pin = newPin;
    }
}
