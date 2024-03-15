package com.nagarro.remotelearning.week7p2.service;

import com.nagarro.remotelearning.week7p2.model.Card;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class DeckManagerTest {

    private DeckManager deckManager;
    private Card[] deck;

    @Before
    public void setUp() {
        deckManager = new DeckManager();
        deck = DeckManager.generateDeck();
    }

    @Test
    public void generateDeck() {
        assertNotNull(deck);
        assertEquals(52, deck.length);
    }

    @Test
    public void shuffle() {
        Card[] originalDeck = deck.clone();

        deckManager.shuffle(deck);

        assertNotNull(deck);
        assertEquals(originalDeck.length, deck.length);

        boolean isShuffled = false;
        for (int i = 0; i < deck.length; i++) {
            if (originalDeck[i] != deck[i]) {
                isShuffled = true;
                break;
            }
        }
        assertTrue(isShuffled);
    }
}