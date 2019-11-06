import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.Test;

public class CardIteratorTest {

	@Test
	public void cardIteratorTest() {
		Card[] cardArray = { new Card("2", CardSuites.getClubsSuit()), new Card("3", CardSuites.getClubsSuit()),
				new Card("4", CardSuites.getClubsSuit()), new Card("5", CardSuites.getClubsSuit()),
				new Card("6", CardSuites.getClubsSuit()), new Card("7", CardSuites.getClubsSuit()),
				new Card("8", CardSuites.getClubsSuit()), new Card("9", CardSuites.getClubsSuit()),
				new Card("10", CardSuites.getClubsSuit()), new Card("J", CardSuites.getClubsSuit()),
				new Card("Q", CardSuites.getClubsSuit()), new Card("K", CardSuites.getClubsSuit()),
				new Card("A", CardSuites.getClubsSuit()) };

		String cardArrayString = "2345678910JQKA";
		String cardIteratorString = "";

		CardIterator cardIterator = new CardIterator(cardArray);

		assertThrows(IllegalStateException.class, () -> {
			cardIterator.remove();
		});

		while (cardIterator.hasNext()) {
			cardIteratorString = cardIteratorString + cardIterator.next().getRank();
		}

		assertThrows(NoSuchElementException.class, () -> {
			cardIterator.next();
		});

		assertEquals(cardArrayString, cardIteratorString);
		cardIterator.resetIterator();
		cardIteratorString = "";
		while (cardIterator.hasNext()) {
			cardIteratorString = cardIteratorString + cardIterator.next().getRank();
		}
		assertEquals(cardArrayString, cardIteratorString);
		cardIterator.resetIterator();
		while (cardIterator.hasNext()) {
			Card card = cardIterator.next();
			if(card.getRank() == "6") {
				cardIterator.remove();
			}
		}
		cardIterator.resetIterator();
		cardIteratorString =  "";
		while (cardIterator.hasNext()) {
			cardIteratorString = cardIteratorString + cardIterator.next().getRank();
		}
		cardArrayString = "234578910JQKA";
		assertEquals(cardArrayString, cardIteratorString);
		cardIterator.resetIterator();
		cardIterator.next();
		cardIterator.remove();
		assertThrows(IllegalStateException.class, () -> {
			cardIterator.remove();
		});
		
		cardIterator.resetIterator();
		cardIteratorString =  "";
		cardArrayString = "345678910JQKA";
		cardIterator.put(new Card("6", "clubs"));
		while (cardIterator.hasNext()) {
			cardIteratorString = cardIteratorString + cardIterator.next().getRank();
		}
		assertEquals(cardArrayString, cardIteratorString);
		
	}

}
