package com.pluralsight;

import com.pluralsight.models.Card;
import com.pluralsight.models.Deck;

public class Main
{
    public static void main(String[] args)
    {
        Deck deck = new Deck();
        System.out.println(deck.getCardCount());

        Card card = deck.takeCard();
        System.out.println(card.getFaceValue() + " of " + card.getSuit());

        System.out.println(deck.getCardCount());
    }
}