public class ImplementIterator2 implements OrderedIterator {
	private Card[] cards = new Card[3];
	private int position = 0;

	@Override
	public boolean hasNext() {
		if (this.position < this.cards.length) {
			return true;
		}

		return false;
	}

	@Override
	public Card next() {
		if (this.hasNext()) {
			return this.cards[this.position++];
		}

		return null;
	}

	@Override
	public boolean put(Comparable comparable) {
		int cardPosition = 0;
		for (int i = 0; i < this.cards.length; i++) {
			if (this.cards[i] == null) {
				break;
			}

			if (this.cards[i].compare(comparable) == true) {
				return false;
			}

			cardPosition++;
		}

		cards[cardPosition] = (Card) comparable;

		return true;
	}
}
