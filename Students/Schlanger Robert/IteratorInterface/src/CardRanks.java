import java.util.Arrays;

public class CardRanks {
	private static final String[] cardRanks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
	
	public static boolean isValidRank(String rank) {
		return Arrays.stream(cardRanks).anyMatch(rank::equals);
	}
}
