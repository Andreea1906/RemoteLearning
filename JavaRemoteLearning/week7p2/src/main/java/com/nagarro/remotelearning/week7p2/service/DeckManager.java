package com.nagarro.remotelearning.week7p2.service;

import com.nagarro.remotelearning.week7p2.model.Card;

import java.util.Random;

public class DeckManager {

    private final Random random;

    public DeckManager() {
        random = new Random();
    }

    public Card[] generateDeck() {
        Card[] deck = new Card[52];
        int index = 0;
        for (int number = 1; number <= 13; number++) {
            for (String suite : new String[]{"Hearts", "Diamonds", "Clubs", "Spades"}) {
                deck[index++] = new Card(number, suite);
            }
        }
        return deck;
    }

    public void shuffle(Card[] cards) {
        for (int i = cards.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            Card temp = cards[index];
            cards[index] = cards[i];
            cards[i] = temp;
        }
    }
}
