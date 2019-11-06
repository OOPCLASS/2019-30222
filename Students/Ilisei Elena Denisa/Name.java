
public class Name {

	public static String nameInverter(String str) {
		if (str == null) {
			return null;
		} else {
			String newStr = str.replaceAll("\\s+", " ");
			newStr = newStr.trim();
			String wordsArr[] = newStr.split(" ");
			String result = "";
			int length = wordsArr.length;
			if (length == 1) {     //Single word
				result = wordsArr[0];
			} else {
				if (length > 3) {     //More than 3 words
					for (int i = 0; i < length - 2; i++) {   //Keep the order of titles
						result = result + wordsArr[i] + " ";
					}
					result = wordsArr[length - 1] + ", " + wordsArr[length - 2] + " " + result;
					result = result.trim();
				} else {       
					for (int i = length - 1; i >= 0; i--) {
						if (i == length - 1) {
							result = wordsArr[i] + "," + result;
						} else {
							result = result + " " + wordsArr[i];
						}
					}
				}
			}
			return result;
		}
	}

	public static void main(String[] args) {
		String s = "Mr. FirstName LastName";
		System.out.println(nameInverter(s));

	}

}
