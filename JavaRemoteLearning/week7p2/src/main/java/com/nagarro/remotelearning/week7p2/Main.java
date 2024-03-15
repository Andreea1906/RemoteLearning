package com.nagarro.remotelearning.week7p2;

import com.nagarro.remotelearning.week7p2.model.Card;
import com.nagarro.remotelearning.week7p2.model.Deck;
import com.nagarro.remotelearning.week7p2.service.DeckManager;

public class Main {
    public static void main(String[] args) {
        DeckManager deckManager = new DeckManager();
        Card[] deck = deckManager.generateDeck();
        Deck myDeck = new Deck(deck);

        deckManager.shuffle(deck);

        Card[] shuffledCards = myDeck.getCards();

        for (Card card : shuffledCards) {
            System.out.println(card);
        }
    }
}
