package com.nagarro.remotelearning.week7p2.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Deck {
        private final Card[] cards;

        public Deck() {
            cards = generateDeck();
        }

        private Card[] generateDeck() {
            Card[] deck = new Card[52];
            int index = 0;
            for (int number = 1; number <= 13; number++) {
                for (String suite : new String[]{"Hearts", "Diamonds", "Clubs", "Spades"}) {
                    deck[index++] = new Card(number, suite);
                }
            }
            return deck;
        }

        public void shuffle() {
            List<Card> cardList = Arrays.asList(cards);
            Collections.shuffle(cardList);
            cardList.toArray(cards);
        }

        public void printDeck() {
            for (Card card : cards) {
                System.out.println(card);
            }
        }

    public Card[] getCards() {
        return cards;
    }
}
