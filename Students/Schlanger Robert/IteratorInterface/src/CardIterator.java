import java.util.NoSuchElementException;

public class CardIterator implements OrderedIterator {
	private Card[] cardArray;
	private int current = 0;
	private int hasNextCalls = 0;
	private int removeCalls = 0;

	public CardIterator(Card[] cardArray) {
		this.cardArray = cardArray;
	}

	@Override
	public boolean hasNext() {
		if (current < cardArray.length) {
			hasNextCalls++;
			return true;
		}
		return false;
	}

	@Override
	public Card next() {
		removeCalls = 0;
		if (!hasNext()) {
			throw new NoSuchElementException();
		} else {
			return cardArray[current++];
		}
	}

	@Override
	public void remove() {
		removeCalls++;
		if (hasNextCalls == 0 || removeCalls > 1) {
			throw new IllegalStateException();
		} else {
			this.cardArray = removeElement(current - 1);
		}
	}

	@Override
	public void put(Comparable comparableItem) {
		this.cardArray = insertCardAscending(comparableItem);
	}

	public void resetIterator() {
		this.current = 0;
		this.hasNextCalls = 0;
		this.removeCalls = 0;
	}

	private Card[] insertCardAscending(Comparable comparableItem) {
		Card[] newCardArray = new Card[cardArray.length + 1];

		int cardArrayIndex = 0;
		boolean itemInserted = false;
		for (int newCardArrayIndex = 0; newCardArrayIndex < newCardArray.length; newCardArrayIndex++) {
			if (((Card) comparableItem).compareTo(cardArray[cardArrayIndex]) < 0 && !itemInserted) {
				newCardArray[newCardArrayIndex] = ((Card) comparableItem);
				itemInserted = true;
			} else {
				newCardArray[newCardArrayIndex] = cardArray[cardArrayIndex];
				cardArrayIndex++;
			}
		}

		return newCardArray;
	}

	private Card[] removeElement(int index) {
		Card[] newCardArray = new Card[cardArray.length - 1];

		int cardArrayIndex = 0;
		for (int newCardArrayIndex = 0; newCardArrayIndex < newCardArray.length; newCardArrayIndex++) {
			if (cardArrayIndex != index) {
				newCardArray[newCardArrayIndex] = cardArray[cardArrayIndex];
			} else {
				newCardArrayIndex--;
			}
			cardArrayIndex++;
		}
		return newCardArray;
	}

}
