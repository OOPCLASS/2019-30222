
public class Assignment1 {

	public static void main(String[] args) {
		
	}
	public static String nameInventer(String name) {
		String name1=null;
		if(name==null || name==" " || name.indexOf(' ')==-1){
			name1=name;
		}
		else{
			//pentru cazurile Mr./Mrs., cu sau fara Phd., am considerat ca nu sunt mai multe spatii alaturate
			//asa cred ca e si in exemplu, nu sunt sigur
			if(name.indexOf("Phd.")!=-1){
				name1=name.substring(name.lastIndexOf(" ")+1)+", "+name.substring(name.indexOf(" ", 5)+1, name.lastIndexOf(" "));
				if(name.indexOf("Mrs.")!=-1){
					name1=name1+" Mrs. Phd.";
				}
				else{
					name1=name1+" Mr. Phd.";
				}
			}
			else {
				if(name.indexOf("Mrs.")!=-1) {
					name1=name.substring(name.lastIndexOf(" ")+1)+", "+name.substring(5, name.lastIndexOf(" "))+" Mrs.";
				}
				else if(name.indexOf("Mr.")!=-1) {
					name1=name.substring(name.lastIndexOf(" ")+1)+", "+name.substring(4, name.lastIndexOf(" "))+" Mr.";
				}
				else if(name.startsWith(" ")==false && name.endsWith(" ")==false) {
						name1=name.substring(name.lastIndexOf(" ")+1)+", "+name.substring(0, name.indexOf(" "));
				}
				else {
					name=name.trim();
					if(name.indexOf(" ")==-1) {
						name1=name;
					}
					else {
						name1=name.substring(name.lastIndexOf(" ")+1)+", "+name.substring(0, name.indexOf(" "));
					}
				}
			}
		}
		return name1;
	}
}
