import java.util.Arrays;

public class CardSuites {
	private static final String[] cardSuites = {"diamonds", "clubs", "hearts", "spades"};
	
	public static String getDiamondsSuit() {
		return cardSuites[0];
	}
	
	public static String getClubsSuit() {
		return cardSuites[1];
	}
	
	public static String getHeartsSuit() {
		return cardSuites[2];
	}
	
	public static String getSpadesSuit() {
		return cardSuites[3];
	}
	
	public static boolean isValidSuit(String suit) {
		return Arrays.stream(cardSuites).anyMatch(suit::equals);
	}
}
