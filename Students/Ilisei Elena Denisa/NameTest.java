import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NameTest {

	@Test
	public void test() {
		assertEquals(null, Name.nameInverter(null));
		assertEquals("", Name.nameInverter(""));
		assertEquals("SingleWord", Name.nameInverter("SingleWord"));
		assertEquals("LastName, FirstName", Name.nameInverter("FirstName LastName"));
		assertEquals("SingleWord", Name.nameInverter("  SingleWord   "));
		assertEquals("LastName, FirstName", Name.nameInverter("  FirstName     LastName   "));
		assertEquals("LastName, FirstName Mr. Phd.", Name.nameInverter("Mr. Phd. FirstName LastName"));
		assertEquals("LastName, FirstName Mr. Phd.", Name.nameInverter("Mr. Phd. FirstName    LastName    "));
		assertEquals("LastName, FirstName Mr.", Name.nameInverter("Mr. FirstName LastName"));
		assertEquals("LastName, FirstName Mrs.", Name.nameInverter("Mrs. FirstName LastName"));
	}

}
