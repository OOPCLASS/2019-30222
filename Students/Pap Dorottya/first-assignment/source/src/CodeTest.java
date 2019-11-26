import org.junit.Assert;
import org.junit.Test;

class CodeTest {
    @Test
    public void testNameInventer() throws Exception {
        Assert.assertEquals(null, Code.nameInverter(null));
        Assert.assertEquals(" ", Code.nameInverter(" "));
        Assert.assertEquals("SingleWord", Code.nameInverter("SingleWord"));
        Assert.assertEquals("LastName, FirstName Mr. Phd.", Code.nameInverter("Mr. Phd. FirstName LastName"));
        Assert.assertEquals("LastName, FirstName Mr. Phd.", Code.nameInverter("Mr. Phd. FirstName LastName            "));
        Assert.assertEquals("LastName, FirstName Mr. Phd.", Code.nameInverter("Mr. Phd. FirstName      LastName     "));
        Assert.assertEquals("LastName, FirstName Mr. Phd.", Code.nameInverter("        Mr.      Phd.      FirstName      LastName      "));

    }
}