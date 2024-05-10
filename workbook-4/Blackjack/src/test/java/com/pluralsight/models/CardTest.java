package com.pluralsight.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardTest
{

    @Test
    public void getColor_shouldReturnRed_forHearts()
    {
        // arrange
        Card card = new Card( "Hearts", "Q");

        // act
        String color = card.getColor();

        // assert
        String expectedColor = "Red";
        assertEquals(expectedColor, color, "Because the card is a Queen of Hearts");
    }

    @Test
    public void getPoint_shouldReturn_forAce()
    {
        // arrange
        Card card = new Card( "Hearts", "8");

        // act
        int pointValue = card.getPointValue();

       // assert
        int expectedPointValue = 8;
        assertEquals (expectedPointValue, pointValue, "Because the card is a 8 of Hearts");

    }
}