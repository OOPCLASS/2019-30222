package tema2_nume_prenume;

public class Tema {
	

	public static String name_inventer(String name) {
		name = name.trim();
		name = name.replaceAll("\\s+"," ");
		String[] parts = name.split(" ");
		String name_final;
		name_final = parts[parts.length-1]+", "+parts[parts.length-2];
		for(int i=0;i<parts.length-2;i++)
			name_final = name_final +" "+parts[i];
		return name_final;
	
	}
	
	public static void main(String[] args) {
		System.out.println(name_inventer("         Mr.        Phd.            FirstName         LastName       "));
	}

}
