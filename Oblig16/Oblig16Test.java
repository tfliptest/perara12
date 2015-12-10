

import org.junit.Assert;
import org.junit.Test;


public class Oblig16Test {

	@Test
	public void test() {
		Oblig16 vk = new Oblig16();
		Assert.assertEquals(769.23, vk.konverterFraEuro(100, "kroner"),0.02);
	}
	
	@Test
	public void testSegSelv() {
		Oblig16 vk = new Oblig16();
		double nok = 100;
		Assert.assertEquals(nok, vk.konverter(nok, "kroner", "kroner"),0.0);
		
	}

}
