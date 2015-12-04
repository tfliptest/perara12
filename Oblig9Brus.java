
public class Oblig9Brus {
	private String brusmerke;

	public String getBrusmerke() {
		return brusmerke;
	}

	public void setBrusmerke(String brusmerke) {
		this.brusmerke = brusmerke;
	} 
	
	private int poengsum;

	public int getPoengsum() {
		return poengsum;
	}

	public void setPoengsum(int poengsum) {
		this.poengsum = poengsum;
	} 
	
	public String toString() {
		return this.brusmerke+" "+ this.poengsum; 
	} 
	
}
