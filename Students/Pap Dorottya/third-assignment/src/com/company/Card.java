package com.company;

import java.util.Arrays;
import java.util.List;

public class Card implements Comparable<Card> {
    public Suit suit;
    public CardNumber number;

    public Card(Suit suit, CardNumber number) {
        this.suit = suit;
        this.number = number;
    }

    @Override
    public int compareTo(Card card) {
        return this.getPos() < card.getPos() ? -1 : 1;
    }

    public int getPos() {
        int pos = 0;

        if (this.suit == Suit.HEARTS) {
            pos += 100;
        } else if (this.suit == Suit.DIAMONDS) {
            pos += 200;
        } else if (this.suit == Suit.SPADES) {
            pos += 300;
        } else if (this.suit == Suit.CLUBS) {
            pos += 400;
        }

        if (this.number == CardNumber.ACE) {
            pos += 1;
        } else if (this.number == CardNumber.TWO) {
            pos += 2;
        } else if (this.number == CardNumber.THREE) {
            pos += 3;
        } else if (this.number == CardNumber.FOUR) {
            pos += 4;
        } else if (this.number == CardNumber.FIVE) {
            pos += 5;
        } else if (this.number == CardNumber.SIX) {
            pos += 6;
        } else if (this.number == CardNumber.SEVEN) {
            pos += 7;
        } else if (this.number == CardNumber.EIGHT) {
            pos += 8;
        } else if (this.number == CardNumber.NINE) {
            pos += 9;
        } else if (this.number == CardNumber.TEN) {
            pos += 10;
        } else if (this.number == CardNumber.JACK) {
            pos += 11;
        } else if (this.number == CardNumber.QUEEN) {
            pos += 12;
        } else if (this.number == CardNumber.KING) {
            pos += 13;
        }

        return pos;
    }

    public String toString() {
        return "Card: " + this.suit + " " + this.number;
    }

    public static enum Suit {
        HEARTS("hearts"),
        DIAMONDS("diamonds"),
        SPADES("spades"),
        CLUBS("clubs");

        private String type;

        Suit(String type) {
            this.type = type;
        }

        public static List<Suit> list() {
            return Arrays.asList(Card.Suit.values());
        }
    }

    public static enum CardNumber {
        ACE("A"),
        TWO("2"),
        THREE("3"),
        FOUR("4"),
        FIVE("5"),
        SIX("6"),
        SEVEN("7"),
        EIGHT("8"),
        NINE("9"),
        TEN("10"),
        JACK("J"),
        QUEEN("Q"),
        KING("K");

        private String number;

        CardNumber(String number) {
            this.number = number;
        }

        public static List<CardNumber> list() {
            return Arrays.asList(Card.CardNumber.values());
        }
    }
}
