package com.pluralsight;

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
}