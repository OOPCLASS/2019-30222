
public class Tema1 {
	
	public static String newString (String nameSurname) {
		
		String surnameName;
		
		if(nameSurname.equals("") || nameSurname == null || nameSurname.indexOf(' ') < 0 ) {
			surnameName = nameSurname;
		}
		else {
			String splitInWords[] = nameSurname.split("[, ]");
			surnameName = splitInWords[splitInWords.length -1] + ",";
			surnameName =surnameName +" "+ splitInWords[splitInWords.length-2] ; 
			for(int i=0; i<splitInWords.length-2;++i) {
				surnameName=surnameName +" "+splitInWords[i];
			} 

		}
		
		return surnameName;
		
	}
	

	public static void main(String[] args) {
		
		String S1 = Tema1.newString("");
		System.out.println(S1);
		System.out.println();
		
		String S2 = Tema1.newString("Name");
		System.out.println(S2);
		System.out.println();
		
		String S3 = Tema1.newString("Name LastName");
		System.out.println(S3);
		System.out.println();
		
		String S4 = Tema1.newString("Mr. FirstName LastName");
		System.out.println(S4);
		System.out.println();
		
		String S5 = Tema1.newString("Mr. Phd. FirstName LastName");
		System.out.println(S5);
		System.out.println();


	}

}
