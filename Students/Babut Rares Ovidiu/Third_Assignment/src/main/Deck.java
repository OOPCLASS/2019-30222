package main;

import java.util.*;

public class Deck implements OrderedIterator {
    private Card[] cards = new Card[13];
    private int i = -1;   //position of current card
    private int length = 0;

    @Override
    public boolean hasNext() {
        if (i < length - 1)
            return true;
        return false;
    }

    @Override
    public Card next() {
        i++;
        return cards[i];

    }

    @Override
    public void remove() {
        for (int k = i; k < length - 1; k++)
            cards[k].setNumber(cards[k + 1].getNumber());
        length--;
    }

    public void showDeck() {
        for (int j = 0; j < length; j++) {
            System.out.print(cards[j].getNumber() + " ");
        }
    }

    @Override
    public int put(Comparable comparable) {
        if (length == 0) {
            cards[length] = new Card();
            cards[length].setNumber(comparable.getNumber());
            length++;
            return 1;
        } else {
            for (int j = 0; j < length; j++) {
                if (cards[j].compareTo(comparable) == 0)
                    return 0;
                if (cards[j].compareTo(comparable) > 0) {
                    length++;
                    cards[length - 1] = new Card();
                    for (int k = length - 1; k > j; k--) {
                        cards[k].setNumber(cards[k - 1].getNumber());
                    }
                    cards[j].setNumber(comparable.getNumber());
                    return 1;
                }

            }
            cards[length] = new Card();
            cards[length].setNumber(comparable.getNumber());
            length ++;
            return 1;
        }
    }
}