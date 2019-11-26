package com.company;

import static org.junit.Assert.*;

public class CardIteratorTest {

    @org.junit.Test
    public void put() {
        CardIterator cardIterator = new CardIterator();

        cardIterator.next();
        cardIterator.next();
        cardIterator.remove();
        assertEquals(cardIterator.put(new Card(Card.Suit.HEARTS, Card.CardNumber.TWO)), 1);
        assertEquals(cardIterator.put(new Card(Card.Suit.HEARTS, Card.CardNumber.TWO)), 0);
    }
}