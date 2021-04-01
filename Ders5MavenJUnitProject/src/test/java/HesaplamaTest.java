
import org.junit.*;
import org.junit.Test;

public class HesaplamaTest {

	@Test
	public void testToplama() {
		
		int asilSonuc = Hesaplama.toplama(2,2);
		Assert.assertEquals(4, asilSonuc);
		

	}
	@Test
	public void testCikarma() {
		
		int asilSonuc = Hesaplama.cikarma(4,2);
		Assert.assertEquals(2, asilSonuc);
		

	}
	@Test
	public void testBolme() {
		
		int asilSonuc = Hesaplama.bolme(4,2);
		Assert.assertEquals(2, asilSonuc);
		

	}
	@Test
	public void testCarpma() {
		
		int asilSonuc = Hesaplama.carpma(2,2);
		Assert.assertEquals(4, asilSonuc);
		

	}

}
