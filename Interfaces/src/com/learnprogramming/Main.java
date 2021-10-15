package com.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ITelephone timsPhone;
        timsPhone = new DeskPhone(123455);
        timsPhone.powerOn();
        timsPhone.callPhone(123455);
        timsPhone.answer();

        timsPhone = new MobilePhone(23451);
        timsPhone.powerOn();
        timsPhone.callPhone(23451);
        timsPhone.answer();
    }
}
