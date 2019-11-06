
public class Card implements Comparable {
	private String rank;
	private String suit;

	public Card(String rank, String suit) {
		if (CardRanks.isValidRank(rank) && CardSuites.isValidSuit(suit)) {
			this.rank = rank;
			this.suit = suit;
		} else {
			System.err
					.println("Card(...): invalid values for rank and/or suit, Card initialized as \"2 of diamonds\".");
			this.rank = "2";
			this.suit = CardSuites.getDiamondsSuit();
		}
	}
	
	public String getRank() {
		return rank;
	}
	
	public String getSuit() {
		return suit;
	}

	@Override
	public int compareTo(Comparable comparableObject) {
		if(comparableObject instanceof Card) {
			int result = rank.compareTo(((Card)comparableObject).getRank());
			if(result == 0) {
				return suit.compareTo(((Card)comparableObject).getSuit());
			}
			return result;
		}
		return 0;
	}

}
