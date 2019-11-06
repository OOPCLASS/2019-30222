
public class NameInverter {
	
	public static final String TITLE1="Mr.";
	public static final String TITLE2="Mrs.";
	public static final String TITLE3="Phd.";
	
	public static void main(final String[] args )
	{
		System.out.println (Inversion("alfred george")+"\n");
		System.out.println (Inversion("alfred      george")+"\n");
		System.out.println (Inversion("  alfred   george  ")+"\n");
		System.out.println (Inversion("alfredgeorge")+"\n");
		System.out.println (Inversion("  alfredgeorge  ")+"\n");
		
		System.out.println (Inversion("  Mr.  Gabriel   Calin  ")+"\n");
		System.out.println (Inversion(" Mr. Phd.  Gabriel   Calin ")+"\n");
		System.out.println (Inversion("Phd.  Gabriel   Calin ")+"\n");
		System.out.println (Inversion(" Mrs. Phd.  Gabriela  Popescu ")+"\n");
		System.out.println (Inversion("")+"7\n");
		System.out.println (Inversion(null)+"\n");
	}
	public static String Inversion (String phrase)
	{
		if(phrase==null)
			return null;
		String LastFirst;
		LastFirst=phrase.trim();

		int i=LastFirst.indexOf(TITLE1);
		int length=TITLE1.length();
		if(i!=-1)
		{
			LastFirst=LastFirst.substring(i+length);
			LastFirst=LastFirst.trim();
			LastFirst=LastFirst+" "+TITLE1;
		}
		 i=LastFirst.indexOf(TITLE2);
		 length=TITLE2.length();
		if(i!=-1)
		{
			LastFirst=LastFirst.substring(i+length);
			LastFirst=LastFirst.trim();
			LastFirst=LastFirst+" "+TITLE2;
		}
		 i=LastFirst.indexOf(TITLE3);
		 length=TITLE3.length();
		if(i!=-1)
		{
			LastFirst=LastFirst.substring(i+length);
			LastFirst=LastFirst.trim();
			LastFirst=LastFirst+" "+TITLE3;
		}
		
		i=LastFirst.indexOf(" ");
		if(i!=-1)
		{
			String First=LastFirst.substring(0,i);
			LastFirst=LastFirst.substring(i);
			LastFirst=LastFirst.trim();
			
			String Last;
			i=LastFirst.indexOf(" ");
			if(i!=-1)
			{
				Last=LastFirst.substring(0,i);
				LastFirst=LastFirst.substring(i);
				LastFirst=LastFirst.trim();
			}
			else {
				    Last=LastFirst;
			        LastFirst="";
			     }
			LastFirst=Last+", "+First+" "+LastFirst;
			
		}
		return LastFirst;
			
	    
		
	}

}
