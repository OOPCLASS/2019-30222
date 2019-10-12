package tema2_nume_prenume;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TemaTest {
	
	@Test
	public void testName_Inventer () {
		Assert.assertEquals("LastName, FirstName Mr. Phd.",Tema.name_inventer("Mr. Phd. FirstName LastName"));
		Assert.assertEquals("LastName, FirstName Mr. Phd.",Tema.name_inventer("Mr. Phd. FirstName LastName            "));
		Assert.assertEquals("LastName, FirstName Mr. Phd.",Tema.name_inventer("Mr. Phd. FirstName      LastName     "));
		Assert.assertEquals("LastName, FirstName Mr. Phd.",Tema.name_inventer("Mr.         Phd.      FirstName LastName   "));
		Assert.assertEquals("LastName, FirstName Mr. Phd.",Tema.name_inventer("     Mr. Phd. FirstName      LastName   "));
		Assert.assertEquals("LastName, FirstName Mr. Phd.",Tema.name_inventer("Mr.       Phd.       FirstName      LastName"));
		Assert.assertEquals("LastName, FirstName Mr. Phd.",Tema.name_inventer("        Mr.      Phd.      FirstName      LastName      "));
		 
}
}
