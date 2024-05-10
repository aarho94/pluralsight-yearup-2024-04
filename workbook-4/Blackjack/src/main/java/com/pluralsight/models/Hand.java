package com.pluralsight.models;

import java.util.ArrayList;
import java.util.List;

public class Hand {
    private List<Card> cards;

    public Hand() {
        cards = new ArrayList<>();
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public void clear() {
        cards.clear();
    }

    public int getHandValue() {
        int value = 0;
        boolean hasAce = false;

        for (Card card : cards) {
            int cardValue = card.getPointValue();
            if (cardValue == 1) { // Ace
                hasAce = true;
            }
            value += cardValue;
        }

        if (hasAce && value <= 11) {
            value += 10;
        }

        return value;
    }

    public List<Card> getCards() {
        return cards;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Card card : cards) {
            sb.append(card).append("\n");
        }
        return sb.toString();
    }
}
