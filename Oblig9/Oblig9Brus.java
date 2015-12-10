
import java.text.DecimalFormat;


public class Oblig9Brus implements Comparable<Oblig9Brus>{
	private String brusmerke;
	public double points;
	
	public String getBrusmerke() {
		return brusmerke;
	}
	public void setBrusmerke(String brusmerke) {
		this.brusmerke = brusmerke;
	}
	/*public double getPoengsum() {
		return points;
	}
	public void setPoengsum(double poeng) {
		this.points = poeng;
	}*/
	public String toString(){
		DecimalFormat f = new DecimalFormat("##.00");
		return brusmerke + " " + f.format(points)+ " poeng.";
	}
	@Override
	public int compareTo(Oblig9Brus arg0) {
		if(arg0.points==points){
			return 0;
		}
		else if(arg0.points<points){
			return -1;
		}
		return 1;
	}
}

