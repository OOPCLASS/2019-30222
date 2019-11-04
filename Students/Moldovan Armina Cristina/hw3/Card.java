import java.util.Iterator;

public class Card implements Comparable {
	private int cardNumber;
	private String suit;

	public void setNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}

	public int getNumber() {
		return cardNumber;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public String getSuit() {
		return suit;
	}

	@Override
	public boolean compare(Comparable objectToCompareTo) {
		if (objectToCompareTo instanceof Card) {
			Card card = (Card) objectToCompareTo;
			if (this.suit == card.getSuit() && this.cardNumber == card.getNumber()) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "suit:" + this.getSuit() + " cardNumber:" + this.getNumber() + "\n";
	}
}
