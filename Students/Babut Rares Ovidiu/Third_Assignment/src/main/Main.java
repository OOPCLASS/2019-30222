package main;

public class Main extends Deck {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Card[] cards = new Card[13];
        for (int i = 0; i < 13; i++) {
            cards[i] = new Card();
        }
        cards[0].setNumber("2");
        cards[1].setNumber("3");
        cards[2].setNumber("4");
        cards[3].setNumber("5");
        cards[4].setNumber("6");
        cards[5].setNumber("7");
        cards[6].setNumber("8");
        cards[7].setNumber("9");
        cards[8].setNumber("10");
        cards[9].setNumber("J");
        cards[10].setNumber("Q");
        cards[11].setNumber("K");
        cards[12].setNumber("A");

        deck.put(cards[2]);
        deck.put(cards[3]);
        deck.put(cards[10]);
        deck.put(cards[11]);
        deck.put(cards[8]);
        deck.put(cards[4]);
        deck.put(cards[0]);
        deck.put(cards[12]);
        deck.showDeck();
    }
}
