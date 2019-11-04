import java.util.Iterator;

public class ImplementIterator implements Iterator {
	private String cards[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "A" };
	private int position = 0;

	public String[] getCards() {
		return this.cards;
	}

	public boolean hasNext() {
		if (this.position < this.cards.length) {
			return true;
		}

		return false;
	}

	public String next() {
		if (this.hasNext()) {
			return this.cards[this.position++];
		}

		return null;
	}

	@Override
	public void remove() {

	}
}
