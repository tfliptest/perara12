import static org.junit.Assert.*;

import org.junit.Test;


public class Oblig16Test {

	Oblig16GUI k = new Oblig16GUI();
	
	@Test 
	public void test(){
		double NOK = k.Konverterer(1, "Kroner", "Dollar");
		if(NOK !=0.131)
			fail();
			}
	
	@Test 
	public void test1(){
		double USD = k.Konverterer(1, "Dollar", "Yen");
		if(USD !=119.085)
			fail();
			}
		
	@Test 
	public void test2(){
		double YEN = k.Konverterer(1, "Yen", "Kroner");
		if(YEN !=0.064)
			fail();
			}
		
	@Test 
	public void test3(){
		double EURO = k.Konverterer(1, "Euro", "Dollar");
		if(EURO !=1.1328)
			fail();
	}

}
