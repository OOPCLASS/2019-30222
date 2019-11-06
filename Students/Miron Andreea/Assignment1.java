
public class Assignment1 {
	public String string;

	public Assignment1(String s) {
		string = s;
	}

	public static String doChanges(String s) {
		String strTrim = s.trim();
		String newString, FirstName, LastName, Pronoun;
		int positionOfWhitespace;

		if (s == null)
			return null;

		else if (s.equals(" "))
			return s;

		else if (strTrim.contains(" ") == false) // case single word
			return strTrim;

		else if (strTrim.charAt(2) != '.' && strTrim.charAt(3) != '.') { // case multiple words
			// without titles
			positionOfWhitespace = strTrim.indexOf(" ");
			LastName = strTrim.substring(0, positionOfWhitespace);
			FirstName = strTrim.substring(positionOfWhitespace + 1);
			newString = FirstName + ", " + LastName;
			return newString;
		}

		else {
			int firstApOfPoint = strTrim.indexOf('.');
			int secondApOfPoint = strTrim.lastIndexOf('.');

			if (firstApOfPoint == secondApOfPoint)// case title is just Mr or Mrs
			{
				positionOfWhitespace = strTrim.indexOf(' ');
				int anotherPosition = strTrim.lastIndexOf(' ');
				Pronoun = strTrim.substring(0, positionOfWhitespace);
				FirstName = strTrim.substring(positionOfWhitespace + 1, anotherPosition);
				LastName = strTrim.substring(anotherPosition + 1);

				newString = LastName + ", " + FirstName + " " + Pronoun;
				return newString;
			} else {
				/// case multiple words + two titles
				positionOfWhitespace = strTrim.indexOf(' ');
				int nextPosition = strTrim.indexOf(' ', positionOfWhitespace + 1);
				int lastPosition = strTrim.lastIndexOf(' ');
				Pronoun = strTrim.substring(0, nextPosition);
				FirstName = strTrim.substring(nextPosition + 1, lastPosition);
				LastName = strTrim.substring(lastPosition + 1);
				newString = LastName + ", " + FirstName + " " + Pronoun;
				return newString;
			}

		}
	}

	public static void main(String[] args) {
		String oldString = "Mrs. Miron Andreea ";
		System.out.println(doChanges(oldString));
	}

}
