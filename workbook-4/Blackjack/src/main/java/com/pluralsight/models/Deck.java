package com.pluralsight.models;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> cards;

    public Deck() {
        // build the deck of cards
        cards = new ArrayList<>();

        String[] faces = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};

        for (String suit : suits) {
            for (String face : faces) {
                Card card = new Card(suit, face);
                cards.add(card);
            }
        }
    }

    public int getCardCount() {
        return cards.size();
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card drawCard() {
        if (cards.isEmpty()) {
            return null; // No cards left in the deck
        }
        return cards.remove(0); // Draw the top card from the deck
    }
}
