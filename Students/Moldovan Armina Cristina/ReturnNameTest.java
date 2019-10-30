import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReturnNameTest {
	@Test
	void testUseCase1() {
		ReturnName test = new ReturnName();
		assertEquals(null, test.verifyname(null));
	}

	@Test
	void testUseCase2() {
		ReturnName test = new ReturnName();
		assertNotEquals("  singleword   ", test.verifyname("   singleword"));
	}

	@Test
	void testUseCase3() {
		ReturnName test = new ReturnName();
		assertEquals("singleword", test.verifyname("singleword"));
	}

	@Test
	void testUseCase4() {
		ReturnName test = new ReturnName();
		assertNotEquals("firstname lastname", test.verifyname("firstname lastname"));
	}

	@Test
	void testUseCase5() {
		ReturnName test = new ReturnName();
		assertNotEquals(" firstname lastname   ", test.verifyname("lastname firstname"));
	}

	@Test
	void testUseCase6() {
		ReturnName test = new ReturnName();
		assertNotEquals(" firstname lastname   ", test.verifyname("lastname, firstname"));
	}

	@Test
	void testUseCase7() {
		ReturnName test = new ReturnName();
		assertNotEquals("Mr. FirstName  LastName", test.verifyname("FirstName, LastName  Phd.Mr."));
	}
}
