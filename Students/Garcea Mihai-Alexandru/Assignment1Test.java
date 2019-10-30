import org.junit.Assert;
import org.junit.Test;

public class Assignment1Test {
	@Test
	public void testNameInventer(){
		Assert.assertEquals(null,Assignment1.nameInventer(null));
		Assert.assertEquals(" ",Assignment1.nameInventer(" "));
		Assert.assertEquals("SingleWord",Assignment1.nameInventer("SingleWord"));
		Assert.assertEquals("Garcea, Alex",Assignment1.nameInventer("Alex Garcea"));
		Assert.assertEquals("SingleWord",Assignment1.nameInventer("  SingleWord      "));
		Assert.assertEquals("Garcea, Alex",Assignment1.nameInventer("  Alex Garcea    "));
		Assert.assertEquals("Garcea, Alex",Assignment1.nameInventer("    Alex   Garcea "));
		Assert.assertEquals("Garcea, Alex Mr.",Assignment1.nameInventer("Mr. Alex Garcea"));
		Assert.assertEquals("Brehar, Raluca Mrs.",Assignment1.nameInventer("Mrs. Raluca Brehar"));
		Assert.assertEquals("Garcea, Alex Mr. Phd.",Assignment1.nameInventer("Mr. Phd. Alex Garcea"));
		Assert.assertEquals("Brehar, Raluca Mrs. Phd.",Assignment1.nameInventer("Mrs. Phd. Raluca Brehar"));
	}
}
