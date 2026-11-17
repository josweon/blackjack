package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {

    @org.junit.jupiter.api.Test
    void getValue() {
        Card test_valueOfCard = new Card("Hearts", "j");
        test_valueOfCard.flip();

        String expected = "#";
        String actual = test_valueOfCard.getValue();

        assertEquals(expected, actual);
    }

    @Test
    void getPointValue() {
        Card test_PointValue = new Card("Spades", "A");
        test_PointValue.flip();

        int expected = 11;
        int actual = test_PointValue.getPointValue();

        assertEquals(expected, actual);
    }
}