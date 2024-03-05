package com.nagarro.remotelearning.week7p2.model;

public class Card {
    private final int number;
    private final String suite;

    public Card(int number, String suite) {
        this.number = number;
        this.suite = suite;
    }

    @Override
    public String toString() {
        return numberToString(number) + " of " + suite;
    }

    private String numberToString(int number) {
        switch (number) {
            case 1:
                return "Ace";
            case 11:
                return "Jack";
            case 12:
                return "Queen";
            case 13:
                return "King";
            default:
                return String.valueOf(number);
        }
    }

}
