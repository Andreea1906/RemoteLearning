package com.nagarro.remotelearning.week7p2.model;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class DeckTest {
    @Test
    public void testShuffle() {
        // Create a deck
        Deck deck = new Deck();

        Card[] originalDeck = deck.getCards().clone();

        deck.shuffle();

        Card[] shuffledDeck = deck.getCards();

        assertFalse("The deck is not shuffled", Arrays.equals(originalDeck, shuffledDeck));
    }

}