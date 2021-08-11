package com.learnprogramming;

public class Main {

    public static void main(String[] args) {

        Printer printer = new Printer(100);
        printer.print(20);

        printer.fillUpToner(40);
        printer.print(200);

        printer.fillUpToner(100);
        printer.pressDuplexMode();
        printer.print(100);
    }
}
