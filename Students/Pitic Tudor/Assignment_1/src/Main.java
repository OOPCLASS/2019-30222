
public class Main {

	public static final String dot = ".";

	public static void main(String args[]) {
		String str = "Mr.        Phd.        FirstName        LastName       ";
		System.out.println(nameInvertor(str));
	}

	public static String nameInvertor(String str) {
		if (str == null) {
			return null;
		}
		String invertedName;
		String name = "";
		String title = "";
		String[] words = str.split("\\s+");

		for (String word : words) {
			if (word.contains(dot)) {
				title = title + " " + word;
			} else if (name == "") {
				name += word;
			} else {
				name = word + " " + name;
			}
		}
		name = name.replaceFirst(" ", ", ");
		invertedName = name + title;
		return invertedName;
	}
}
