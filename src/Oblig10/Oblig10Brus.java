
public class Oblig10Brus {
	private String Brusmerke;
	private double Poengsum;
	
	public String getBrusmerke() {
		return Brusmerke;
	}
	public void setBrusmerke(String brusmerke) {
		Brusmerke = brusmerke;
	}
	public double getPoengsum() {
		return Poengsum;
	}
	public void setPoengsum(double poengsum) {
		Poengsum = poengsum;
	}
	@Override
	public String toString() {
		return  Brusmerke +  " - "  + Poengsum;
				
	}
	
}
