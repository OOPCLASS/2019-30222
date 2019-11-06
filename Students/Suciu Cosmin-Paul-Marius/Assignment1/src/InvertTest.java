import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InvertTest {

	@Test
	void test() {
		assertEquals(null, NameInvertor.inverter(null));
		assertEquals("", NameInvertor.inverter(" "));
		assertEquals("", NameInvertor.inverter(""));
        assertEquals("SingleWord", NameInvertor.inverter("                SingleWord        "));
        assertEquals("SingleWord", NameInvertor.inverter("SingleWord"));
        assertEquals("Lastname, Firstname", NameInvertor.inverter("Firstname Lastname"));
        assertEquals("Lastname, Firstname", NameInvertor.inverter("    Firstname     Lastname        "));
        assertEquals("Lastname, Firstname Mrs.", NameInvertor.inverter("  Firstname    Lastname Mrs.     "));
        assertEquals("Lastname, Firstname Mr. Phd.", NameInvertor.inverter("    Mr.      Phd.       Firstname     Lastname"));   
	}

}
