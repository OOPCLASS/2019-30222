
public class NameInverter {

	private static final String titleDelimiter = ".";

	public static void main(String[] args) {

	}

	public static String invertName(String name) {
		if (name == null) {
			return null;
		}
		String title = "";
		String titleLessName = "";
		String[] words = name.split("\\s+");
		for (String word : words) {
			if (word.contains(titleDelimiter)) {
				title += " " + word;
			} else {
				titleLessName = word + " " + titleLessName;
			}
		}
		titleLessName = titleLessName.trim();
		titleLessName = titleLessName.replaceFirst(" ", ", ");
		String invertedName = titleLessName + title;
		return invertedName;
	}

}
