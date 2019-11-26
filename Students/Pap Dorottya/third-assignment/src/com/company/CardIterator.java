package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

public class CardIterator implements OrderedIterator<Card> {
    ArrayList<Card> cards = new ArrayList<Card>();
    Iterator<Card> iterator;

    public CardIterator() {
        Card.Suit.list().forEach((Card.Suit suit) -> {
            Card.CardNumber.list().forEach((Card.CardNumber number) -> {
                this.cards.add(new Card(suit, number));
            });
        });
        iterator = cards.iterator();
    }

    @Override
    public boolean hasNext() {
        return this.iterator.hasNext();
    }

    @Override
    public Card next() {
        return this.iterator.next();
    }

    @Override
    public void remove() {
        this.iterator.remove();
    }

    @Override
    public int put(Card newCard) {
        AtomicBoolean found = new AtomicBoolean(false);

        this.cards.forEach(c -> {
            if (c.getPos() == newCard.getPos() ) {
                found.set(true);
            }
        });

        if (!found.get()) {
            this.cards.add(newCard);
            this.cards.sort(Card::compareTo);

            return 1;
        }
        return 0;
    }

    public void print() {
        this.cards.forEach(c -> System.out.println(c));

    }
}
