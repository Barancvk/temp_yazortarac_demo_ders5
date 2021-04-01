import static org.junit.Assert.*;

import org.junit.*;
import org.junit.Test;

public class HesaplamaTest {

	@Test
	public void testToplama() {
		
		int asilSonuc = Hesaplama.toplama(2,2);
		Assert.assertEquals(4, asilSonuc);
		
		int asilSonuc2 = Hesaplama.toplama(-2,2);
		Assert.assertEquals(0, asilSonuc2);

	}

}
