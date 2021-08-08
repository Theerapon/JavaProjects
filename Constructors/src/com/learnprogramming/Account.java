package com.learnprogramming;

public class Account {

    private String number;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public Account() {
        this("XXX-XXX-XXX-XXX", 0, "Default Name", "Default Address", "Default Phone");
    }

    public Account(String number, double balance, String customerName, String email, String phoneNumber) {
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Account(String customerName, String email, String phoneNumber) {
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void depositFunds(double funds) {
        balance += funds;
        System.out.println("Balance: " + balance);
    }

    public void withdrawFunds(double withdrawalAmount) {
        if (balance - withdrawalAmount < 0) {
            System.out.println("Only " + balance + " available. Withdrawal not processed");
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed. Remaining balance " + balance);
        }
    }
}
