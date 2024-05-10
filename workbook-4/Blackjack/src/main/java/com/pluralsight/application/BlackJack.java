package com.pluralsight.application;

import com.pluralsight.models.Deck;
import com.pluralsight.models.Hand;

import java.util.ArrayList;

public class BlackJack
{
    Deck deck = new Deck();
    ArrayList<Hand> players = new ArrayList<Hand>();

    public void run()
    {
        players.add(new Hand("Hassan"));

    }
}
