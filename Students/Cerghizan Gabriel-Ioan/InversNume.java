

public class InversNume {

	public static void main(String[] args) {
		
		inversare("Mrs. Phd. FirstName LastName");
		inversare(" ");
		inversare("FirstName LastName  ");
		inversare("Mr. FirstName LastName");
		inversare("Name");
	}
	
	public static void inversare(String sir ) {
		String str=null;
		String nr[]=sir.split("\\s+");
		if(sir.trim().length()>0) {
			str=sir.trim();
		}
		if(str==null) {
			System.out.println("\"\"");
		}
		else {
			if(str!=null && str.indexOf(" ")==-1 ) {
				System.out.println(str);
			}
		else {
			if(nr.length==3) {
				String[] cuvinte= str.split("\\s+");
				System.out.println(cuvinte[2]+","+cuvinte[1] +" "+ cuvinte[0]);
				}
					else {
						String[] cuvinte2=str.split("\\s+");
						if(cuvinte2.length>3) {
							System.out.println(cuvinte2[3]+","+cuvinte2[2]+" "+cuvinte2[0]+" "+cuvinte2[1]);
					}
			
			else {
				System.out.println(nr[1]+","+nr[0]);
						}
					}
			}
		}
	}
		
		
}

