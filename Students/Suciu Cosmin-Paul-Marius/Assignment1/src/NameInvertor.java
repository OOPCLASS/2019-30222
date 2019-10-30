
public class NameInvertor {

	public static void main(String[] args) {
		System.out.println(inverter("   Mr. Phd.  Suciu     Cosmin     "));
	}

	public static String inverter(String name) {
		if (name == null) {
			return null;
		}
		name = name.replaceAll("\\s+", " ");
		String titles = "";
		if (name.contains("Mr.")) {
			titles = "Mr.";
			name = name.replace("Mr.", "");
		}
		if (name.contains("Mrs.")) {
			titles = "Mrs.";
			name = name.replace("Mrs.", "");
		}
		if (name.contains("Phd.")) {
			titles = titles + " Phd.";
			name = name.replace("Phd.", "");
		}
		String[] nameSplit = name.split(" ");
		String finalName = "";
		for (int i = 0; i < nameSplit.length; i++) {
			finalName = nameSplit[i] + " " + finalName;
		}
		finalName = finalName.trim();
		finalName = finalName + " " + titles;
		finalName = finalName.trim();
		finalName = finalName.replaceFirst(" ", ", ");
		return finalName;
	}

}
