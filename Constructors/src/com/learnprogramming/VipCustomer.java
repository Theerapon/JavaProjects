package com.learnprogramming;

public class VipCustomer {

    private String customerName;
    private double creditLimit;
    private String customerEmailAddress;

    public VipCustomer() {
        this("Default name", 50000, "default@email.com");
    }

    public VipCustomer(String customerName, double creditLimit) {
        this(customerName, creditLimit, "unknown@email.com");
    }

    public VipCustomer(String customerName, double creditLimit, String customerEmailAddress) {
        this.customerName = customerName;
        this.creditLimit = creditLimit;
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }
}
