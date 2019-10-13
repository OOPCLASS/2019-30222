
public class ReturnName {
	public String verifyname(String name) {
		if (name == null) {
			return null;
		}
		if (name == "\"\"\"") {
			return "\"" +  "\"";
		}

		name = name.trim();

		String[] newName = name.split("[^a-zA-Z0-9]+");

		String firstWord;
		String secondWord;
		String thirdWord;
		String fourthWord;

		int numberOfWords = newName.length;

		if (numberOfWords == 1) {
			return name;
		}

		firstWord = newName[0];
		secondWord = newName[1];

		if (numberOfWords == 2) {
			return secondWord + ", " + firstWord;
		}

		thirdWord = newName[2];

		if ((firstWord.equals("Mr") || firstWord.equals("Mrs")) && secondWord.equals("Phd")) {
			fourthWord = newName[3];
			return fourthWord + ", " + thirdWord + " " + secondWord + ". " + firstWord + ".";
		}

		return thirdWord + ", " + secondWord + " " + firstWord + ".";
	}

	public static void main(String args[]) {
		ReturnName s = new ReturnName();
		System.out.println(s.verifyname("null"));
		 System.out.println(s.verifyname("\"\"\""));
		System.out.println(s.verifyname("singleword"));
		System.out.println(s.verifyname("FirstName LastName"));
		System.out.println(s.verifyname("  singleword   "));
		System.out.println(s.verifyname("   FirstName  LastName  "));
		System.out.println(s.verifyname("Mr. FirstName  LastName"));
		System.out.println(s.verifyname("Mr. Phd. FirstName LastName"));
	}
}
