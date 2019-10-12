package tema2_nume_prenume;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TemaTest {
	
	@Test
	public void testName_Inventer () {
		Assert.assertEquals(null,Tema.name_inventer(null));
		Assert.assertEquals("",Tema.name_inventer(""));
		Assert.assertEquals("LastName",Tema.name_inventer("LastName"));
		Assert.assertEquals("LastName",Tema.name_inventer("   LastName   "));
		Assert.assertEquals("LastName, FirstName",Tema.name_inventer("  FirstName      LastName     "));
		Assert.assertEquals("LastName, FirstName Mr.",Tema.name_inventer("Mr.           FirstName LastName   "));
		Assert.assertEquals("LastName, FirstName Mr. Phd.",Tema.name_inventer("        Mr.      Phd.      FirstName      LastName      "));
		 
}
}
