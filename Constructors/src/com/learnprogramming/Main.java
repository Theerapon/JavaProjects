package com.learnprogramming;

import java.util.AbstractCollection;

public class Main {

    public static void main(String[] args) {
	    Account theeraponAccount = new Account("123-123-123-123", 341.23, "Theerapon", "Theerapon.nanoi.185@gmail.com", "0958310323");
        System.out.println("Customer name: " + theeraponAccount.getCustomerName());
        theeraponAccount.depositFunds(456);
        theeraponAccount.withdrawFunds(200);

        System.out.println();

        Account emptyAccount = new Account();
        System.out.println("Customer name: " + emptyAccount.getCustomerName());
        emptyAccount.withdrawFunds(200);
        emptyAccount.depositFunds(456);
        emptyAccount.withdrawFunds(200);

        System.out.println();
        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getCustomerName());

        VipCustomer person2 = new VipCustomer("Bob", 25000);
        System.out.println(person2.getCustomerName());

        VipCustomer person3 = new VipCustomer("Fakie", 100000, "Theerapon.nanoi.185@gmail,com");
        System.out.println(person3.getCustomerName());
        System.out.println(person3.getCustomerEmailAddress());
    }
}
