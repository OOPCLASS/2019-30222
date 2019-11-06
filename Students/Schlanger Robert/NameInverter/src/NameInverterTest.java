import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class NameInverterTest {

	@Test
	public void testIsClean() {
		assertEquals(null, NameInverter.invertName(null));
		assertEquals("", NameInverter.invertName(""));
		assertEquals("SingleName", NameInverter.invertName("   SingleName     "));
		assertEquals("Lastname, Firstname Mrs. Phd.",
				NameInverter.invertName("  Firstname    Lastname Mrs. Phd.     "));
		assertEquals("Lastname, Firstname", NameInverter.invertName("    Firstname     Lastname        "));
		assertEquals("Lastname, Firstname Mr. Phd.",
				NameInverter.invertName("	Mr.	Phd.	Firstname    Lastname    "));
		assertEquals("", NameInverter.invertName(" "));
		assertEquals("Lastname, Firstname", NameInverter.invertName("Firstname Lastname"));
	}
	
}
