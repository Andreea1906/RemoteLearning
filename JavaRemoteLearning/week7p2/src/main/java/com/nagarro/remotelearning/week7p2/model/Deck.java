package com.nagarro.remotelearning.week7p2.model;

public class Deck {
    private final Card[] cards;

    public Deck(Card[] cards) {
        this.cards = cards;
    }

    public Card[] getCards() {
        return cards;
    }
}

