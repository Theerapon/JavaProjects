package com.learnprogramming;

public class Printer {

    private static final double INST_MAX_TONER_LEVEL = 100;
    private static final int INST_DEFAULT_PAGE = 0;
    private static final boolean INST_DEFAULT_DUPLEX_MODE = false;
    private static final double INST_DEFAULT_TONER_PER_PAGE = 1;
    private static final int INST_AMOUNT_OF_PAGES_TO_PRINT_DUPLEX_MODE_ON = 2;
    private static final int INST_AMOUNT_OF_PAGES_TO_PRINT_DUPLEX_MODE_OFF = 1;

    private double tonerLevel;
    private int numberOfPages;
    private boolean duplexPrinter;

    public Printer(double tonerLevel) {
        this.tonerLevel = tonerLevel;
        this.numberOfPages = INST_DEFAULT_PAGE;
        this.duplexPrinter = INST_DEFAULT_DUPLEX_MODE;
    }

    public void fillUpToner(double amount) {
        if (this.tonerLevel + amount >= INST_MAX_TONER_LEVEL) {
            this.tonerLevel = INST_MAX_TONER_LEVEL;
        } else {
            this.tonerLevel += amount;
        }
        System.out.println("Fill up successful");
        showCurrentTonerLevel();
    }

    private void reduceToner(double amountOfPages) {
        double amount = amountOfPages * INST_DEFAULT_TONER_PER_PAGE;
        if (this.tonerLevel - amount <= 0) {
            this.tonerLevel = 0;
        } else {
            this.tonerLevel -= amount;
        }
    }

    private boolean canPrint() {
        boolean canPrint = false;
        if (this.tonerLevel - (INST_DEFAULT_TONER_PER_PAGE * getAmountOfPagesToPrint()) >= 0) {
            canPrint = true;
        }
        return canPrint;
    }

    public void pressDuplexMode() {
        if (duplexPrinter) {
            turnOffDuplexMode();
        } else {
            turnOnDuplexMode();
        }
    }

    private int getAmountOfPagesToPrint() {
        return (duplexPrinter) ? INST_AMOUNT_OF_PAGES_TO_PRINT_DUPLEX_MODE_ON
                : INST_AMOUNT_OF_PAGES_TO_PRINT_DUPLEX_MODE_OFF;
    }

    private void turnOnDuplexMode() {
        this.duplexPrinter = true;
    }

    private void turnOffDuplexMode() {
        this.duplexPrinter = false;
    }

    public void print(int amountOfPages) {
        int currentPages = 0;
        int remainingPages = amountOfPages;

        while (remainingPages > 0) {
            if (canPrint()) {

                int amountPagesToPrinted = 0;
                if (duplexPrinter && remainingPages >= 2) {
                    amountPagesToPrinted = printDuplexMode();
                } else {
                    amountPagesToPrinted = printNormal();
                }
                currentPages += amountPagesToPrinted;
                remainingPages = amountOfPages - currentPages;
                System.out.println("Printing pages: " + currentPages + " Remaining: " + remainingPages + "/" + amountOfPages);

            } else {
                System.out.println("Out of toner");
                break;
            }
        }

        if (remainingPages <= 0) {
            System.out.println("Printing successful 100%");
        } else {
            System.out.println("Printing successful pages: " + currentPages + " Remaining: " + remainingPages + "/" + amountOfPages + " totals");
        }
        showCurrentTonerLevel();
    }

    private int printDuplexMode() {
        reduceToner(INST_AMOUNT_OF_PAGES_TO_PRINT_DUPLEX_MODE_ON);
        return INST_AMOUNT_OF_PAGES_TO_PRINT_DUPLEX_MODE_ON;
    }

    private int printNormal() {
        reduceToner(INST_AMOUNT_OF_PAGES_TO_PRINT_DUPLEX_MODE_OFF);
        return INST_AMOUNT_OF_PAGES_TO_PRINT_DUPLEX_MODE_OFF;
    }

    public double getTonerLevel() {
        return tonerLevel;
    }

    public void showCurrentTonerLevel() {
        System.out.println("Toner remaining: " + tonerLevel + " %");
    }

    public void showCurrentDuplexMode() {
        if (duplexPrinter) {
            System.out.println("Duplex mode is turn on");
        } else {
            System.out.println("Duplex mode is turn off");
        }


    }
}
