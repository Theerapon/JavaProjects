package com.learnprogramming;

public class Penguin extends Bird {

    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("I'm not very food at that, can T go for a swim instead?");
    }
}
